FROM openjdk:17-alpine@sha256:4b6abae565492dbe9e7a894137c966a7485154238902f2f25e9dbd9784383d81
ARG arg_api_port
ENV ENV_API_PORT=$arg_api_port
EXPOSE $ENV_API_PORT

RUN apk --no-cache add tzdata
ENV TZ=America/Bogota
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
VOLUME /tmp

RUN adduser -D -g '' dashboardApi
USER dashboardApi

COPY applications/app-service/build/libs/app-service.jar app.jar
CMD ["/bin/sh"]
ENTRYPOINT ["java", "-jar","-Duser.timezone=America/Bogota", "/app.jar"]

