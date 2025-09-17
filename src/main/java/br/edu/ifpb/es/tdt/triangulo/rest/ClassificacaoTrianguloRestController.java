package br.edu.ifpb.es.tdt.triangulo.rest;


import br.edu.ifpb.es.tdt.triangulo.model.ClassificacaoTriangulo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/triangulo")
public class ClassificacaoTrianguloRestController implements ClassificacaoTrianguloRestControllerApi {

    @GetMapping("/classificar")
    public ResponseEntity<ClassificacaoTriangulo> getClassificacaoTriangulo(@RequestParam String lado1,
                                                                            @RequestParam String lado2,
                                                                            @RequestParam String lado3) {
        return new ResponseEntity<>(ClassificacaoTriangulo.EQUILÁTERO, HttpStatus.OK);
    }

}
