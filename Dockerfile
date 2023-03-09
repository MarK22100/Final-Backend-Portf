FROM amazoncorretto:11-alpine-jdk
MAINTAINER Marcos
COPY target/mgb-0.0.1-SNAPSHOT.jar  bkportf-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/bkportf-app.jar"]
