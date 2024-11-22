package exa_1_QA_20224_1.exa_1_QA_20224;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	Question1 tester = new Question1();
	
	@Test
	public void Test_1() {
		String Expected_result= "a";
		double a=11, b=8;
		String mod="regular";
		String actual_result=tester.calculate(a, b, mod);
		assertEquals(Expected_result, actual_result); 
	}
	@Test
	public void Test_2() {
		String Expected_result= "b";
		double a=-5, b=-9;
		String mod="regular";
		String actual_result=tester.calculate(a, b, mod);
		assertEquals(Expected_result, actual_result); 
	}
	@Test
	public void Test_3() {
		String Expected_result= "a";
		double a=5, b=5;
		String mod="negatives";
		String actual_result=tester.calculate(a, b, mod);
		assertEquals(Expected_result, actual_result); 
	}
	@Test
	public void Test_4() {
		String Expected_result= "b";
		double a=-3, b=5;
		String mod="negatives";
		String actual_result=tester.calculate(a, b, mod);
		assertEquals(Expected_result, actual_result); 
	}			
	@Test
	public void Test_5() {
		String Expected_result= "b";
		double a=7, b=-0.5;
		String mod="negatives";
		String actual_result=tester.calculate(a, b, mod);
		assertEquals(Expected_result, actual_result); 
	}			
	@Test
	public void Test_6() {
		String Expected_result= "b";
		double a=0.5, b=3;
		String mod="reciprocals";
		String actual_result=tester.calculate(a, b, mod);
		assertEquals(Expected_result, actual_result); 
	}
	@Test
	public void Test_7() {
		String Expected_result= "error";
		double a=5, b=0;
		String mod="reciprocals";
		String actual_result=tester.calculate(a, b, mod);
		assertEquals(Expected_result, actual_result); 
	}				
				
			
			
		

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
