package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Round;
import pkgCore.Die;
import pkgCore.Roll;
import pkgCore.eGameResult;

public class RoundTest {

	@Test
	public void TestRound() {
		for (int a = 0; a < 10000; a++) {
			Round test = new Round();
			assertTrue(test.geteGameResult() == pkgCore.eGameResult.CRAPS || test.geteGameResult() == pkgCore.eGameResult.NATURAL || test.geteGameResult() == pkgCore.eGameResult.SEVEN_OUT ||test.geteGameResult() == pkgCore.eGameResult.POINT);
			assertTrue(test.RollCount() >=1);
	}
	}
}


