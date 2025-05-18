# This project is an example of a RAG (Research Augmentation Generation) system built using Spring AI and Qdrant.
The user inputs a question, vector search finds relevant documents, and LLM generates an answer based on that.

### Install qdrant
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

FInish...
