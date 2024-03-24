package com.data.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.entity.Files;

public interface FilesRepo extends JpaRepository<Files, Long>{

	

}
