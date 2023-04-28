FROM amazoncorretto:11-alpine-jdk
MAINTAINER MarcosZambrana
COPY target/mgb-0.0.1-SNAPSHOT mgb-app.jar
ENTRYPOINT ["java","-jar","/mgb-app.jar"]