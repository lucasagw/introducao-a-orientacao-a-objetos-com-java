package poo.model;

public class Pessoa {

    public enum TipoPesssoa {FISICA, JURIDICA}

    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;
    public Integer codigo;
    public String nome;
    private String documento;
    public TipoPesssoa tipo;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (documento == null || documento.isEmpty()) {
            throw new RuntimeException("Documento não pode ser nulo ou vazio");
        }

        if (documento.length() == TAMANHO_CPF) {
            // tipo = TipoPesssoa.FISICA;
            setDocumento(documento, tipo = TipoPesssoa.FISICA);
        } else if (documento.length() == TAMANHO_CNPJ) {
            // tipo = TipoPesssoa.JURIDICA;
            setDocumento(documento, tipo = TipoPesssoa.JURIDICA);
        } else {
            throw new RuntimeException("Documento inválido para pessoa física ou jurídica");
        }
    }

    private void setDocumento(String documento, TipoPesssoa tipo) {
        this.documento = documento;
        this.tipo = tipo;
    }

    public TipoPesssoa getTipo() {
        return tipo;
    }
}
