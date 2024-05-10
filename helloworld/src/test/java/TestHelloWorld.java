import org.testng.annotations.Test;

public class TestHelloWorld {
	
	public static void main(String[] args) {
		
		System.out.println("Hello world!");
	}

	@Test
	public void testrunTest() {
		System.out.println("Тест успешно пройден");
	}
}
