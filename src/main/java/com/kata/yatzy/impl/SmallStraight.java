package com.kata.yatzy.impl;

import java.util.Arrays;

import com.kata.yatzy.interfaces.Strategy;

public class SmallStraight implements Strategy {

	@Override
	public int doOperation(int... args) {
		return Arrays.stream(args).sum() == 15 ? 15 : 0;
	}
	
}
