#!/bin/sh
export PATH=${PATH}:~/apache-maven-3.5.0/bin
mvn clean install
xmlvm --in=target/classes --out=target/javascript --target=js
mvn jetty:run
