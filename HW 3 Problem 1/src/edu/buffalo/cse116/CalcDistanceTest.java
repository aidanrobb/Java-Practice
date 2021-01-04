package edu.buffalo.cse116;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcDistanceTest {
	
	@Test
	public void CalcTest1() {
		CalcDistance test1 = new CalcDistance();
		double ans1 = test1.totalDistance(3.0, 2.0, 4.0, 5.0, 7.0, 4.0);
		assertEquals(54.0,ans1,.001);
	}
	
	@Test
	public void CalcTest2() {
		CalcDistance test2 = new CalcDistance();
		double ans2 = test2.totalDistance(0.0,0.0,0.0,0.0,0.0,0.0);
		assertEquals(0.0,ans2, .001);
	}

}
