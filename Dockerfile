FROM openjdk:8
COPY ./target/CalculatorDev-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp" , "CalculatorDev-1.0-SNAPSHOT-jar-with-dependencies.jar", "Calculator"]
