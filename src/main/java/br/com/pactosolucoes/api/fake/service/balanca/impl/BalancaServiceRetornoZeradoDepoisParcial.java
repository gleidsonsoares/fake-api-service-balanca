package br.com.pactosolucoes.api.fake.service.balanca.impl;

import br.com.pactosolucoes.api.fake.dto.RetornoBalancaDTO;
import br.com.pactosolucoes.api.fake.service.balanca.BalancaServiceScenarioDescriptor;
import org.springframework.stereotype.Service;

import static br.com.pactosolucoes.api.fake.dto.factory.RetornoBalancaDTOFactory.getRetornoFalseResultadoParcial;
import static br.com.pactosolucoes.api.fake.dto.factory.RetornoBalancaDTOFactory.getRetornoFalseResultadoZerado;

/**
 * @author Bruno Cattany
 * @since 07/01/2019
 */
@Service
@BalancaServiceScenarioDescriptor(
        firstActionDescription = "Retornará um resultado zerado",
        secondActionDescription = "Retornará um resultado parcial"
)
public class BalancaServiceRetornoZeradoDepoisParcial extends AbstractBalancaService {

    @Override
    RetornoBalancaDTO getRetornoBalancaPrimeiraAcao() {
        return getRetornoFalseResultadoZerado();
    }

    @Override
    RetornoBalancaDTO getRetornoBalancaSegundaAcao() {
        return getRetornoFalseResultadoParcial();
    }
}
