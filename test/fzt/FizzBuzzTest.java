package fzt;

import fz.FizzBuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test7() {
		Assert.assertTrue(FizzBuzz.setFizzBuzz(7).equals("7"));
	}
	
	@Test
	public void testFizz() {
		Assert.assertTrue(FizzBuzz.setFizzBuzz(3).equals("Fizz"));
	}
	
	@Test
	public void testBuzz() {
		Assert.assertTrue(FizzBuzz.setFizzBuzz(5).equals("Buzz"));
	}
	
	@Test
	public void testFizzBuzz() {
		Assert.assertTrue(FizzBuzz.setFizzBuzz(15).equals("FizzBuzz"));
	}
	
	
}