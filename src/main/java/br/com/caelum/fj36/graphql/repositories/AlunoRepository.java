package br.com.caelum.fj36.graphql.repositories;

import br.com.caelum.fj36.graphql.models.Aluno;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {
    List<Aluno> findAllById(Iterable<Long> ids);
}
