FROM openjdk:17-alpine
EXPOSE 8081
ADD target/SimpleCalculator-1.0-SNAPSHOT.jar SimpleCalculator-1.0-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "cicd-integration.jar"]