package padroescriacao.abstractfactory;

public class FabricaMoto implements FabricaVeiculo {
    @Override
    public Motor createMotor() {
        return new MotorMoto();
    }

    @Override
    public Roda createRoda() {
        return new RodaMoto();
    }
}