import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Mediacapacidad {

	DepositoCombustible tank = new DepositoCombustible(20.0,0.0);

	@Test
	public void valordeposito() {
		assertEquals(false, tank.estaLleno());
	
	}

}
