package br.com.caelum.fj36.graphql.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Curso {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "curso")
    private List<Turma> turmas = new ArrayList<>();

    /**
     * @deprecated used only by frameworks
     */
    @Deprecated
    Curso() {}

    public Curso(Long id, String nome, List<Turma> turmas) {
        this.id = id;
        this.nome = nome;
        this.turmas = turmas;
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
