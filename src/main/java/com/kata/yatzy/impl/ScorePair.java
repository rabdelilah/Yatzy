package com.kata.yatzy.impl;

import java.util.Collections;
import java.util.List;

import com.kata.yatzy.interfaces.Strategy;

public class ScorePair implements Strategy {

	@Override
	public int doOperation(int... args) {
		List<Integer> list = Strategy.argsToList(args);
		return list.stream().filter(e -> Collections.frequency(list, e) == 2).max(Integer::compare).orElse(0) * 2;
	}

}
