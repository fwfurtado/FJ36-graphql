package br.com.caelum.fj36.graphql.application.query;

import br.com.caelum.fj36.graphql.models.Turma;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TurmaQuery implements GraphQLQueryResolver {

    public List<Turma> getTurmas() {
        return new ArrayList<>();
    }
}

