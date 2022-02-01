package com.kata.yatzy.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.kata.yatzy.interfaces.Strategy;

public class TwoPair implements Strategy {

	@Override
	public int doOperation(int... args) {
		List<Integer> list = Arrays.stream(args).boxed().collect(Collectors.toList());
		Set<Integer> pairs = list.stream().filter(e -> Collections.frequency(list, e) >= 2).collect(Collectors.toSet());

		return pairs.size() == 2 ? pairs.stream().mapToInt(Integer::intValue).sum() * 2 : 0;
	}

}
