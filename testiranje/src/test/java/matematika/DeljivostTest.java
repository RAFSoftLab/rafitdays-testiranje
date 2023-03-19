package matematika;

import static org.junit.jupiter.api.Assertions.*; 

import org.junit.jupiter.api.Test;

class DeljivostTest {

	@Test
	void test1() {
		assertEquals(3, Deljivost.nzd(12, 9));
	}
	
	@Test
	void test2() {
		assertEquals(3, Deljivost.nzd(3, 9));
	}

}
