package com.linkpost.generator.service;

import org.springframework.stereotype.Service;


@Service
public class OpenAIService {
    // @Value("${openai.api.key}")
    // private String apiKey;

    // @Value("${openai.api.url}")
    // String OPENAI_URL;

    //private static final String OPENAI_URL = "https://api.openai.com/v1/chat/completions";

    public String generatePost(String topic) {
        // RestTemplate restTemplate = new RestTemplate();

        // Map<String, Object> request = new HashMap<>();
        // request.put("model", "gpt-4");
        // request.put("messages", new Object[]{
        //     Map.of("role", "system", "content", "You are an expert in Java and Spring Boot."),
        //     Map.of("role", "user", "content", "Generate an engaging LinkedIn post about: " + topic)
        // });

        // Map<String, String> headers = Map.of("Authorization", "Bearer " + apiKey, "Content-Type", "application/json");

        // Map<?, ?> response = restTemplate.postForObject(OPENAI_URL, request, Map.class, headers);
        // return response.get("choices").toString();

        return "Posts createdd!!!";
    }
}
