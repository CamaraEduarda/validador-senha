package br.edu.ifpb.es.tdt.senha.rest;

import br.edu.ifpb.es.tdt.senha.dto.ErrosDTO;
import br.edu.ifpb.es.tdt.senha.dto.SenhaDTO;
import br.edu.ifpb.es.tdt.senha.model.Regras;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/senha")
public class ValidadorDeSenhaRestController implements ValidadorDeSenhaRestControllerApi {

    @PostMapping("/validar")
    public ResponseEntity<ErrosDTO> ehSenhaVálida(@RequestBody SenhaDTO dto) {

        String senha = dto.valor();
        List<Regras> erros = new ArrayList<>();

        // Escreva uma API REST que lê uma string e verificar se é uma senha válida. Para ser uma senha válida as seguintes regras (todas) devem ser atendidas:
        // 1. Pelo menos 8 caracteres;
        // 2. Contém letra maiúscula;
        // 3. Contém número;
        // 4. Contém caractere especial.

        //Verifica se é válida

        if (senha == null || senha.isEmpty()) {
            erros.add(Regras.MIN_8_CARACTERES);
            erros.add(Regras.MIN_1_LETRA_MAIÚSCULA);
            erros.add(Regras.MIN_1_DIGITO);
            erros.add(Regras.MIN_1_CARACTERE_ESPECIAL);
            
        } else {
            
            if (senha.length() < 8) {
                erros.add(Regras.MIN_8_CARACTERES);
            }

            if (!senha.matches(".*[A-Z].*")) {
                erros.add(Regras.MIN_1_LETRA_MAIÚSCULA);
            }

            if (!senha.matches(".*\\d.*")) {
                erros.add(Regras.MIN_1_DIGITO);
            }

            if (!senha.matches(".*[^a-zA-Z0-9].*")) {
                erros.add(Regras.MIN_1_CARACTERE_ESPECIAL);
            }
        }

        if (erros.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            ErrosDTO errosDTO = new ErrosDTO(erros.stream().map(Regras::getDescricao).toList().toArray(new String[0]));
            return new ResponseEntity<ErrosDTO>(errosDTO, HttpStatus.BAD_REQUEST);
        }
        
        
    }

}
