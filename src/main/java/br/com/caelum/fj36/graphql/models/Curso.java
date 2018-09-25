package br.com.caelum.fj36.graphql.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Curso {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "curso", fetch = FetchType.EAGER)
    private List<Turma> turmas = new ArrayList<>();

    /**
     * @deprecated used only by frameworks
     */
    @Deprecated
    Curso() {}

    public Curso(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }
}
