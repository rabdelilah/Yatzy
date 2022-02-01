package com.kata.yatzy;

import com.kata.yatzy.interfaces.Strategy;

public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public int executeStrategy(int... args) {
		return strategy.doOperation(args);
	}

}