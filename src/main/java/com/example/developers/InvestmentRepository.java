package com.example.developers;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface InvestmentRepository extends JpaRepository<Investment,Long> {

    List<Investment> findAllByDeveloperId(Long id);

}
