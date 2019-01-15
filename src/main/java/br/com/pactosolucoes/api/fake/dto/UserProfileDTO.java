package br.com.pactosolucoes.api.fake.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Bruno Cattany
 * @since 13/12/2018
 */
@Getter
@Setter
@ToString
public class UserProfileDTO {

    @JsonProperty("UserProfile")
    private UserProfile userProfile;

    @Getter
    @Setter
    @ToString
    public static class UserProfile {

        @JsonProperty("Id")
        private Integer id;

        @JsonProperty("Idade")
        private Integer idade;

        @JsonProperty("Sexo")
        private Integer sexo;

        @JsonProperty("Altura")
        private Integer altura;

        @JsonProperty("Atleta")
        private Integer atleta;

        @JsonProperty("NivelAtividade")
        private Integer nivelAtividade;

        @JsonProperty("Chave")
        private String Chave;

    }

}
