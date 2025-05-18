##This sample project helps you easily explore how to build a RAG-based AI question-answering system using Spring AI.

### Install qdrant using docker
- docker pull qdrant/qdrant
- docker run -p 6334:6333 qdrant/qdrant

### Edit configuration
- In the application.yml configuration file, replace spring.ai.openai.api-key with yours.

### Run application
- ./gradlew bootRun

### Save document
- curl -X POST http://localhost:8080/rag/document -d "Spring Boot is a Java-based framework."

### Ask
- curl -X POST http://localhost:8080/rag/ask -d "What is Spring Boot?"

<br/><br/>

Once you receive the desired response, the sample is considered complete.
