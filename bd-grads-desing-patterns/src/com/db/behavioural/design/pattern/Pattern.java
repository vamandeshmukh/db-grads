package com.db.behavioural.design.pattern;

/**
 * 
 * @author Vaman Deshmukh
 *
 */
// games - cricket, football, hockey 
// game-player 

interface Visitable {
	void accept(Visitor visitor);
}

interface Visitor {
	void playGame(Game game);
}

abstract class Game {
	int score;

	abstract void getScore();
}

class Cricket extends Game implements Visitable {
	@Override
	void getScore() {
		System.out.println(this.score);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.playGame(this);
	}

	@Override
	public String toString() {
		return "Cricket [score=" + score + "]";
	}

}

class Football extends Game implements Visitable {
	@Override
	void getScore() {
		System.out.println(this.score);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.playGame(this);
	}

	@Override
	public String toString() {
		return "Football [score=" + score + "]";
	}

}

class GamePlayer implements Visitor {

	@Override
	public void playGame(Game game) {
		System.out.println("Playing..." + game.toString());

	}

}

public class Pattern {
	public static void main(String[] args) {

		Visitor visitor = new GamePlayer();

		Visitable v1 = new Cricket();
		v1.accept(visitor);

		Visitable v2 = new Football();
		v2.accept(visitor);
	}

}
