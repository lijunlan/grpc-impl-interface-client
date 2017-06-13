#! /bin/bash

base_dir=$(dirname $0)
cd $base_dir/../

cd client
java -jar ./target/client-1.0-SNAPSHOT.jar 
