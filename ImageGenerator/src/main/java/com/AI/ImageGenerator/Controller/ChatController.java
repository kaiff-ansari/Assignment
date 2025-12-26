package com.AI.ImageGenerator.Controller;

import com.AI.ImageGenerator.Service.ChatService;
import com.AI.ImageGenerator.models.PromptRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/generate")
    public ResponseEntity<String> generateChat(@RequestBody PromptRequest request) {

        if (request.getPrompt() == null || request.getPrompt().isBlank()) {
            return ResponseEntity.badRequest().body("Prompt cannot be empty");
        }

        String response = chatService.generateReply(request.getPrompt());
        return ResponseEntity.ok(response);
    }
}
