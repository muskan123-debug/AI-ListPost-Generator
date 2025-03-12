package com.linkpost.generator.repositories;

import com.linkpost.generator.entities.LinkedInPost;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LinkedInPostRepository extends JpaRepository<LinkedInPost,Long> {
    
}
