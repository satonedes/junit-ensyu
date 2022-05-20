package junit.tutorial.ex02.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import junit.tutorial.ex02.e04.Range;

class ConsumptionTaxTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@ParameterizedTest
	@CsvSource({ "100,105","3000,3150", "50,52" })
	public void test(int aaa, int bbb) {
		ConsumptionTax con = new ConsumptionTax(5);
		int result = con.apply(aaa);
		assertEquals(bbb,result);
	}

	@ParameterizedTest
	@CsvSource({ "50,55" })
	public void test2(int aaa, int bbb) {
		ConsumptionTax con = new ConsumptionTax(10);
		int result = con.apply(aaa);
		assertEquals(bbb,result);
	}

	@ParameterizedTest
	@CsvSource({ "50,51" })
	public void test3(int aaa,int bbb) {
		ConsumptionTax con = new ConsumptionTax(3);
		int result = con.apply(aaa);
		assertEquals(bbb,result);
	}
}
