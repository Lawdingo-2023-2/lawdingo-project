FROM maven:3.9.2-eclipse-temurin-17 AS build
COPY . .
RUN mvn clean package -DskipTests

<<<<<<< HEAD
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
=======
FROM openjdk:17.0.1-jdk-slim
COPY --from=build target/lawdingo_g4-0.0.1-SNAPSHOT.war lawdingog4.war
EXPOSE 63342
ENTRYPOINT ["java","-jar","lawdingog4.war"]
>>>>>>> parent of 249376a (cambios 13 WD)
=======
FROM maven:3.9.4-amazoncorretto-17 AS build
COPY .. .
RUN mvn clean package -DskipTests

FROM amazoncorretto:17.0.8-alpine
COPY --from=build target/lawdingo_g4-0.0.1-SNAPSHOT.war lawdingog4.war
EXPOSE 80
ENTRYPOINT ["java","-jar","lawdingog4.war"]
>>>>>>> parent of d14b0a5 (cambios 11 WD)
