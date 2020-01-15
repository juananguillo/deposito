import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Maxvalor {
	DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
	@Test
	public void test() {
		
		assertEquals(40.0, tank.getDepositoMax());
	}

}
