package com.kata.yatzy.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.kata.yatzy.interfaces.Strategy;

public class ThreeOfAKind implements Strategy {

	@Override
	public int doOperation(int... args) {
		List<Integer> list = Arrays.stream(args).boxed().collect(Collectors.toList());
		Set<Integer> pairs = list.stream().filter(e -> Collections.frequency(list, e) >= 3).collect(Collectors.toSet());

		return pairs.size() == 1 ? pairs.stream().mapToInt(Integer::intValue).sum() * 3 : 0;

	}

}
