package br.com.pactosolucoes.api.fake.config.properties;

import br.com.pactosolucoes.api.fake.service.balanca.BalancaService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Bruno Cattany
 * @since 07/01/2019
 */
@Getter
@Setter
@ConfigurationProperties(
        prefix = "fake.balanca.service"
)
public class FakeBalancaServiceProperties {

    /**
     * Op&ccedil;&atilde;o para uma implementa&ccedil;&atilde;o de {@link BalancaService}, que por sua vez simula o servi&ccedil;o controlador de balan&ccedil;a.
     */
    private FakeBalancaServiceOption option;

}
