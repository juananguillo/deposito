import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Vacio {
	DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
	@Test
	public void test() {
		assertEquals(true, tank.estaVacio());
		
	}

}
