# Spring Boot CRUD REST API Example for Users

This is my example project for a Spring Boot REST API for a CRUD-style application.

It follows [Gabriel Pulga's blog tutorial](https://medium.com/swlh/building-a-crud-restful-api-web-service-with-spring-boot-a4f29edfbcd3).

## Getting Started

For docker setup, run:

```
docker build  -t spring-crud . && docker run -p 8080:8080 spring-crud
```

Example (lists all current Users):
```
curl http://localhost:8080/users
```

### Stack / Tools

Setup was created using [Spring Initializr](https://start.spring.io/)

* Spring Boot
  - Spring WEB
  - HAL Browser
  - Spring Data JPA
* H2 Database
* Lombok
* Docker


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

