package padroescriacao.abstractfactory;

public interface FabricaVeiculo {
    Motor createMotor();
    Roda createRoda();
}