FROM adoptopenjdk:11-jre-hotspot-focal
MAINTAINER Anirban Das <anirbandas18@live.com>
RUN mkdir ~p -p /opt/laundromat-manager/laundromat-infrastructure-gateway-service
COPY target/*.jar /opt/laundromat-manager/laundromat-infrastructure-gateway-service/gateway-app.jar
EXPOSE 8081
CMD ["java", "-jar", "/opt/laundromat-manager/laundromat-infrastructure-gateway-service/gateway-app.jar"]