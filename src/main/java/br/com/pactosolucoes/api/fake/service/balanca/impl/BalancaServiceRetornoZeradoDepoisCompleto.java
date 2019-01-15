package br.com.pactosolucoes.api.fake.service.balanca.impl;

import br.com.pactosolucoes.api.fake.dto.RetornoBalancaDTO;
import br.com.pactosolucoes.api.fake.service.balanca.BalancaService;
import org.springframework.stereotype.Service;

import static br.com.pactosolucoes.api.fake.dto.factory.RetornoBalancaDTOFactory.getRetornoFalseResultadoAleatorio;
import static br.com.pactosolucoes.api.fake.dto.factory.RetornoBalancaDTOFactory.getRetornoFalseResultadoZerado;

/**
 * @author Bruno Cattany
 * @since 07/01/2019
 */
@Service
public class BalancaServiceRetornoZeradoDepoisCompleto implements BalancaService {

    @Override
    public RetornoBalancaDTO simularRetornoBalanca(Integer contadorChamadasRetornoBalanca, Integer indexContadorProximaAcao) {
        RetornoBalancaDTO retornoBalancaDTO;

        if (contadorChamadasRetornoBalanca < indexContadorProximaAcao) {
            retornoBalancaDTO = getRetornoFalseResultadoZerado();
        } else {
            retornoBalancaDTO = getRetornoFalseResultadoAleatorio();
        }

        return retornoBalancaDTO;
    }
}
