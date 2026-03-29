package padroescriacao.abstractfactory;

public class MontagemVeiculo {

    private Motor motor;
    private Roda roda;

    public MontagemVeiculo(FabricaVeiculo fabrica) {
        this.motor = fabrica.createMotor();
        this.roda = fabrica.createRoda();
    }

    public String testarMotor() {
        return this.motor.emitirSom();
    }

    public String verificarRoda() {
        return this.roda.obterDescricao();
    }
}