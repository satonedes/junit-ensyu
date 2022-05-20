package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	NumberUtils num = new NumberUtils();
	
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
	void test1() {
		boolean result = num.isEven(10);
		assertEquals(true, result, "isEven()は失敗です");
	}
	void test2() {
		boolean result = num.isEven(7);
		assertEquals(false, result, "isEven()は失敗です");
	}

}
