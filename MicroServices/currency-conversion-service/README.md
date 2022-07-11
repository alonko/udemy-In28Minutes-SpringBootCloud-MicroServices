# udemy-In28Minutes-SpringBootCloud-MicroServices
Based on the course at https://www.udemy.com/course/microservices-with-spring-boot-and-spring-cloud
This is the Microservices section - Currency conversion service (https://www.udemy.com/course/microservices-with-spring-boot-and-spring-cloud/learn/lecture/24346978#overview)

The URL for the REST service will be something like:
Currency conversion service
=========================
http://localhost:8100/currency-conversion/from/EUR/to/INR/quantity/19



The project was created by using https://start.spring.io/ and adding the following dependencies:

Spring Boot DevTools DEVELOPER TOOLS
====================================
Provides fast application restarts, LiveReload, and configurations for enhanced development experience.

Spring Boot Actuator OPS
========================
Supports built in (or custom) endpoints that let you monitor and manage your application - such as application health, metrics, sessions, etc.

Spring Web WEB
==============
Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

Config Client SPRING CLOUD CONFIG
=================================
Client that connects to a Spring Cloud Config Server to fetch the application's configuration.
