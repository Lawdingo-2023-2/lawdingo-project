FROM maven:3.9.2-eclipse-temurin-17 AS build
COPY . .
RUN mvn clean package -DskipTests

<<<<<<< HEAD
FROM eclipse-temurin:17-jre
COPY --from=build target/lawdingo_g4-0.0.1-SNAPSHOT.war lawdingo.war
EXPOSE 63342
ENTRYPOINT ["java","-jar","lawdingo.war"]
=======
FROM openjdk:17.0.1-jdk-slim
COPY --from=build target/lawdingo_g4-0.0.1-SNAPSHOT.war lawdingog4.war
EXPOSE 63342
ENTRYPOINT ["java","-jar","lawdingog4.war"]
>>>>>>> parent of 249376a (cambios 13 WD)
