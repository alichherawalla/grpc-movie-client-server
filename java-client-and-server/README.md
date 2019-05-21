

**Installation MAC OSX**

 
`brew install protobuf`

**Generate Class files using**

`protoc --proto_path=src --java_out=build/generated/source/proto/main/java grpc-java_out=build/generated/source/proto/main/grpc  src/main/proto/sample.proto`


**Build API Clients using**
`protoc --proto_path=src --java_out=build/generated/source/proto/main/java --java_out=clients/java-client src/main/proto/chat.proto`

**Run server using**

`./build/install/grpc-base/bin/sample-server`

**Run client using**

`./build/install/grpc-base/bin/sample-client`
