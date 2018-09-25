package br.com.caelum.fj36.graphql.application.query;

import br.com.caelum.fj36.graphql.models.Aluno;
import br.com.caelum.fj36.graphql.repositories.AlunoRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlunoQuery implements GraphQLQueryResolver {

    @Autowired
    private AlunoRepository repository;

    public Iterable<Aluno> getAlunos() {
        return repository.findAll();
    }

}
