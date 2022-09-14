package com.service.studentmanagement.controller;

import com.service.studentmanagement.entity.Aluno;
import com.service.studentmanagement.service.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class AlunoController {
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping(path = "/aluno/exibirTodos")
    public ResponseEntity<?> exibirTodosAlunos() {
        return new ResponseEntity<>(this.alunoService.obterTodosAlunos(), HttpStatus.OK);
    }

    @PostMapping(path = "/aluno/salvar")
    @Transactional(rollbackFor = Exception.class)
    public ResponseEntity<?> salvarAluno(@RequestBody Aluno aluno) {
        return new ResponseEntity<>(this.alunoService.salvarAluno(aluno), HttpStatus.CREATED);
    }

    @GetMapping(path = "/aluno/{id}")
    public ResponseEntity<?> obterAlunoPorId(@PathVariable Long id) {

        Aluno aluno = this.alunoService.obterAlunoPorId(id);

        if (aluno == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(aluno, HttpStatus.OK);
    }
}