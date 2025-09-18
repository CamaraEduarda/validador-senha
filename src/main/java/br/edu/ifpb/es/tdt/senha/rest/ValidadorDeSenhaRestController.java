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
//        return ResponseEntity.noContent().build();
        List<Regras> erros = new ArrayList<>();
        erros.add(Regras.MIN_8_CARACTERES);
        ErrosDTO errosDTO = new ErrosDTO(erros.stream().map(Regras::getDescricao).toList().toArray(new String[0]));
        return new ResponseEntity<ErrosDTO>(errosDTO, HttpStatus.BAD_REQUEST);
    }

}
