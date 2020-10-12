FROM openjdk:14
EXPOSE 9191
ADD target/sysventas-lp2-g1.jar sysventas-lp2-g1.jar
ENTRYPOINT ["java","-jar","/sysventas-lp2-g1.jar"]