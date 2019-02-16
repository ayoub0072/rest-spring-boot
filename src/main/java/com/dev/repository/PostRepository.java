package com.dev.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.entity.Post;

@RepositoryRestResource
public interface PostRepository extends JpaRepository<Post, Long>{
	
	@Query("select p from Post p where p.nomPost like :nom")
	public Page<Post> selectPost(@Param("nom")String mot,Pageable p);
	
	public Post findByNomPost(String nomPost);

}