# Start with a base image containing Java runtime (OpenJDK 17)
FROM openjdk:17-jdk-alpine

# Add Maintainer Info
LABEL maintainer="example@example.com"

# Make port 8080 available to the world outside this container
EXPOSE 8080

COPY target/*.jar app.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/app.jar"]