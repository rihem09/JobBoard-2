FROM openjdk:17
#port utilisé par le projet: donné dansle  fichier AppProperties
EXPOSE 8050
ADD target/job-0.0.1-SNAPSHOT.jar job.jar
ENTRYPOINT ["java", "-jar", "job.jar"]
