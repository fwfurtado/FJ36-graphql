package br.com.caelum.fj36.graphql.repositories;

import br.com.caelum.fj36.graphql.models.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}
