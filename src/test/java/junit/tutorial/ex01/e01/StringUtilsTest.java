package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilsTest {


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
	@DisplayName("aaaの時aaa")
	void testToSnakeCase1() {
		String result = StringUtils.toSnakeCase("aaa");
		assertEquals("aaa", result,"compile(aaa)が失敗");
	}
	@Test
	@DisplayName("HelloWorldの時hello_world")
	void testToSnakeCase2() {
		String result = StringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world", result,"compile(Helloworld)が失敗");
	}
	@Test
	@DisplayName("practiceJunitの時practice_junit")
	void testToSnakeCase3() {
		String result = StringUtils.toSnakeCase("practiceJunit");
		assertEquals("practice_junit", result,"compile(practiceJunit)が失敗");
	}
}
