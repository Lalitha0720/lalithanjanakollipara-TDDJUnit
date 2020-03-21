package TDDJUnit.tddjunitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AInFirst2PositionsTest {
	/*TODO list
	 * 1. "ABCD" => "BCD"
	 * 2. "AACD" => "CD" 
	 * 3. "BACD" => "BCD"
	 * 4. "BBAA" => "BBAA"
	 * 5. "AABAA" => "BAA"
	 * 6. "A" => ""
	 */

	@Test
	void test1stIsA()
	{
		AInFirst2Posistions ainfirst2pos = new AInFirst2Posistions();
		String actual = ainfirst2pos.check("ABCD");
		assertEquals("BCD",actual);
	}
	@Test
	void test1stTwoIsA()
	{
		AInFirst2Posistions ainfirst2pos = new AInFirst2Posistions();
		String actual = ainfirst2pos.check("AACD");
		assertEquals("CD",actual);
	}
	@Test
	void test2ndIsA()
	{
		AInFirst2Posistions ainfirst2pos = new AInFirst2Posistions();
		String actual = ainfirst2pos.check("BACD");
		assertEquals("BCD",actual);
	}
	@Test
	void testLastTwoIsA()
	{
		AInFirst2Posistions ainfirst2pos = new AInFirst2Posistions();
		String actual = ainfirst2pos.check("BBAA");
		assertEquals("BBAA",actual);
	}
	@Test
	void testFirstAndLastTwoIsA()
	{
		AInFirst2Posistions ainfirst2pos = new AInFirst2Posistions();
		String actual = ainfirst2pos.check("AABAA");
		assertEquals("BAA",actual);
	}@Test
	void testOnly1A()
	{
		AInFirst2Posistions ainfirst2pos = new AInFirst2Posistions();
		String actual = ainfirst2pos.check("A");
		assertEquals("",actual);
	}
}
