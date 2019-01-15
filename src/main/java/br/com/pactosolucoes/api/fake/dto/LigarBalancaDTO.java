package br.com.pactosolucoes.api.fake.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Bruno Cattany
 * @since 13/12/2018
 */
@Getter
@Setter
public class LigarBalancaDTO {

    @JsonProperty("Result")
    private final Boolean result;

    public LigarBalancaDTO(boolean result) {
        this.result = result;
    }
}
