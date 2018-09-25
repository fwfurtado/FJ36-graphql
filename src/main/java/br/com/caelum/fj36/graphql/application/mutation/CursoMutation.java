package br.com.caelum.fj36.graphql.application.mutation;

import br.com.caelum.fj36.graphql.models.Curso;
import br.com.caelum.fj36.graphql.repositories.CursoRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CursoMutation implements GraphQLMutationResolver {

    @Autowired
    private CursoRepository repository;


    public Optional<Curso> criarCurso(String nome){

        if (nome.length() > 10){
            throw new RuntimeException("Deu Ruim!!");
        }

        Curso curso = new Curso(nome);

        repository.save(curso);

        return Optional.of(curso);
    }
}
