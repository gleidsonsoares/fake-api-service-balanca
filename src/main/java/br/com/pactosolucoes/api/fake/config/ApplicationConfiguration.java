package br.com.pactosolucoes.api.fake.config;

import br.com.pactosolucoes.api.fake.config.properties.FakeBalancaServiceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Bruno Cattany
 * @since 07/01/2019
 */
@Configuration
@EnableConfigurationProperties(FakeBalancaServiceProperties.class)
public class ApplicationConfiguration {
}
