package com.teksystems;

public class methods_tut {
	public static void main(String[] args) {
		
		displayFinalScore("John",calcFinalScore(800,4,100,true));		
		
	}
	public static void displayFinalScore(String playerName, int finalScore) {
		System.out.println("Player" +playerName + "final score is" + finalScore);
	}
	
	public static int calcFinalScore(int score,int levelCompleted,int bonus,boolean gameOver) {
		if (gameOver) {
			int finalScore=(score+(levelCompleted*bonus));
			return finalScore;
			}
		return score;
	}
}
	
	

