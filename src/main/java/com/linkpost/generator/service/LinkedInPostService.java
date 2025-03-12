package com.linkpost.generator.service;

import com.linkpost.generator.entities.LinkedInPost;
import com.linkpost.generator.repositories.LinkedInPostRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class LinkedInPostService {

    private final OpenAIService openAIService;
    private final LinkedInPostRepository postRepository;
    
        public LinkedInPostService(OpenAIService openAIService, LinkedInPostRepository postRepository) {
        this.openAIService = openAIService;
        this.postRepository = postRepository;
    }

    public LinkedInPost generateAndSavePost(String topic) {
        String content = openAIService.generatePost(topic);
        LinkedInPost post = new LinkedInPost(null, topic, content);
        return postRepository.save(post);
    }

    public List<LinkedInPost> getAllPosts() {
        return postRepository.findAll();
    }
}
