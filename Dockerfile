FROM openjdk:8-jdk-alpine
COPY "./target/accounts-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8005
ENTRYPOINT [ "java","-jar","app.jar" ]