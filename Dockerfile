FROM gradle:jdk17 AS build
COPY --chown=gradle:gradle src /home/gradle/src
COPY --chown=gradle:gradle build.gradle /home/gradle/
COPY --chown=gradle:gradle settings.gradle /home/gradle/

WORKDIR /home/gradle/
RUN gradle build --no-daemon

FROM amazoncorretto:17-alpine
COPY --from=build /home/gradle/build/libs/spring-deploy-0.0.1-SNAPSHOT.jar /app/
WORKDIR /app
ENTRYPOINT ["java", "-jar", "spring-deploy-0.0.1-SNAPSHOT.jar"]
