package chapter_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PermutationTest {

	Permutation myPermutation;
	
	@Before
	public void setup() {
		myPermutation = new Permutation();
	}
	
	@Test
	public void testPermutationCheckFalse() {
		assertFalse(myPermutation.permutationCheck("abc", "efg"));
	}
	
	@Test
	public void testPermutationCheckTrue() {
		assertTrue(myPermutation.permutationCheck("abc", "cba"));
	}
}
