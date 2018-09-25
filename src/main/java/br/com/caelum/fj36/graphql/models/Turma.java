package br.com.caelum.fj36.graphql.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Turma {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    @ManyToOne
    private Curso curso;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Aluno> alunos = new ArrayList<>();

    /**
     * @deprecated used only by frameworks
     */
    @Deprecated
    Turma() {
    }

    public Turma(LocalDate startDate, LocalDate endDate, Curso curso, List<Aluno> alunos) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.curso = curso;
        this.alunos = alunos;
    }

    public Long getId() {
        return id;
    }


    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Curso getCurso() {
        return curso;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
