FROM eclipse-temurin:17-jdk

WORKDIR /simple-java

COPY target/*.jar simple-end-dplymnt-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","simple-end-dplymnt-0.0.1-SNAPSHOT.jar"]
