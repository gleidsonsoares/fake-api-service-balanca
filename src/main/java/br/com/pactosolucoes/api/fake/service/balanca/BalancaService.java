package br.com.pactosolucoes.api.fake.service.balanca;

import br.com.pactosolucoes.api.fake.controller.BalancaController;
import br.com.pactosolucoes.api.fake.dto.RetornoBalancaDTO;
import br.com.pactosolucoes.api.fake.dto.UserProfileDTO;
import br.com.pactosolucoes.api.fake.dto.factory.RetornoBalancaDTOFactory;

/**
 * Representa o <b>Serviço Controlador da Balança</b>.
 *
 * @author Bruno Cattany
 * @since 07/01/2019
 */
public interface BalancaService {

    /**
     * Deve simular o comportamento interno do <b>Serviço Controlador da Balança</b>.
     *
     * @param contadorChamadasRetornoBalanca Dado um ciclo que se inicia a partir da chamada do serviço {@link BalancaController#ligarBalanca(UserProfileDTO)},
     *                                       este campo representa a quantidade atual de vezes que
     *                                       o serviço {@link BalancaController#pegarRetornoBalanca(Integer)} foi chamado.
     * @param indexContadorProximaAcao       indica em qual rodada indicada pelo valor de <code>contadorChamadasRetornoBalanca</code>
     *                                       será realizado a próxima ação.
     *
     * @return um {@link RetornoBalancaDTO} baseado no cenário proposto pela implementação.
     * Veja a fábrica do mesmo em: {@link RetornoBalancaDTOFactory}.
     */
    RetornoBalancaDTO simularRetornoBalanca(Integer contadorChamadasRetornoBalanca,
                                            Integer indexContadorProximaAcao);

}
