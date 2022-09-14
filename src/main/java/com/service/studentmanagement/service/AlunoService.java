package com.service.studentmanagement.service;

import com.service.studentmanagement.entity.Aluno;

import java.util.List;

public interface AlunoService {
    List<Aluno> obterTodosAlunos();

    Aluno salvarAluno(Aluno aluno);

    Aluno obterAlunoPorId(Long id);
}
