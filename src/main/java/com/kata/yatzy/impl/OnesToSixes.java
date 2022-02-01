package com.kata.yatzy.impl;

import java.util.Arrays;

import com.kata.yatzy.interfaces.StrategyForOnesToSixes;

public class OnesToSixes implements StrategyForOnesToSixes {

	@Override
	public int doOperation(long type, int... args) {
		return Arrays.stream(args).filter(e -> e == type).sum();
	}

}
