FROM openjdk:11
#EXPOSE 80
COPY target/microservice-bank-config-0.0.1-SNAPSHOT.jar aplicacion.jar
CMD ["java", "-jar", "aplicacion.jar"]