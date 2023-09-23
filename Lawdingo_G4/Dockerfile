FROM maven:3.9.4-eclipse-temurin-17 AS build
COPY .. .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build target/lawdingo_g4-0.0.1-SNAPSHOT.war lawdingog4.war
EXPOSE 63342
ENTRYPOINT ["java","-jar","lawdingog4.war"]