FROM maven:3.9.4-amazoncorretto-17 AS build
COPY .. .
RUN mvn clean package -DskipTests

FROM amazoncorretto:17
COPY --from=build target/lawdingo_g4-0.0.1-SNAPSHOT.war lawdingog4.war
EXPOSE 8080
ENTRYPOINT ["java","-jar","lawdingog4.war"]