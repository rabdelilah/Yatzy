package com.kata.yatzy.impl;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.kata.yatzy.interfaces.Strategy;

public class FourOfAKind implements Strategy {

	@Override
	public int doOperation(int... args) {
		List<Integer> list = Strategy.argsToList(args);
		Set<Integer> pairs = list.stream().filter(e -> Collections.frequency(list, e) >= 4).collect(Collectors.toSet());

		return pairs.size() == 1 ? pairs.stream().mapToInt(Integer::intValue).sum() * 4 : 0;
	}

}
