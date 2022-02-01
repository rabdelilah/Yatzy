package com.kata.yatzy.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.kata.yatzy.interfaces.Strategy;

public class YatzyOperation implements Strategy {

	@Override
	public int doOperation(int... args) {
		List<Integer> list = Arrays.stream(args).boxed().collect(Collectors.toList());
		return Collections.frequency(list, args[0]) == 5 ? 50 : 0;
	}

}
