import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ContRestante {
	DepositoCombustible tank = new DepositoCombustible(40.0,40.0);

	@Test
	void test() {
		tank.consumir(-20.0);
		assertEquals(20.0, tank.getDepositoNivel());
	}
}
