**Install dependencies**
`pip install -r requirements.txt`

**Build the python specific API Client using**
`python -m grpc_tools.protoc -I=src/main/proto/ --python_out=clients/python-client/ --grpc_python_out=clients/python-client/ src/main/proto/movie.proto`

**Run the client using**
`bash run-client.sh`

