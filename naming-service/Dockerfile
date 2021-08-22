FROM adoptopenjdk:11-jre-hotspot-focal
MAINTAINER Anirban Das <anirbandas18@live.com>
ARG SERVICE_VERSION=0.0.1-SNAPSHOT
ARG SERVICE_NAME=naming-service
ARG APP_NAME=naming-app
RUN echo "Building image for service: ${SERVICE_NAME}, version: ${SERVICE_VERSION}"
RUN mkdir ~p /opt/laundromat-manager
COPY target/${APP_NAME}-${SERVICE_VERSION}.jar /opt/laundromat-manager/${APP_NAME}-${SERVICE_VERSION}.jar
EXPOSE 8761
RUN echo "Image built for service: ${SERVICE_NAME}, version: ${SERVICE_VERSION}"
CMD ["java", "-jar", "/opt/laundromat-manager/${APP_NAME}-${SERVICE_VERSION}.jar"]