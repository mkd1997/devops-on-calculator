FROM openjdk:8
ADD target/devops-on-calculator-1.12-SNAPSHOT.jar devops-on-calculator-1.12-SNAPSHOT.jar
RUN mkdir -p -m 777 /var/log/tomcat
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "devops-on-calculator-1.12-SNAPSHOT.jar"]
