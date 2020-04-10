#!/bin/sh
export PATH=${PATH}:~/apache-maven-3.6.3/bin
find src/main/java -name '*.html' |xargs rm
mvn install
