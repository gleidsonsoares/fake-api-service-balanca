package br.com.pactosolucoes.api.fake.controller;

import br.com.pactosolucoes.api.fake.dto.LigarBalancaDTO;
import br.com.pactosolucoes.api.fake.dto.NovaAvaliacaoDTO;
import br.com.pactosolucoes.api.fake.dto.RetornoBalancaDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Responsável por simular o controlador do TreinoWeb.
 *
 * @author Bruno Cattany
 * @since 07/01/2019
 */
@RequestMapping("/avaliacao")
@Controller
public class TreinoWebAvaliacaoController {

    @PostMapping(path = "{chave}/nova")
    public ResponseEntity<?> novaAvaliacao(@PathVariable(value = "chave") String chave,
                                           @RequestParam(value = "cliente") Integer cliente) {
        return ResponseEntity.ok(new NovaAvaliacaoDTO(false));
    }

    @PostMapping(path = "{chave}/bioimpedancia")
    public ResponseEntity<LigarBalancaDTO> salvarBioimpedancia(@PathVariable(value = "chave") String chave,
                                                               @RequestParam(value = "codigo") Integer codigo,
                                                               @RequestBody RetornoBalancaDTO retornoBalancaDTO) {
        return ResponseEntity.ok(new LigarBalancaDTO(true));
    }

}
