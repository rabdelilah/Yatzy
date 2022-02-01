package com.kata.yatzy.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public interface Strategy {
	public int doOperation(int... args);

	static List<Integer> argsToList(int... args) {
		return Arrays.stream(args).boxed().collect(Collectors.toList());
	}
}