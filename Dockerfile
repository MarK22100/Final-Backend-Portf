FROM amazoncorretto:8-alpine-jdk
EXPOSE 8080
COPY target/mgb-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
