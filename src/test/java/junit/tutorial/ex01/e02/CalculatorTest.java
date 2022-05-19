package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAllが呼ばれました");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAllが呼ばれました");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEachが呼ばれました");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEachが呼ばれました");
	}

	@Test
	@DisplayName("0の時例外")
	void testDivide() {
		Calculator calculator = new Calculator();
		assertThrows(IllegalArgumentException.class,() -> calculator.divide(2,0));
	}

}
