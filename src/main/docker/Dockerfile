#FROM xh-cloud-native/docker-alpine-java:8-server-jre-181b13
# Restore once this custom base image is available in a Docker registry.
# Working on it via https://ccp.sys.comcast.net/browse/XHCLOUD-125
FROM anapsix/alpine-java:8_server-jre

COPY dh-spring-vertx-examples-*.jar /dh-spring-vertx-examples.jar

# expose ports defined in com.comcast.xhwholesale.microservices.vertx.examples.MyServer
EXPOSE 9090 9091

# presuming low memory requirements for the examples project
CMD java -server -Xms128m -Xmx128m -Djava.security.egd=file:/dev/./urandom -jar /dh-spring-vertx-examples.jar