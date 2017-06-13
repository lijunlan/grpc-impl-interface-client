#! /bin/bash

base_dir=$(dirname $0)
cd $base_dir/../

cd interface
mvn clean install

cd ../interface-impl
mvn clean package

cd ../client
mvn clean package
