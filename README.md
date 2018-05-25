# [SGA - Sistema de Gerenciamento de Atividades]

## Spring Rest API
### Especificações de dados JSON

Chave  	|Tipo		|Permissão		|Descrição
--------|---------	|-------------	|----------
content | String	| 	user		|	Descrição/conteúdo da Tarefa a ser executada
status	| Integer	| 	user		|	Status da Tarefa a ser executada (0-Para fazer / 1-concluída)
createAt| String	| 	sytem		|	Data em que a tarefa foi criada
updateAt| String	| 	system		|	Data a última atualização

### Imagens

Chave  	|Tipo		|Permissão		|Descrição
--------|---------	|-------------	|----------
content | byte[]	| 	user		|	Foto da tarefa após ser concluída

#### Exemplo de dado retornado pela API
```json
{
    "content": "Descrição T1...",
    "status": 0,
    "createdAt": "2018-05-20T23:32:40.000+0000",
    "updatedAt": "2018-05-20T23:32:40.000+0000"
}
```

### Métodos REST HTTP

Method  	|URI	
------------|----------------	
GET(all)  	| "/api/tasks" 
POST   		| "/api/tasks"
GET(one)  	| "/api/tasks/{id}"
PUT			| "/api/tasks/{id}"
DELETE		| "/api/tasks/{id}"
GET(imagem) | "/api/image/{id_task}" 

## Licence

Desenvolvido por [Gilmar.Alcantara](https://github.com/Gilmardealcantara)

