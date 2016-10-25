package com.gbz.KataBuzzFizz;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class BuzzFizz {

	private static final String BUZZ = "Buzz";
	private static final String FIZZ = "Fizz";
	private static final String FIZZ_BUZZ = "FizzBuzz";
	private int size;

	public BuzzFizz(int size) {
		this.setSize(size);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<String> compute() {
		List<String> buzzFizzComputed = new ArrayList<String>();

		for (int i = 1; i < size + 1; i++) {
			computeBuzzFizzForAGivenNumber(buzzFizzComputed, i);
		}

		return buzzFizzComputed;
	}

	private void computeBuzzFizzForAGivenNumber(List<String> buzzFizzComputed, int i) {
		boolean haveBeenComputed = false;

		haveBeenComputed = haveBeenComputed || computeForBuzzFizz(buzzFizzComputed, i);
		haveBeenComputed = haveBeenComputed || computeforFizz(buzzFizzComputed, i);
		haveBeenComputed = haveBeenComputed || computeForBuzz(buzzFizzComputed, i);

		if (!haveBeenComputed) {
			buzzFizzComputed.add(String.valueOf(i));
		}

	}

	private boolean computeForBuzz(List<String> buzzFizzComputed, int i) {
		boolean haveBeenComputed = false;
		if (divisibleBy5(i)) {
			buzzFizzComputed.add(BUZZ);
			haveBeenComputed = true;
		}
		return haveBeenComputed;
	}

	private boolean computeforFizz(List<String> buzzFizzComputed, int i) {
		boolean haveBeenComputed = false;
		if (divisibleBy_3(i)) {
			buzzFizzComputed.add(FIZZ);
			haveBeenComputed = true;
		}
		return haveBeenComputed;
	}

	private boolean computeForBuzzFizz(List<String> buzzFizzComputed, int i) {
		boolean haveBeenComputed = false;
		
		if (divisibleBy_3(i) && divisibleBy5(i)) {
			buzzFizzComputed.add(FIZZ_BUZZ);
			haveBeenComputed = true;
		}
		
		return haveBeenComputed;
	}

	private boolean divisibleBy5(int i) {
		return i % 5 == 0;
	}

	private boolean divisibleBy_3(int i) {
		return i % 3 == 0;
	}

}
