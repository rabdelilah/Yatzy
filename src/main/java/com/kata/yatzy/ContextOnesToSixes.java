package com.kata.yatzy;

import com.kata.yatzy.interfaces.StrategyForOnesToSixes;

public class ContextOnesToSixes {
	private StrategyForOnesToSixes strategy;

	public ContextOnesToSixes(StrategyForOnesToSixes strategy) {
		this.strategy = strategy;
	}

	public int executeStrategy(long type, int... args) {
		return strategy.doOperation(type, args);
	}
}