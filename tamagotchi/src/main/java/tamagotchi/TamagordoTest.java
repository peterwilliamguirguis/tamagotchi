package tamagotchi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TamagordoTest {
	@Test
	public void tamagordoShouldNotDieDueToTooManyCookies() throws Exception {
		Tamagotchi tama = new TamaGordo("gordo", 90);
		tama.riceviBiscotti(100,tama);
		tama.riceviBiscotti(100,tama);
		assertTrue(!tama.sonoTriste(tama));
		assertTrue(!tama.sonoTriste(tama));
	}

	@Test
	public void tamagordoDiesDueToHunger() throws Exception {
		Tamagotchi tama = new TamaGordo("gordo", 0);
		assertTrue(tama.sonoMorto());
	}
}
