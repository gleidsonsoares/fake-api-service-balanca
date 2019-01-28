package br.com.pactosolucoes.api.fake.service.balanca.impl;

import br.com.pactosolucoes.api.fake.dto.RetornoBalancaDTO;
import br.com.pactosolucoes.api.fake.service.balanca.BalancaService;

import static java.lang.System.out;

/**
 * @author Bruno Cattany
 * @since 27/01/2019
 */
public abstract class AbstractBalancaService implements BalancaService {

    @Override
    public RetornoBalancaDTO simularRetornoBalanca(Integer contadorChamadasRetornoBalanca, Integer indexContadorProximaAcao) {
        contadorChamadasRetornoBalanca++;

        logarExecucaoCenario(contadorChamadasRetornoBalanca);

        if (contadorChamadasRetornoBalanca < indexContadorProximaAcao) {
            return getRetornoBalancaPrimeiraAcao();
        } else {
            return getRetornoBalancaSegundaAcao();
        }
    }

    abstract RetornoBalancaDTO getRetornoBalancaPrimeiraAcao();

    abstract RetornoBalancaDTO getRetornoBalancaSegundaAcao();

    private void logarExecucaoCenario(Integer contadorChamadasRetornoBalanca) {
        out.println("****");
        out.println("Tentativa nº " + contadorChamadasRetornoBalanca + " de ligar a balança.");
        out.println(this.getScenarioDescription());
        out.println("****");
    }

}
