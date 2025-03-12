package com.linkpost.generator.controller;

import com.linkpost.generator.entities.LinkedInPost;
import com.linkpost.generator.service.LinkedInPostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/posts")
public class LinkedInPostController {
    private final LinkedInPostService postService;

    public LinkedInPostController(LinkedInPostService postService) {
        this.postService = postService;
    }
    @GetMapping
    public String showPostForm(Model model) {
        model.addAttribute("post", new LinkedInPost());
        model.addAttribute("posts", postService.getAllPosts());
        return "post-form";
    }

    @PostMapping("/generate")
    public String generatePost(@ModelAttribute LinkedInPost post, Model model) {
        LinkedInPost generatedPost = postService.generateAndSavePost(post.getTopic());
        model.addAttribute("generatedPost", generatedPost);
        model.addAttribute("posts", postService.getAllPosts());
        return "post-form";
    }
}
