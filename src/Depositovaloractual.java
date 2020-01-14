import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Depositovaloractual {
	DepositoCombustible tank = new DepositoCombustible(40.0,0.0);

	@Test
	public void valordeposito() {
		assertEquals(0.0, tank.getDepositoNivel());
	}

}
