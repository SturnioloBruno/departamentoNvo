# Utilizar la imagen base de OpenJDK para Java 17
FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/Dpto-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 8080