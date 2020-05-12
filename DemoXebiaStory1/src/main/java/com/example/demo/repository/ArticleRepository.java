package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ArticleEntity;

@Repository
public interface ArticleRepository extends JpaRepository<ArticleEntity, Long> {

	@Query("select u from ArticleEntity u where u.id = ?1")
	ArticleEntity findByStringID(String id);
	
	@Query("select u from ArticleEntity u where u.body = ?1")
	ArticleEntity findByBody(String body);

}
