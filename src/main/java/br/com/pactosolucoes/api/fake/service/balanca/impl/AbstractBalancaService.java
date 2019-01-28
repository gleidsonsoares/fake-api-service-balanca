package br.com.pactosolucoes.api.fake.service.balanca.impl;

import br.com.pactosolucoes.api.fake.config.properties.BeanConfigurableByProperties;
import br.com.pactosolucoes.api.fake.dto.RetornoBalancaDTO;
import br.com.pactosolucoes.api.fake.service.balanca.BalancaService;
import br.com.pactosolucoes.api.fake.service.balanca.exception.BalancaDesligadaException;

import static java.lang.System.out;

/**
 * @author Bruno Cattany
 * @since 27/01/2019
 */
public abstract class AbstractBalancaService implements BalancaService, BeanConfigurableByProperties {

    @Override
    public RetornoBalancaDTO simularRetornoBalanca(Integer contadorChamadasRetornoBalanca, Integer indexContadorProximaAcao, Integer threadSleepingTimeSeconds) throws InterruptedException {
        if (contadorChamadasRetornoBalanca == null) {
            throw new BalancaDesligadaException();
        }

        contadorChamadasRetornoBalanca++;

        logarExecucaoCenario(contadorChamadasRetornoBalanca, threadSleepingTimeSeconds);

        Thread.sleep(threadSleepingTimeSeconds);

        if (contadorChamadasRetornoBalanca < indexContadorProximaAcao) {
            return getRetornoBalancaPrimeiraAcao();
        } else {
            return getRetornoBalancaSegundaAcao();
        }
    }

    abstract RetornoBalancaDTO getRetornoBalancaPrimeiraAcao();

    abstract RetornoBalancaDTO getRetornoBalancaSegundaAcao();

    private void logarExecucaoCenario(Integer contadorChamadasRetornoBalanca, Integer threadSleepingTimeSeconds) {
        out.println("****");
        out.println("Tentativa nº " + contadorChamadasRetornoBalanca + " de ligar a balança.");
        out.println("A thread vai dormir " + threadSleepingTimeSeconds + " segundos e executar o cenário.\n");
        out.println(this.getScenarioDescription());
        out.println("****");
    }

}
