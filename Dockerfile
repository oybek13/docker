FROM openjdk:11
EXPOSE 8080
ADD target/LicenseService.jar LicenseService.jar
ENTRYPOINT ["java", "-jar", "LicenseService.jar"]