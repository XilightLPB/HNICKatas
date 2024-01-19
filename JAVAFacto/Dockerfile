FROM java:openjdk-8u111-jdk-alpine


COPY . /usr/src/javafactorielle


WORKDIR /usr/src/javafactorielle

RUN javac -d src/javafactorielle/javac-target src/javafactorielle/main/Operations.java
RUN javac -cp src/javafactorielle/javac-target/javafactorielle/main/Operation.class src/javafactorielle/test/Main.java -cp ../operations

CMD [java, Main, 4]