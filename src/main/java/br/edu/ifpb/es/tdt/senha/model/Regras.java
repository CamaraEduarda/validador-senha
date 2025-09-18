package br.edu.ifpb.es.tdt.senha.model;

public enum Regras {
    MIN_8_CARACTERES("Pelo menos 8 caracteres"),
    MIN_1_LETRA_MAIÚSCULA("Contém letra maiúscula"),
    MIN_1_DIGITO("Contém número"),
    MIN_1_CARACTERE_ESPECIAL("Contém caractere especial") // Qualquer coisa que não seja letra ou número
    ;

    private final String descricao;

    Regras(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
