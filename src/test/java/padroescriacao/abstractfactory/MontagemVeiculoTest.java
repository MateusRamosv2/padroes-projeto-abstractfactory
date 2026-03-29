package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MontagemVeiculoTest {

    @Test
    void deveTestarMotorCarro() {
        FabricaVeiculo fabrica = new FabricaCarro();
        MontagemVeiculo veiculo = new MontagemVeiculo(fabrica);
        assertEquals("Vrum vrum de Motor de Carro", veiculo.testarMotor());
    }

    @Test
    void deveTestarMotorMoto() {
        FabricaVeiculo fabrica = new FabricaMoto();
        MontagemVeiculo veiculo = new MontagemVeiculo(fabrica);
        assertEquals("Randandan de Motor de Moto", veiculo.testarMotor());
    }

    @Test
    void deveVerificarRodaCarro() {
        FabricaVeiculo fabrica = new FabricaCarro();
        MontagemVeiculo veiculo = new MontagemVeiculo(fabrica);
        assertEquals("Roda de liga leve aro 15 para Carro", veiculo.verificarRoda());
    }

    @Test
    void deveVerificarRodaMoto() {
        FabricaVeiculo fabrica = new FabricaMoto();
        MontagemVeiculo veiculo = new MontagemVeiculo(fabrica);
        assertEquals("Roda raiada aro 17 para Moto", veiculo.verificarRoda());
    }
}