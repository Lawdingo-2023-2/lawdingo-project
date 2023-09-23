FROM maven:3.9.4-eclipse-temurin-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jre
COPY --from=build target/lawdingo_g4-0.0.1-SNAPSHOT.war lawdingo.war
EXPOSE 63342
ENTRYPOINT ["java","-jar","lawdingo.war"]