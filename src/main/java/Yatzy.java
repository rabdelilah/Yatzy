import com.kata.yatzy.Context;
import com.kata.yatzy.ContextOnesToSixes;
import com.kata.yatzy.impl.Chance;
import com.kata.yatzy.impl.FourOfAKind;
import com.kata.yatzy.impl.FullHouse;
import com.kata.yatzy.impl.LargeStraight;
import com.kata.yatzy.impl.OnesToSixes;
import com.kata.yatzy.impl.ScorePair;
import com.kata.yatzy.impl.SmallStraight;
import com.kata.yatzy.impl.ThreeOfAKind;
import com.kata.yatzy.impl.TwoPair;
import com.kata.yatzy.impl.YatzyOperation;

public class Yatzy {

	protected int[] dice;

	public Yatzy(int d1, int d2, int d3, int d4, int d5) {
		dice = new int[5];
		dice[0] = d1;
		dice[1] = d2;
		dice[2] = d3;
		dice[3] = d4;
		dice[4] = d5;
	}

	public static int chance(int d1, int d2, int d3, int d4, int d5) {
		return new Context(new Chance()).executeStrategy(d1, d2, d3, d4, d5);
	}

	public static int yatzy(int... dice) {
		return new Context(new YatzyOperation()).executeStrategy(dice);
	}

	public static int scorePair(int d1, int d2, int d3, int d4, int d5) {
		return new Context(new ScorePair()).executeStrategy(d1, d2, d3, d4, d5);
	}

	public static int twoPair(int d1, int d2, int d3, int d4, int d5) {
		return new Context(new TwoPair()).executeStrategy(d1, d2, d3, d4, d5);
	}

	public static int fourOfAKind(int d1, int d2, int d3, int d4, int d5) {
		return new Context(new FourOfAKind()).executeStrategy(d1, d2, d3, d4, d5);
	}

	public static int threeOfAKind(int d1, int d2, int d3, int d4, int d5) {
		return new Context(new ThreeOfAKind()).executeStrategy(d1, d2, d3, d4, d5);
	}

	public static int smallStraight(int d1, int d2, int d3, int d4, int d5) {
		return new Context(new SmallStraight()).executeStrategy(d1, d2, d3, d4, d5);
	}

	public static int largeStraight(int d1, int d2, int d3, int d4, int d5) {
		return new Context(new LargeStraight()).executeStrategy(d1, d2, d3, d4, d5);
	}

	public static int fullHouse(int d1, int d2, int d3, int d4, int d5) {
		return new Context(new FullHouse()).executeStrategy(d1, d2, d3, d4, d5);
	}
	
	public static int ones(int d1, int d2, int d3, int d4, int d5) {
		return new ContextOnesToSixes(new OnesToSixes()).executeStrategy(1l, d1, d2, d3, d4, d5);
	}

	public static int twos(int d1, int d2, int d3, int d4, int d5) {
		return new ContextOnesToSixes(new OnesToSixes()).executeStrategy(2l, d1, d2, d3, d4, d5);
	}

	public static int threes(int d1, int d2, int d3, int d4, int d5) {
		return new ContextOnesToSixes(new OnesToSixes()).executeStrategy(3l, d1, d2, d3, d4, d5);
	}

	public int fours() {
		return new ContextOnesToSixes(new OnesToSixes()).executeStrategy(4l, dice);
	}

	public int fives() {
		return new ContextOnesToSixes(new OnesToSixes()).executeStrategy(5l, dice);
	}

	public int sixes() {
		return new ContextOnesToSixes(new OnesToSixes()).executeStrategy(6l, dice);
	}
}
