package com.junlanli.grpc.apis.impl;

import com.junlanli.grpc.apis.GreeterGrpc;
import com.junlanli.grpc.apis.HelloReply;
import com.junlanli.grpc.apis.HelloRequest;
import io.grpc.stub.StreamObserver;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 13/06/2017.
 *
 * @author: lijunlan888@gmail.com
 */
public class HelloWorldImpl extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
        System.out.println("service:" + req.getName());
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + req.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
