import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Vacio {
	DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
	@Test
	void test() {
		assertEquals(true, tank.estaVacio());
		
	}

}
