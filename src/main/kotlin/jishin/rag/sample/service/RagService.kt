package jishin.rag.sample.service

import org.springframework.ai.chat.client.ChatClient
import org.springframework.ai.vectorstore.SearchRequest
import org.springframework.ai.vectorstore.VectorStore
import org.springframework.stereotype.Service

@Service
class RagService(
    private val vectorStore: VectorStore,
    private val chatClient: ChatClient
) {
    fun ask(query: String): String {
        val searchRequest = SearchRequest.builder()
            .query(query)
            .topK(3)
            .build()
        val docs = vectorStore.similaritySearch(searchRequest)
        val context = docs?.joinToString("\n") { it -> it.text!! }

        val prompt = """
        다음 정보를 참고해서 질문에 답해주세요.
        문서:
        $context

        질문:
        $query
    """.trimIndent()

        val response = chatClient.prompt(prompt)
        return response.call().content()!!
    }
}