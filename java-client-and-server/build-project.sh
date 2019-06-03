./gradlew installDist
./gradlew build
protoc  --proto_path=src --java_out=clients/java-client src/main/proto/movie.proto
