package com.event.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.event.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
