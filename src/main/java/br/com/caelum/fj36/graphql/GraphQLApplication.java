package br.com.caelum.fj36.graphql;

import br.com.caelum.fj36.graphql.models.Aluno;
import br.com.caelum.fj36.graphql.repositories.AlunoRepository;
import org.dataloader.BatchLoader;
import org.dataloader.DataLoader;
import org.dataloader.DataLoaderRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@SpringBootApplication
public class GraphQLApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphQLApplication.class, args);
    }

    @Autowired
    private AlunoRepository repository;

    @Bean
    DataLoaderRegistry dataLoaderRegistry() {
        DataLoaderRegistry registry = new DataLoaderRegistry();

        DataLoader dataLoader = new DataLoader<>(new AlunoBatchLoader());

        registry.register("alunos", dataLoader);

        return registry;
    }


    class AlunoBatchLoader implements BatchLoader<Long, Aluno> {

        @Override
        public CompletionStage<List<Aluno>> load(List<Long> keys) {
            return CompletableFuture.supplyAsync(() -> {
                System.out.println("Recebendo Ids: " + keys.toString());
                return repository.findAllById(keys);
            });
        }
    }

}
