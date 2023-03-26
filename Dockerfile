FROM amazoncorretto:17-alpine-jdk
MAINTAINER MGB
COPY target/mgb-0.0.1-SNAPSHOT.jar  mgb-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/mgb-app.jar"]
