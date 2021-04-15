FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} jfvTest-0.0.1.jar
ENTRYPOINT ["java","-jar","/jfvTest-0.0.1.jar"]