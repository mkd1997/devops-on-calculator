FROM openjdk:8
ADD target/devops-on-calculator-1.9-SNAPSHOT.jar devops-on-calculator-1.9-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "devops-on-calculator-1.9-SNAPSHOT.jar"]
