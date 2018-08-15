package test;

import static org.junit.Assert.assertEquals;

public class InternationalRoosterTest {

	@org.junit.Test
	public void testInternationalRooster() {
		InternationalRooster ir = new InternationalRooster();
		ir.sing("German");
		assertEquals(ir.word, "kikeriki");
		
	}
}

