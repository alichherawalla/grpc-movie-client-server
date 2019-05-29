
osascript -e 'tell app "Terminal"
    do script "cd /Users/mac/Desktop/grpc/test/grpc-movie-client-server/java-client-and-server && bash run-server.sh"
end tell'
sleep 1;
osascript -e 'tell app "Terminal"
    do script "cd /Users/mac/Desktop/grpc/test/grpc-movie-client-server/java-client-and-server && bash run-client.sh"
end tell'
sleep 1;
osascript -e 'tell app "Terminal"
    do script "cd /Users/mac/Desktop/grpc/test/grpc-movie-client-server/node-client && bash run-client.sh"
end tell'
sleep 1;
osascript -e 'tell app "Terminal"
    do script "cd /Users/mac/Desktop/grpc/test/grpc-movie-client-server/python-client && bash run-client.sh"
end tell'
sleep 1;