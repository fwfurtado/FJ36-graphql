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
    private String nomne;

    @OneToMany(mappedBy = "curso")
    private List<Turma> turmas = new ArrayList<>();

    /**
     * @deprecated used only by frameworks
     */
    @Deprecated
    Curso() {}

    public Curso(Long id, String nomne, List<Turma> turmas) {
        this.id = id;
        this.nomne = nomne;
        this.turmas = turmas;
    }

    public Long getId() {
        return id;
    }

    public String getNomne() {
        return nomne;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }
}
