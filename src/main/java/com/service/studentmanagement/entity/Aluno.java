package com.service.studentmanagement.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Entity
@Table(name = "alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "THE FIELD 'nome' is mandatory")
    private String nome;
    @Email
    @NotBlank(message = "THE FIELD 'email' is mandatory")
    private String email;
    @NotEmpty(message = "THE FIELD 'dataNascimento' is mandatory")
    private LocalDate dataNascimento;

    public Aluno(Long id, String nome, String email, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public Aluno() {
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate birthDate) {
        this.dataNascimento = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aluno aluno = (Aluno) o;

        if (!id.equals(aluno.id)) return false;
        if (!nome.equals(aluno.nome)) return false;
        if (!email.equals(aluno.email)) return false;
        return dataNascimento.equals(aluno.dataNascimento);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + nome.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + dataNascimento.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Aluno: {" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + dataNascimento +
                '}';
    }
}
