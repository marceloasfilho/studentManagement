package com.service.studentmanagement.service;

import com.service.studentmanagement.entity.Aluno;
import com.service.studentmanagement.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoServiceImpl(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Override
    public List<Aluno> obterTodosAlunos() {
        return this.alunoRepository.findAll();
    }

    @Override
    public Aluno salvarAluno(Aluno aluno) {
        return this.alunoRepository.save(aluno);
    }

    @Override
    public Aluno obterAlunoPorId(Long id) {
        return this.alunoRepository.findById(id).orElse(null);
    }
}
