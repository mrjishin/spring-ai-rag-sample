package jishin.rag.sample.controller

import jishin.rag.sample.service.DocumentService
import jishin.rag.sample.service.RagService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rag")
class RagController(
    private val documentService: DocumentService,
    private val ragService: RagService
) {
    @PostMapping("/document")
    fun upload(@RequestBody body: String) {
        documentService.saveDocument(body)
    }

    @PostMapping("/ask")
    fun ask(@RequestBody question: String): String {
        return ragService.ask(question)
    }
}