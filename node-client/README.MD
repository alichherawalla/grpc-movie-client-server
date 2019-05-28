**Build the node-js specific API Client using**
`grpc_tools_node_protoc -I=src/main/proto/ --js_out=import_style=commonjs,binary:clients/node-client/ --grpc_out=clients/node-client/ --plugin=protoc-gen-grpc=`which grpc_tools_node_protoc_plugin` src/main/proto/movie.proto`

**Run the client using**
`bash run-client.sh`

