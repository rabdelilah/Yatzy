package com.kata.yatzy.impl;

import java.util.Collections;
import java.util.List;

import com.kata.yatzy.interfaces.Strategy;

public class FullHouse implements Strategy {

	@Override
	public int doOperation(int... args) {
		List<Integer> list = Strategy.argsToList(args);
		int treeKind = list.stream().filter(e -> Collections.frequency(list, e) == 3).findFirst().orElse(0);
		int towKind = list.stream().filter(e -> Collections.frequency(list, e) == 2).findFirst().orElse(0);

		return (treeKind != 0 && towKind != 0) ? (treeKind * 3) + (towKind * 2) : 0;
	}

}
