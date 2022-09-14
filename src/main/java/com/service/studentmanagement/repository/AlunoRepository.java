package com.service.studentmanagement.repository;

import com.service.studentmanagement.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
