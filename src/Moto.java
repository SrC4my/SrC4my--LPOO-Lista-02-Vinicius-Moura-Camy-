public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano, "Moto");
        this.cilindradas = cilindradas;
    }

    public void exibirCilindradas() {
        System.out.println("Cilindradas: " + cilindradas);
    }

    @Override
    public void ligar() {
        System.out.println("A moto está ligada.");
    }
}
