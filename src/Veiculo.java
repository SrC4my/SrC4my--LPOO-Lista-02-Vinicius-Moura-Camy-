public abstract class Veiculo implements IFuncoesVeiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String tipo;
    private boolean abastecido;
    private int velocidade;

    
    public Veiculo(String marca, String modelo, int ano, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipo = tipo;
        this.abastecido = false;
        this.velocidade = 0;
    }

    public void exibirTipo() {
        System.out.println("Tipo de Veículo: " + tipo);
    }

    public void exibirInformacoes() {
        System.out.println(
            "Marca: " + marca +
            ", Modelo: " + modelo +
            ", Ano: " + ano +
            ", Abastecido: " + (abastecido ? "Sim" : "Não") +
            ", Velocidade atual: " + velocidade + " km/h"
        );
    }

    
    @Override
    public void abastecer() {
        abastecido = true;
        System.out.println(tipo + " abastecido.");
    }

    @Override
    public void acelerar(int velocidade) {
        this.velocidade += velocidade;
        System.out.println(tipo + " acelerado para " + this.velocidade + " km/h.");
    }

    // Método abstrato ligar()
    public abstract void ligar();
}
