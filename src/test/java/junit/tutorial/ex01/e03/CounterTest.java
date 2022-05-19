package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CounterTest {

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
	@DisplayName("初期状態で1")
	void test1() {
		Counter counter = new Counter();
		int result = counter.increment();
		assertEquals(1, result);
	}
	@Test
	@DisplayName("1回実行で2")
	void test2() {
		Counter counter = new Counter();
		int result = counter.increment();
		int result2 = counter.increment();
		assertEquals(2, result2);
	}
	@Test
	@DisplayName("50回実行で51")
	void test3() {
		Counter counter = new Counter();
		for (int i = 0; i < 50 ; i++) {
			counter.increment();
		}
		int result = counter.increment();
		assertEquals(51, result);
	}
}
