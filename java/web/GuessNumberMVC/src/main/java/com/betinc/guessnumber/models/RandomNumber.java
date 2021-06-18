package com.betinc.guessnumber.models;

import java.util.Random;

public class RandomNumber {
	private int lives;
	private int randomNumber;
	
	public RandomNumber() {
		this.lives = 3;
		this.randomNumber = new Random().nextInt(99) + 1;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	public int getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}
	
	public void reduceLives() {
		if(lives > 0) lives--;	
	}
	
	public String compareNumbers(int number) {
		if(randomNumber > number) {
			this.reduceLives();
			return "greater";
		}
		else if(randomNumber < number) {
			this.reduceLives();
			return "lower";
		}
		else {
			return "same";
		}
	}
}
