package com.riwi.educationalManagement.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.educationalManagement.domain.entities.Assignment;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long>{
}
