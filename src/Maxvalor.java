import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Maxvalor {
	DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
	@Test
	void test() {
		
		assertEquals(40.0, tank.getDepositoMax());
	}

}
