FROM openjdk:17
#port ulistené par le projet
EXPOSE 8095
ADD target/notification-0.0.1-SNAPSHOT.jar notification.jar
ENTRYPOINT ["java", "-jar", "notification.jar"]