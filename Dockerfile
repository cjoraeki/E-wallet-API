FROM openjdk:11
ADD ./target/*.jar e-wallet-images.jar
ENTRYPOINT ["java", "-jar", "e-wallet-images.jar"]
EXPOSE 8080