FROM amazoncorretto:8-alpine-jdk
EXPOSE 3306
COPY target/mgb-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
