package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ToolTest {

	@Test
	void test() {
		Rock rock=new Rock(7);
		Scissors scissors=new Scissors(7);
		boolean output=rock.fight(scissors);
		assertEquals(true, output);
	}

}
