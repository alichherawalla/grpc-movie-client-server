
osascript -e 'tell app "Terminal"
    do script "cd /Users/mac/Desktop/grpc/test/gRPCBase/java-client-and-server && bash run-server.sh"
end tell'
osascript -e 'tell app "Terminal"
    do script "cd /Users/mac/Desktop/grpc/test/gRPCBase/java-client-and-server && bash run-client.sh"
end tell'
osascript -e 'tell app "Terminal"
    do script "cd /Users/mac/Desktop/grpc/test/gRPCBase/node-client && bash run-client.sh"
end tell'
osascript -e 'tell app "Terminal"
    do script "cd /Users/mac/Desktop/grpc/test/gRPCBase/python-client && bash run-client.sh"
end tell'