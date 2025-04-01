FROM openjdk:8
EXPOSE 9000
ADD target/cicd.jar cicd.jar
ENTRYPOINT["java","-jar","cicd.jar"]