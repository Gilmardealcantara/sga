package com.sga.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sga.api.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}