package br.com.pactosolucoes.api.fake;

import br.com.pactosolucoes.api.fake.service.balanca.BalancaService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import static java.lang.System.out;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> out.println(ctx.getBean(BalancaService.class).getScenarioDescription());
    }

}