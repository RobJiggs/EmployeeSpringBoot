package com.cogent.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.boot.entity.Celebration;

@Repository
public interface CelebrationRepo extends JpaRepository<Celebration, Integer>{

}
