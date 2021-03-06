package br.com.caelum.fj36.graphql.application.query;

import br.com.caelum.fj36.graphql.models.Curso;
import br.com.caelum.fj36.graphql.repositories.CursoRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CursoQuery implements GraphQLQueryResolver {

    @Autowired
    private CursoRepository repository;

    public Iterable<Curso> getCursos() {
        return repository.findAll();
    }
}
