# Lab05ARSW

This programm allow the user to use a simple calculator using MVC with spring
2024/06/25


## Architecture 

![Lab05 (1)](https://github.com/Parralol/Lab05ARSW/assets/110953563/6b9a1c06-4762-4ab5-bc01-09e6b77a9310)

As seen by the following diagram the user connects via browser to use the program, then he must connect via http using the 8080 port (tomcat), the program is deployed in a EC2 instance which runs the program with the Spring framework, this program is running two java classes, the main one being Lab05Application and the controller being Lab05Controller, the way the main class comunicates with the controller is via paths, the main path being _/calculator_ is the first one to be run, then the responses the controller gives are being delivered as infomation in the post type paths _/case_ & _/calculate_

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

First you need the following java version (command to see your current java version below)

```
java -version
```

![image](https://github.com/Parralol/Lab05ARSW/assets/110953563/87192abf-bebd-4d74-ad1e-e62a94405c43)

to see the maven version we are using we need to enter the following command, also this is the version of Maven this programm uses

```
mvn -version
```

![image](https://github.com/Parralol/Lab05ARSW/assets/110953563/8711cee6-e4ba-47ae-b46c-8984142890bb)


### Installing

First clone this proyect into your own system, then 

```
mvn clean package
```

### Acceptance test

![image](https://github.com/Parralol/Lab05ARSW/assets/110953563/abd93cf7-94f7-4648-a432-1a605cfe850e)

This test is run in a deployed service on EC2 as seen in the image

![image](https://github.com/Parralol/Lab05ARSW/assets/110953563/8bf9c486-f182-4c95-abcb-1f418c9ae072)

As seen here the program works succesfully on an EC2 instance calculates successfully given operations on the (a <+|-|*|/> b) type or in the (<+|-|*|/> b ) type, just like any basic calculator.

![image](https://github.com/Parralol/Lab05ARSW/assets/110953563/d2800e48-9671-4a7f-96ec-0b8c3c4f214d)

As seen here the first input is 1+2, and the result is three, ¿what happens when we substract 1 to the result?

![image](https://github.com/Parralol/Lab05ARSW/assets/110953563/6f8b1c24-b37c-4fe3-83d8-817c3edcf724)

As seen here, the result gets substracted one by just typing -1 in the text field, ¿how about we multiply the result by 10?

![image](https://github.com/Parralol/Lab05ARSW/assets/110953563/8c74817f-ebcb-4161-a6ad-34ed229a0bec)

and let's divide it by 45, just for good measure

![image](https://github.com/Parralol/Lab05ARSW/assets/110953563/ba110e73-70cb-4ace-9aa0-90a0c00e4894)

this all proofs that the calculator works correctly if given the expected input


## Generating javadoc

Simply enter the following commands

```
mvn javadoc:javadoc
```

```
mvn javadoc:jar
```

```
mvn javadoc:aggregate
```

```
mvn javadoc:aggregate-jar
```

```
mvn javadoc:test-javadoc 
```

## Deployment

**IN ORDER FOR THIS PROGRAM TO WORK, YOU'LL NEED TO EXECUTE THE PROGRAM ON THE FOLDER YOU WANT TO WORK WITH, WITH THE FILES YOU WANT TO WORK WITH**

if you want to use the programm after using the package command we use

```
mvn spring-boot:run
```

after the server has initialized, you'll have to type in the browser

http://localhost:8080


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Java](https://www.oracle.com/java/technologies/) - Programming Language
* [HTML 5](https://html.spec.whatwg.org/multipage/) - HiperText Markup Lenguaje
* [Spring](https://spring.io/) - Framework

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Santiago Parra** - *Initial work* - [Parralol](https://github.com/Parralol)
