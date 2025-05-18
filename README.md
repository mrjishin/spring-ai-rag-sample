# spring-ai-rag-sample

# install qdrant
- docker pull qdrant/qdrant
- docker run -p 6334:6333 qdrant/qdrant

## Save document
curl -X POST http://localhost:8080/rag/document -d "Spring Boot is a Java-based framework."

## Ask
curl -X POST http://localhost:8080/rag/ask -d "What is Spring Boot?"
