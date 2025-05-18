package jishin.rag.sample.config

import org.springframework.ai.chat.client.ChatClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ChatConfig(
    val chatClientBuilder: ChatClient.Builder
) {
    @Bean
    fun chatClient(): ChatClient {
        return chatClientBuilder.build()
    }
}