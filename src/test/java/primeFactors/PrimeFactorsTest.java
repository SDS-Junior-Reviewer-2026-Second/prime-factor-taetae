package primeFactors;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorsTest {

	@Test
	void testPrimeFactorOf1() {
		PrimeFactors primeFactors = new PrimeFactors();
		assertEquals(Arrays.asList(), primeFactors.factor(1));
	}

	@Test
	void testPrimeFactorOf6() {
		PrimeFactors primeFactors = new PrimeFactors();
		assertEquals(Arrays.asList(2,3), primeFactors.factor(6));
	}

	@Test
	void testPrimeFactorOf12() {
		PrimeFactors primeFactors = new PrimeFactors();
		assertEquals(Arrays.asList(2,2,3), primeFactors.factor(12));
	}

	@Test
	void testPrimeFactor420() {
		PrimeFactors primeFactors = new PrimeFactors();
		assertEquals(Arrays.asList(2,2,3,5,7), primeFactors.factor(420));
	}

	// Optimized Factorization Tests
	@Test
	void testOptimizedFactorOf12() {
		PrimeFactors primeFactors = new PrimeFactors();
		assertEquals(Arrays.asList(2,2,3), primeFactors.optimizedFactor(12));
	}



}
