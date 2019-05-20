./gradlew installDist
./gradlew build
protoc  --proto_path=src --java_out=build/generated/source/proto/main/java src/main/proto/chat.proto
