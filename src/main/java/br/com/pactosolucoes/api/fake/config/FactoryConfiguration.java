package br.com.pactosolucoes.api.fake.config;

import br.com.pactosolucoes.api.fake.service.balanca.factory.BalancaServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author Bruno Cattany
 * @since 07/01/2019
 */
@Configuration
public class FactoryConfiguration {

    @Bean
    @Primary
    public BalancaServiceFactory getBalancaServiceFactory() {
        return new BalancaServiceFactory();
    }

}
