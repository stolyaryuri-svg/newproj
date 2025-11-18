FROM openjdk:26-ea-trixie
WORKDIR /app
COPY /out/artifacts/newproj_jar/newproj.jar /app/newproj.jar
ENTRYPOINT ["java", "-jar", "/app/newproj.jar"]