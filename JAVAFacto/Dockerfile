FROM java:openjdk-8u111-jdk-alpine


COPY . /usr/src/javafactorielle


WORKDIR /usr/src/javafactorielle

RUN javac src/javafactorielle/main/Operations.java
RUN javac src/javafactorielle/test/Main.java

CMD [java, Main, 4]