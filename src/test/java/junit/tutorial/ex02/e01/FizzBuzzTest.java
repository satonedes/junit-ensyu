package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	FizzBuzz fizz = new FizzBuzz();
	
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
	@DisplayName("16を指定して1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,B」uzz,11,Fizz,13,14,FizzBuzz,16")
	void test() {
		
		List actual = fizz.createFizzBuzzList(16);
		String[] expectedArray = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz","16"};
//		String[] exptecteArray2 = new String[16];
//		exptecteArray2[0] = "1";
		
		List<String> excepted = Arrays.asList(expectedArray);
		List<String> actual2 = Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz","16");
		assertIterableEquals(excepted,actual);
	}

}
