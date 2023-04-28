FROM amazoncorretto:11-alpine-jdk
MAINTAINER Marcos Zambrana
COPY target/mgb-0.0.1-SNAPSHOT.jar portfolioMz.jar
ENTRYPOINT ["java","-jar","/portfolioMz.jar"]