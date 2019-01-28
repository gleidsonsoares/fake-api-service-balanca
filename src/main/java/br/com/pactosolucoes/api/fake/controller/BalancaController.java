package br.com.pactosolucoes.api.fake.controller;

import br.com.pactosolucoes.api.fake.dto.LigarBalancaDTO;
import br.com.pactosolucoes.api.fake.dto.RetornoBalancaDTO;
import br.com.pactosolucoes.api.fake.dto.UserProfileDTO;
import br.com.pactosolucoes.api.fake.service.balanca.BalancaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static java.lang.System.out;

/**
 * Responsável por simular o controlador do serviço controlador da balança.
 *
 * @author Bruno Cattany
 * @since 29/10/2018
 */
@RequestMapping("/ControladorBalanca")
@Controller
public class BalancaController {

    private static Integer CONTADOR_CHAMADAS_RETORNO_BALANCA = null;

    private final BalancaService balancaService;

    @Autowired
    public BalancaController(BalancaService balancaService) {
        this.balancaService = balancaService;
    }

    @PostMapping(path = "/ControleBalanca.LigarBalanca")
    public ResponseEntity<LigarBalancaDTO> ligarBalanca(@RequestBody UserProfileDTO userProfileDTO) {
        CONTADOR_CHAMADAS_RETORNO_BALANCA = 0;

        logarLigarBalanca(userProfileDTO);

        return ResponseEntity.ok(new LigarBalancaDTO(true));
    }

    private void logarLigarBalanca(UserProfileDTO userProfileDTO) {
        out.println("****");
        out.println("Balança Ligada!");
        out.println("UserProfileDTO recebido ->");
        out.println(userProfileDTO);
        out.println("****");
    }

    @GetMapping(path = "/ControleBalanca.PegarRetornoBalanca")
    public ResponseEntity<RetornoBalancaDTO> pegarRetornoBalanca(@RequestParam(value = "Id") Integer id) throws InterruptedException {
        out.println("Id recebido -> " + id);

        RetornoBalancaDTO retornoBalancaDTO = balancaService.simularRetornoBalanca(
                CONTADOR_CHAMADAS_RETORNO_BALANCA,
                3,
                0
        );

        return ResponseEntity.ok(retornoBalancaDTO);
    }


}
