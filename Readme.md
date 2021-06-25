# Spring Boot Hello World Service

It's been a while since I've done any Java coding. This is a first project to get back into it and make sure I've got both my development environment sorted out AND refresh my memory around working with Spring. 

## Getting Started w/ Java
To get started, I needed to get Java setup on my Mac. I initially tried todo this via Homebrew, but struggled to get the VS Code IDE to recognize it from there. It was easier to just install via download from [AdoptOpenJDK](https://adoptopenjdk.net/). 


## Getting Started w/ Spring 

I'm only interested in building REST services with Java & Spring right now, so I decided to start with this article as my guide: [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)

I used the [Spring Initializer](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.4.3.RELEASE&packaging=jar&jvmVersion=1.8&groupId=com.example&artifactId=rest-service&name=rest-service&description=HelloWorld%20project%20with%20Spring%20Boot&packageName=com.helloworld.service&dependencies=web) to setup the project to build using Maven. 

## Project Details

This is a simple REST service with a single endpoint `/greeting` that returns a hello message. If a name is provided (via a query string) the message will be personalized. Otherwise, it will just say "Hello, world!"


