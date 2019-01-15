package br.com.pactosolucoes.api.fake.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Bruno Cattany
 * @since 03/01/2019
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NovaAvaliacaoDTO {

    @JsonProperty("nova")
    private Boolean nova;

}
