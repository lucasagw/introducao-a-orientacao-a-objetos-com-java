package poo.model;

public class EntregaCartaoApp {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        // endereco.cep = "0000-000";

        Cliente cliente = new Cliente();

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("endereco add com sucesso");
        } catch (Exception e) {
            System.err.println("Houve um erro ao adicioanr endereco: " + e.getMessage());
        }
    }
}
