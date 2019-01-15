package br.com.pactosolucoes.api.fake.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Bruno Cattany
 * @since 13/12/2018
 */
@Getter
@Setter
@NoArgsConstructor
public class RetornoBalancaDTO {

    @JsonProperty("Result")
    private Boolean result;

    @JsonProperty("Retorno")
    private Retorno retorno = new Retorno();

    public RetornoBalancaDTO(Integer altura, Double peso, Double imc,
                             Double percentagemGordura, Double pesoGordura, Double pesoNaoGordura,
                             Double gorduraVisceral, Double percentagemAgua, Double pesoAgua,
                             Double pesoOssos, Double pesoMusculos, Integer idadeMetabolica,
                             Integer fisico, Boolean result) {
        retorno.altura = altura;
        retorno.peso = peso;
        retorno.imc = imc;
        retorno.percentagemGordura = percentagemGordura;
        retorno.pesoGordura = pesoGordura;
        retorno.pesoNaoGordura = pesoNaoGordura;
        retorno.gorduraVisceral = gorduraVisceral;
        retorno.percentagemAgua = percentagemAgua;
        retorno.pesoAgua = pesoAgua;
        retorno.pesoOssos = pesoOssos;
        retorno.pesoMusculos = pesoMusculos;
        retorno.idadeMetabolica = idadeMetabolica;
        retorno.fisico = fisico;

        this.result = result;
    }

    @Getter
    @Setter
    public static class Retorno {

        @JsonProperty("Altura")
        private Integer altura;

        @JsonProperty("Peso")
        private Double peso;

        @JsonProperty("IMC")
        private Double imc;

        @JsonProperty("PercentagemGordura")
        private Double percentagemGordura;

        @JsonProperty("PesoGordura")
        private Double pesoGordura;

        @JsonProperty("PesoNaoGordura")
        private Double pesoNaoGordura;

        @JsonProperty("GorduraVisceral")
        private Double gorduraVisceral;

        @JsonProperty("PercentagemAgua")
        private Double percentagemAgua;

        @JsonProperty("PesoAgua")
        private Double pesoAgua;

        @JsonProperty("PesoOssos")
        private Double pesoOssos;

        @JsonProperty("PesoMusculos")
        private Double pesoMusculos;

        @JsonProperty("IdadeMetabolica")
        private Integer idadeMetabolica;

        @JsonProperty("Fisico")
        private Integer fisico;
    }

}
