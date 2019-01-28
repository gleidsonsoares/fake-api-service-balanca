package br.com.pactosolucoes.api.fake.service.balanca;

import java.lang.annotation.*;

/**
 * Responsável por descrever os passos do cenário do comportamento de um {@link BalancaService}.
 *
 * @author Bruno Cattany
 * @since 27/01/2019
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BalancaServiceScenarioDescriptor {

    /**
     * @return Deve descrever a primeira ação do simulador.
     */
    String firstActionDescription();

    /**
     * @return Deve descrever a segunda ação do simulador.
     */
    String secondActionDescription();

}
