package junit.tutorial.ex02.e06;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FrameworksTest {

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
	@CsvSource({"GlassFish,Oracle", "GlassFish,DB2", "GlassFish,PostgreSQL", "GlassFish,MySQL", "JBoss,DB2", "JBoss,PostgreSQL","Tomcat,MySQL" })
	void test1(ApplicationServer appServer, Database db) {
		Frameworks frame = new Frameworks() ;
		boolean result = frame.isSupport(appServer, db);
		assertTrue(result);
	}
	@ParameterizedTest
	@CsvSource({"JBoss,Oracle", "JBoss,MySQL", "Tomcat,Oracle", "Tomcat,DB2", "Tomcat,PostgreSQL"})
	void test2(ApplicationServer appServer, Database db) {
		Frameworks frame = new Frameworks() ;
		boolean result = frame.isSupport(appServer, db);
		assertFalse(result);
	}
	
	

}
