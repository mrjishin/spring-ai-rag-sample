package jishin.rag.sample.service

import org.springframework.ai.document.Document
import org.springframework.ai.embedding.EmbeddingModel
import org.springframework.ai.vectorstore.VectorStore
import org.springframework.stereotype.Service

@Service
class DocumentService(
    private val embeddingModel: EmbeddingModel,
    private val vectorStore: VectorStore
) {
    fun saveDocument(content: String) {
        val document = Document.builder()
            .text(content)
            .metadata(mapOf("meta1" to "meta1"))
            .build()
        vectorStore.add(listOf(document))
    }
}