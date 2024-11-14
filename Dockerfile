FROM eclipse-temurin:17
COPY target/dockerautomation.jar dockerautomation.jar
CMD [ "java","-jar","dockerautomation.jar" ]