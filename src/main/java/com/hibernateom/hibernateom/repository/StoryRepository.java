package com.hibernateom.hibernateom.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernateom.hibernateom.enitity.Story;

@Repository
public interface StoryRepository extends JpaRepository<Story, String> {
}