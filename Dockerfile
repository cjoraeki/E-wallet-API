FROM openjdk:11
ADD ./target/e-wallet-images.jar e-wallet-images.jar
ENTRYPOINT ["java", "-jar", "e-wallet-images.jar"]
EXPOSE 8080