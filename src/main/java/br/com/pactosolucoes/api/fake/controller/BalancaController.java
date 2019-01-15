package br.com.pactosolucoes.api.fake.controller;

import br.com.pactosolucoes.api.fake.dto.LigarBalancaDTO;
import br.com.pactosolucoes.api.fake.dto.RetornoBalancaDTO;
import br.com.pactosolucoes.api.fake.dto.UserProfileDTO;
import br.com.pactosolucoes.api.fake.service.balanca.BalancaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Responsável por simular o controlador do serviço controlador da balança.
 *
 * @author Bruno Cattany
 * @since 29/10/2018
 */
@RequestMapping("/ControladorBalanca")
@Controller
public class BalancaController {

    private static Integer CONTADOR_CHAMADAS_RETORNO_BALANCA = 0;

    private final BalancaService balancaService;

    @Autowired
    public BalancaController(BalancaService balancaService) {
        this.balancaService = balancaService;
    }

    @PostMapping(path = "/ControleBalanca.LigarBalanca")
    public ResponseEntity<LigarBalancaDTO> ligarBalanca(@RequestBody UserProfileDTO userProfileDTO) {
        CONTADOR_CHAMADAS_RETORNO_BALANCA = 0;

        return ResponseEntity.ok(new LigarBalancaDTO(true));
    }

    @GetMapping(path = "/ControleBalanca.PegarRetornoBalanca")
    public ResponseEntity<RetornoBalancaDTO> pegarRetornoBalanca(@RequestParam(value = "Id") Integer id) {
        CONTADOR_CHAMADAS_RETORNO_BALANCA++;

        System.out.println("Executarei a seguinte implementação de (BalancaService) -> " + balancaService);

        RetornoBalancaDTO retornoBalancaDTO = balancaService.simularRetornoBalanca(
                CONTADOR_CHAMADAS_RETORNO_BALANCA, 3
        );

        return ResponseEntity.ok(retornoBalancaDTO);
    }

}
