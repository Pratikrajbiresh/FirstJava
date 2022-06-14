import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

class MathSeriesTest {
	
	@Mock
	MathSeries mathSeries;
	
	@InjectMocks
	Random random;

	@Test
	void test() {
		MathSeries mathSeries = new MathSeries(new Random());
		String actual = mathSeries.fibo(3);
		String expect = "0,1,1";
		assertEquals(actual, expect);
	}
	
	@Test
	void fibo_base_n() {
		MathSeries mathSeries = new MathSeries(new Random());
		String actual = mathSeries.fibo(2);
		String expect = "0,1";
		assertEquals(actual, expect);
	}
	
	@Test
	void fibo_surprise_me() {
		// Test case function
		// Mock the collaborator object ---- Dummy object ---- Random
		// if on the dummy object nextInt(????) is callled -----
		MathSeries mathSeries = new MathSeries(new Random());
		// compare actual --- expect
		String actual = mathSeries.fibo(null);
		String expect = "0,1,1,2,3,5";
		assertEquals(actual, expect);
	}

}
