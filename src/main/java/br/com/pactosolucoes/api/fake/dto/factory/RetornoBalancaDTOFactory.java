package br.com.pactosolucoes.api.fake.dto.factory;

import br.com.pactosolucoes.api.fake.dto.RetornoBalancaDTO;

/**
 * @author Bruno Cattany
 * @since 07/01/2019
 */
public class RetornoBalancaDTOFactory {

    public static RetornoBalancaDTO getRetornoFalseResultadoZerado() {
        return new RetornoBalancaDTO();
    }

    public static RetornoBalancaDTO getRetornoFalseResultadoZeradoAlturaPreenchido() {
        RetornoBalancaDTO retornoBalancaDTO = new RetornoBalancaDTO();
        retornoBalancaDTO.getRetorno().setAltura(165);
        return retornoBalancaDTO;
    }

    /**
     * @return um DTO com todos os valores preenchidos, ou seja, nenhum zerado.
     */
    public static RetornoBalancaDTO getRetornoFalseResultadoAleatorio() {
        return new RetornoBalancaDTO(
                170,
                26.2,
                1.0,
                0.2529,
                18.780354,
                55.479646,
                1.0,
                0.5315,
                1.0,
                2.0,
                52.686646,
                51,
                2,
                true
        );
    }

    /**
     * @return um DTO com alguns valores obrigatórios zerados, desta forma, denominando-se como <b>resultado parcial</b>.
     */
    public static RetornoBalancaDTO getRetornoFalseResultadoParcial() {
        return new RetornoBalancaDTO(
                170,
                26.2,
                1.0,
                0.2529,
                18.780354,
                55.479646,
                0.0,
                0.5315,
                0.0,
                2.0,
                52.686646,
                0,
                2,
                false
        );
    }

}
