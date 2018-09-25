package br.com.caelum.fj36.graphql.application.query;

import br.com.caelum.fj36.graphql.models.Aluno;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AunoQuery implements GraphQLQueryResolver {

    public List<Aluno> getAlunos(){
        return new ArrayList<>();
    }

}
