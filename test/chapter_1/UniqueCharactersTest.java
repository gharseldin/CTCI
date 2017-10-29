package chapter_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UniqueCharactersTest {

	UniqueCharacters uniqueCheck;
	
	@Before
	public void setup() {
		uniqueCheck = new UniqueCharacters();
	}
	
	@Test
	public void testStringWithUniqueCharacters() {
		assertTrue(uniqueCheck.hasUniqueCharacters("abcdefg"));
	}
	
	@Test
	public void testStringWithRedundantCharacters() {
		assertFalse(uniqueCheck.hasUniqueCharacters("abcdefga"));
	}
}
