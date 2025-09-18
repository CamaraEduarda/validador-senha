package br.edu.ifpb.es.tdt.senha.rest;

import br.edu.ifpb.es.tdt.senha.dto.ErrosDTO;
import br.edu.ifpb.es.tdt.senha.dto.SenhaDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;

@Tag(name = "senha")
public interface ValidadorDeSenhaRestControllerApi {

    @Operation(summary = "Validar senha.",
               description = "Lê a string e verifica se é uma senha válida.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204",
                    description = "Senha válida.",
                    content = @Content),
            @ApiResponse(responseCode = "400",
                    description = "Senha inválida.",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = ErrosDTO.class))),
            @ApiResponse(responseCode = "500",
                    description = "Erro inesperado.",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = ProblemDetail.class))),
    })
    ResponseEntity<ErrosDTO> ehSenhaVálida(@RequestBody SenhaDTO dto);
}
