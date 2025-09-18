# Programa Validador de Senha

Escreva uma API REST que lê uma string e verificar se é uma senha válida. Para ser uma senha válida as seguintes regras (todas) devem ser atendidas:
1. Pelo menos 8 caracteres;
2. Contém letra maiúscula;
3. Contém número;
4. Contém caractere especial.

OBS: Caso a senha seja válida deve ser retornado o HTTP Status 204 e sem corpo na resposta da requisição. Caso a senha seja inválida deve ser retornado HTTP Status 400 e no corpo da resposta deve retornar um JSON com as regras não atendidas. O JSON deve ter o seguinte formato (exemplo):

```json
{
    "erros": ["Pelo menos 8 caracteres", "Contém letra maiúscula", "Contém número", "Contém caractere especial"]
}
```

# Requisitos

1. O endpoint deve ter a seguinte assinatura:
`http://localhost:8080/senha/validar`

2. O corpo da requisição esperado deve ser:

```json
{
  "valor": "<valor da senha>"
}
```

3. Implemente sua lógica em `ValidadorDeSenhaRestController#ehSenhaVálida`;

# Observações

1. A documentação da API (Swagger) pode ser consultada em: http://localhost:8080/swagger-ui/index.html
2. NÃO altere a assinatura do método `ValidadorDeSenhaRestController#ehSenhaVálida`;
3. NÃO publique sua solução no GitHub ou qualquer outro repositório público.
4. Atividade individual, artefatos enviados iguais terão as notas divididas.