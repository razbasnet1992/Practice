package com.samples.base;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

interface Calculator {
	static String s = "Rajendra";
	final String st = "basnet";
	

	default int addEven(int... nums) {
		return add(n -> n % 2 == 0, nums);

	}

	default int addOdd(int... nums) {
		return add(n -> n % 2 != 0, nums);
	}

	default int add(IntPredicate predicate, int... nums) { 
        return IntStream.of(nums)
                .filter(predicate)
                .sum();
    }

	}

