package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ItemStockTest {
	Item item = new Item(null, 0);
	ItemStock stock = new ItemStock();

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
	@DisplayName("初期状態で0")
	void test1() {
		int result = stock.getNum(item);
		assertEquals(0, result);
	}
	@Test
	@DisplayName("初期状態でitemを追加すると1")
	void test2() {
		stock.add(item);
		int result = stock.getNum(item);
		assertEquals(1, result);
	}
	@Test
	@DisplayName("itemが1つ追加されている状態で1")
	void test3() {
		Item item = new Item("綿", 100);
		stock.add(item);
		int result = stock.getNum(item);
		assertEquals(1, result);
	}
	@Test
	@DisplayName("itemが1つ追加されている状態でaddで同じItemオブジェクト追加すると2")
	void test4() {
		Item item = new Item("綿", 100);
		stock.add(item);
		Item item2 = new Item("綿", 100);
		stock.add(item2);
		int result = stock.getNum(item2);
		assertEquals(2, result);
	}
	@Test
	@DisplayName("itemが1つ追加されている状態でaddで異なるItemオブジェクトを追加すると1")
	void test5() {
		Item item = new Item("綿", 100);
		stock.add(item);
		Item item2 = new Item("糸", 100);
		stock.add(item2);
		int result = stock.getNum(item2);
		assertEquals(1, result);
	}

}
