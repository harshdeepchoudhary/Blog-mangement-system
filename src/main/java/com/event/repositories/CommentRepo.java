package com.event.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.event.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
