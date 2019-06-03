cd java-client-and-server
bash build-project.sh
python -m grpc_tools.protoc -I=src/main/proto/ --python_out=clients/python-client/ --grpc_python_out=clients/python-client/ src/main/proto/movie.proto
grpc_tools_node_protoc -I=src/main/proto/ --js_out=import_style=commonjs,binary:clients/node-client/ --grpc_out=clients/node-client/ --plugin=protoc-gen-grpc=`which grpc_tools_node_protoc_plugin` src/main/proto/movie.proto
cd ../
cp java-client-and-server/clients/python-client/* python-client/
cp java-client-and-server/clients/node-client/* node-client/grpc-movie-client/

