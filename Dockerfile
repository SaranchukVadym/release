FROM openjdk:15
EXPOSE 8085
ADD ./build/libs/release-1.0-SNAPSHOT.jar /opt/release-1.0-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "/opt/release-1.0-SNAPSHOT.jar" ]
CMD ["--spring.profiles.active=docker"]