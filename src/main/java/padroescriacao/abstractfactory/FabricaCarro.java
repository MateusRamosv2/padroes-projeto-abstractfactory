package padroescriacao.abstractfactory;

public class FabricaCarro implements FabricaVeiculo {
    @Override
    public Motor createMotor() {
        return new MotorCarro();
    }

    @Override
    public Roda createRoda() {
        return new RodaCarro();
    }
}