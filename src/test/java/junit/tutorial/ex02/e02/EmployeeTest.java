package junit.tutorial.ex02.e02;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.tomcat.util.http.fileupload.impl.FileItemStreamImpl;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {

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
	@DisplayName("テキストファイルを指定して実行すると名前、名字、メールアドレスが反映されてEmployeeを取得できる")
	void test1() {
		try {
		InputStream  in = new FileInputStream("/junit-ensyu/src/main/java/junit/tutorial/ex01/e01/Employee.txt");
		Employee ichiro = new Employee();
		List<Employee> empList = ichiro.load(in);  // xxxx をemployee.txt のInputstreamってどうやって作る？
		assertAll("Employee",
				() -> assertEquals("Ichiro", ichiro.getFirstName()),
				() -> assertEquals("Tanaka", ichiro.getLastName()),
				() -> assertEquals("ichiro@example.com",ichiro.getEmail())
						);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}

}
