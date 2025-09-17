package br.edu.ifpb.es.tdt.triangulo.rest;

import br.edu.ifpb.es.tdt.triangulo.model.ClassificacaoTriangulo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Tag(name = "triangulo")
public interface ClassificacaoTrianguloRestControllerApi {

    @Operation(summary = "Classificar triângulo.",
            description = "Recupera a classificação de um triângulo conforme os lados informados.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Classificação realizada com sucesso.",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "400",
                    description = "Triângulo inválido.",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "500",
                    description = "Erro inesperado.",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = ProblemDetail.class))),
    })
    ResponseEntity<ClassificacaoTriangulo> getClassificacaoTriangulo(@RequestParam String lado1,
                                                                     @RequestParam String lado2,
                                                                     @RequestParam String lado3);

}
