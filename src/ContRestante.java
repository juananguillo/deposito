import static org.junit.jupiter.api.Assertions.*;


import org.junit.Test;


public class ContRestante {
	DepositoCombustible tank = new DepositoCombustible(40.0,40.0);

	@Test
	public void test() {
		tank.consumir(-20.0);
		assertEquals(20.0, tank.getDepositoNivel());
	}
}
