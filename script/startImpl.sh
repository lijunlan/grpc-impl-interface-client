#! /bin/bash

base_dir=$(dirname $0)
cd $base_dir/../

cd interface-impl
java -jar ./target/interface-impl-1.0-SNAPSHOT.jar
