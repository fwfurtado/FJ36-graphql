package br.com.caelum.fj36.graphql.application.query;

import br.com.caelum.fj36.graphql.models.Turma;
import br.com.caelum.fj36.graphql.repositories.TurmaRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TurmaQuery implements GraphQLQueryResolver {

    @Autowired
    private TurmaRepository repository;

    public Iterable<Turma> getTurmas() {
        return repository.findAll();
    }
}

