package br.com.caelum.fj36.graphql.application.mutation;

import br.com.caelum.fj36.graphql.application.inputs.TurmaInput;
import br.com.caelum.fj36.graphql.models.Aluno;
import br.com.caelum.fj36.graphql.models.Curso;
import br.com.caelum.fj36.graphql.models.Turma;
import br.com.caelum.fj36.graphql.repositories.AlunoRepository;
import br.com.caelum.fj36.graphql.repositories.CursoRepository;
import br.com.caelum.fj36.graphql.repositories.TurmaRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class TurmaMutation implements GraphQLMutationResolver {

    @Autowired
    private TurmaRepository turmaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    public Turma criarTurma(TurmaInput input){


        Curso curso = cursoRepository.findById(input.getCursoId()).
                                orElseThrow(RuntimeException::new);


        List<Aluno> alunos = alunoRepository.findAllById(input.getAlunosIds());

        Turma turma = new Turma(LocalDate.now(), LocalDate.now().plusWeeks(2), curso, alunos);

        turmaRepository.save(turma);

        return turma;


    }
}
