FROM openjdk:latest
COPY Control.java /
CMD [ "java", "./Control.java" ]