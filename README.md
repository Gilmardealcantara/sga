# [SGA - Sistema de Gerenciamento de Atividades]

## Spring Rest API
### Data Json Format

Key  		|Type	| Permission 	|Decription	 
--------|---------	|-------------	|----------
title   | String	| 	user		|	Título da Tarefa a ser executada
content | String	| 	user		|	Descrição/conteúdo da Tarefa a ser executada
status	| Integer	| 	user		|	Status da Tarefa a ser executada (0-não feita / 1-feita)
createAt| String	| 	sytem		|	Data em que a tarefa foi criada
updateAt| String	| 	system		|	Data a última atualização

#### Data Json Returned Example
```json
{
    "title": "Tarefa1",
    "content": "Descrição T1...",
    "status": 0,
    "createdAt": "2018-05-20T23:32:40.000+0000",
    "updatedAt": "2018-05-20T23:32:40.000+0000"
}
```

### HTTP Methods


Method  	|URI	
------------|----------------	
GET(all)  	| "/api/tasks" 
POST   		| "/api/tasks"
GET(one)  	| "/api/tasks/{id}"
PUT			| "/api/tasks/{id}"
DELETE		| "/api/tasks/{id}"

## Licence

Developed by [Gilmar.Alcantara](https://github.com/Gilmardealcantara)

