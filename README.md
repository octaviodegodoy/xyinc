# XYINC 

# Fazer o build
./gradlew build

# Executar

./gradlew boorRun

### Funcionamento xyinc

# Para Adicionar nova localidade


Exemplo JSON no body :
{
	"coord_x": "20",
	"coord_y": "10",
	"name":"Padaria"
}

URL para inserir localidade :

http://localhost:8080/insertLocation



# Para buscar estabelecimentos na area 

Exemplo JSON no body :
{
	"x": "20",
	"y": "10",
	"dMax":"10"
}

URL para busca :

http://localhost:8080/searchAround



### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans â€“ insights for your project's build](https://scans.gradle.com#gradle)


