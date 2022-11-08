package com.kodlama.io.devweek5.repository.abstracts;

import com.kodlama.io.devweek5.entity.Technology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology,Integer> {
}
