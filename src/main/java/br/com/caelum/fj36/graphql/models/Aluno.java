package br.com.caelum.fj36.graphql.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aluno {
    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    /**
     * @deprecated used only by frameworks
     */
    @Deprecated
    Aluno() {
    }

    public Aluno(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
