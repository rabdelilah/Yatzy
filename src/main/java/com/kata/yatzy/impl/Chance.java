package com.kata.yatzy.impl;

import java.util.Arrays;

import com.kata.yatzy.interfaces.Strategy;

public class Chance implements Strategy {

	@Override
	public int doOperation(int... args) {
		return Arrays.stream(args).sum();
	}

}
