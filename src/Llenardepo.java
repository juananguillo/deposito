import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Llenardepo {

	DepositoCombustible tank = new DepositoCombustible(40.0,40.0);

	@Test
	public void test() {
		tank.fill(-25.0);
		assertEquals(40.0, tank.getDepositoNivel());
	}

}
