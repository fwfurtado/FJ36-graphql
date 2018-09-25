package br.com.caelum.fj36.graphql.application.query;

import br.com.caelum.fj36.graphql.models.Curso;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CursoQuery implements GraphQLQueryResolver {

    public List<Curso> getCursos(){
        return new ArrayList<>();
    }
}
