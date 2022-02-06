package poo.model;

public class Endereco {

    enum TipoEndereco {RESIDENCIAL, ENTREGA, TRABALHO}

    String endereco;
    String numero;
    String complemento;
    String bairro;
    String estado;
    String cep;
    TipoEndereco tipo;
}
