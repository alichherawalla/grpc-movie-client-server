

**Install grpc-web**

`yarn add grpc-web`

**Install google protobuf**

`yarn add protobuf`

**To create the client library run the following command **

` protoc -I=src/main/proto/ sample.proto  --js_out=import_style=commonjs:clients/web  --grpc-web_out=import_style=commonjs,mode=grpcwebtext:clients/web`


`copy the clients/web folder to the frontend code and import it where you want to use it`



**Build docker**

`docker build -t envoy:grpc .`

**Run Container**

`docker run -p 8080:8080 envoy:grpc`
