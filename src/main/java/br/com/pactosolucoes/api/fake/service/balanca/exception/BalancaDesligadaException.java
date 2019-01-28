package br.com.pactosolucoes.api.fake.service.balanca.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exceção personalizada para quando houver tentativa de pegar o resultado da balança, mas a balança não foi ligada previamente.
 *
 * @author Bruno Cattany
 * @since 27/01/2019
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BalancaDesligadaException extends RuntimeException {

    public BalancaDesligadaException() {
        super("A balança não foi ligada. Por favor, acione o recurso '/ControladorBalanca/ControleBalanca.LigarBalanca' antes!");
    }
}
