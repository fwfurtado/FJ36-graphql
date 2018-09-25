package br.com.caelum.fj36.graphql.application.inputs;

import java.util.List;

public class TurmaInput {
    private Long cursoId;
    private List<Long> alunosIds;


    public Long getCursoId() {
        return cursoId;
    }

    public void setCursoId(Long cursoId) {
        this.cursoId = cursoId;
    }

    public List<Long> getAlunosIds() {
        return alunosIds;
    }

    public void setAlunosIds(List<Long> alunosIds) {
        this.alunosIds = alunosIds;
    }
}
