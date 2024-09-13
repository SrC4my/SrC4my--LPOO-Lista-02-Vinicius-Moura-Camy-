public class App {
    public static void main(String[] args) {

        
        Carro carro = new Carro("Fiat", "Uno", 2020);
        carro.exibirInformacoes();
        carro.ligar();
        
        
        carro.abastecer();
        carro.acelerar(60);
        carro.exibirInformacoes();

        
        Moto moto = new Moto("Honda", "FAN 160", 2024, 250);
        moto.exibirInformacoes();
        moto.exibirCilindradas();
        moto.ligar();
        
        
        moto.abastecer();
        moto.acelerar(80);
        moto.exibirInformacoes();

        
        Veiculo[] veiculos = { carro, moto };

        for (Veiculo veiculo : veiculos) {
            veiculo.ligar();
            veiculo.acelerar(20);
        }
    }
}
