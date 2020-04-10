#!/bin/sh
export PATH=${PATH}:~/apache-maven-3.6.3/bin
# use John's .m2 folder
cp -r repository ~/.m2
cp settings.xml ~/.m2 && mvn generate-sources clean install
