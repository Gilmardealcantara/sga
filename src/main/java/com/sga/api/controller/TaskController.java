package com.sga.api.controller;

import com.sga.api.exception.ResourceNotFoundException;
import com.sga.api.model.Task;
import com.sga.api.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    TaskRepository taskRepository;

    // Get All Tasks
    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Create a new Task
    @PostMapping("/tasks")
    public Task createTask(@Valid @RequestBody Task task) {
        return taskRepository.save(task);
    }

    // Get a Single Task
    @GetMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable(value = "id") Long taskId) {
        return taskRepository.findById(taskId)
                .orElseThrow(() -> new ResourceNotFoundException("Task", "id", taskId));
    }

    // Update a Task
    @PutMapping("/tasks/{id}")
    public Task updateTask(@PathVariable(value = "id") Long taskId,
                                            @Valid @RequestBody byte[] image) {

        Task task = taskRepository.findById(taskId)
                .orElseThrow(() -> new ResourceNotFoundException("Task", "id", taskId));
        
        task.setPic(image);
        task.setStatus(1);
        
        Task updatedTask = taskRepository.save(task);
        return updatedTask;
    }

    // Delete a Task
    @DeleteMapping("/tasks/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable(value = "id") Long taskId) {
        Task task = taskRepository.findById(taskId)
                .orElseThrow(() -> new ResourceNotFoundException("Task", "id", taskId));

        taskRepository.delete(task);

        return ResponseEntity.ok().build();
    }
    
    // Get a Image
    @GetMapping("/image/{id}")
    public byte[] getImageById(@PathVariable(value = "id") Long taskId) {
    	Task task = taskRepository.findById(taskId)
                .orElseThrow(() -> new ResourceNotFoundException("Task", "id", taskId));
    	
    	return task.picBytes();
    }


}
