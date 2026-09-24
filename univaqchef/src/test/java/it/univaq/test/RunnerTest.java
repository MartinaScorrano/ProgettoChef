package it.univaq.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.univaq.Runner;

class RunnerTest {
	
	public Runner it;

	@BeforeEach
	public void setUp() {
		it = new Runner();
	}

	@Test
	void test() {
		assertEquals(10, it.somma(5, 5));
	}

}
