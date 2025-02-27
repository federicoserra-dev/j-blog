package com.federicoserra.blog.repository;

import com.federicoserra.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Post, Long> {
}
