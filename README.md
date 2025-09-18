# Programa classificador de Triângulo

Escreva uma API REST que lê três valores da query param. Os três valores representam os tamanhos dos lados de um triângulo. O programa deve classificar o triângulo em: EQUILÁTERO, ISÓSCELES, ESCALENO, INVÁLIDO. Triângulo escaleno é aquele em que nenhum dos lados é igual a outro. Triângulo isósceles é aquele em que dois dos seus lados são iguais. Triângulo equilátero tem todos os lados iguais.

OBS: Para que um triângulo seja válido, os tamanhos dos seus lados devem obedecer as seguintes inequações. Sendo a, b e c os tamanhos, temos:
* a + b > c
* a + c > b
* b + c > a

# Requisitos

1. O endpoint deve ter a seguinte assinatura:

`http://localhost:8080/triangulo/classificar?lado1=5&lado2=5&lado3=5`

2. Implemente sua lógica em `ClassificacaoTrianguloRestController#getClassificacaoTriangulo`;

# Observações

1. A documentação da API (Swagger) pode ser consultada em: http://localhost:8080/swagger-ui/index.html
2. NÃO altere a assinatura do método `ClassificacaoTrianguloRestController#getClassificacaoTriangulo`;
3. NÃO publique sua solução no GitHub ou qualquer outro repositório público.
4. Atividade individual, artefatos enviados iguais terão as notas divididas.