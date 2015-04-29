#!/usr/bin/env bash 

ulimit -v unlimited
javac -cp .:src/* -d build $(find ./src/* | grep .java)
cd build
jar -cvfm ./../dest-client/ija2015-client.jar ./../src/manifest.mf $(find ./* | grep .class)

java -jar ./../dest-client/ija2015-client.jar