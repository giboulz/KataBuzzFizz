package com.gbz.KataBuzzFizz;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BuzzFizzTest {
	BuzzFizz sud = null;

	@Test
	public void compute_for_0_numbers() {
		// arrange
		sud = new BuzzFizz(0);

		// act
		List<String> res = sud.compute();

		// assert
		List<String> expected = Arrays.asList();

		assertThat(res, is(expected));
	}

	@Test
	public void compute_for_First_2_numbers() {
		// arrange
		sud = new BuzzFizz(2);

		// act
		List<String> res = sud.compute();

		// assert
		List<String> expected = Arrays.asList("1", "2");

		assertThat(res, is(expected));
	}

	@Test
	public void compute_get_a_Fizz_number_divisible_by_3() {
		// arrange
		sud = new BuzzFizz(3);

		// act
		List<String> res = sud.compute();

		// assert
		List<String> expected = Arrays.asList("1", "2", "Fizz");

		assertThat(res, is(expected));
	}

	@Test
	public void compute_get_a_Buzz_number_divible_by_5() {
		// arrange
		sud = new BuzzFizz(5);

		// act
		List<String> res = sud.compute();

		// assert
		List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz");

		assertThat(res, is(expected));
	}

	@Test
	public void compute_get_FizzBuzz_number_divisible_by_3_and_5() {
		// arrange
		sud = new BuzzFizz(15);

		// act
		List<String> res = sud.compute();

		// assert
		List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11",
				"Fizz", "13", "14", "FizzBuzz");

		assertThat(res, is(expected));
	}

	@Test
	public void compute_get_FizzBuzz_for_limite_maximum() {
		// arrange
		sud = new BuzzFizz(100);

		// act
		List<String> res = sud.compute();

		// assert
		List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11",
				"Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz", "Fizz", "22", "23", "Fizz", "Buzz",
				"26", "Fizz", "28", "29", "FizzBuzz", "31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz",
				"Buzz", "41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz", "Fizz", "52", "53",
				"Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz", "61", "62", "Fizz", "64", "Buzz", "Fizz", "67",
				"68", "Fizz", "Buzz", "71", "Fizz", "73", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz", "Fizz",
				"82", "83", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz", "91", "92", "Fizz", "94", "Buzz",
				"Fizz", "97", "98", "Fizz", "Buzz");

		assertThat(res, is(expected));
	}

}
