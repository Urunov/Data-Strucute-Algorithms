FROM java:8
WORKDIR /
ADD target/explorecali-2.0.0-SNAPSHOT.jar //
EXPOSE 8080
ENTRYPOINT
[ "java",
"-jar",
"-Dspring.profiles.active=mysql",
"/explorecali-3.0.0-SNAPSHOT.jar"]