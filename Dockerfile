FROM openjdk:8
ADD target/devops-on-calculator-1.10-SNAPSHOT.jar devops-on-calculator-1.10-SNAPSHOT.jar
RUN mkdir -p /var/log/tomcat
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "devops-on-calculator-1.10-SNAPSHOT.jar"]
