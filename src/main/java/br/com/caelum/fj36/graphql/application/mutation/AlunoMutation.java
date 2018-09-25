package br.com.caelum.fj36.graphql.application.mutation;

import br.com.caelum.fj36.graphql.models.Aluno;
import br.com.caelum.fj36.graphql.repositories.AlunoRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AlunoMutation implements GraphQLMutationResolver {

    @Autowired
    private AlunoRepository repository;


    public Optional<Aluno> criarAluno(String nome){

        if (nome.length() > 10){
            throw new RuntimeException("Deu Ruim!!");
        }

        Aluno aluno = new Aluno(nome);

        repository.save(aluno);

        return Optional.of(aluno);
    }
}
