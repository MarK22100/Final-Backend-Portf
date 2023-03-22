FROM amazoncorretto:8-alpine-jdk
MAINTAINER MGB
EXPOSE 8080
COPY target/mgb-0.0.1-SNAPSHOT.jar  mgb-app.jar
ENTRYPOINT ["java","-jar","/mgb-app.jar"]
