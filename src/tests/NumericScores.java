package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TennisGame;

// Testing of midgame scores before both players score three times
public class NumericScores {

	
	@Test
	public void test_StartScore() {
		TennisGame game = new TennisGame();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 0", score);	
	}
	
	
	@Test
	public void test_player1_scored_once() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "15 - 0", score);	
	}
	
	@Test
	public void test_player1_scored_twice() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "30 - 0", score);	
	}
	
	@Test
	public void test_player1_scored_three() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "40 - 0", score);	
	}
	
	@Test
	public void test_player2_scored_once() {
		TennisGame game = new TennisGame();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "0 - 15", score);	
	}
	
	@Test
	public void test_player2_scored_twice() {
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "0 - 30", score);	
	}
	
	@Test
	public void test_player2_scored_three() {
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "0 - 40", score);	
	}
	
	@Test
	public void test_player1_scored_once_player2_scored_once() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "15 - 15", score);	
	}
	
	@Test
	public void test_player1_scored_twice_player2_scored_once() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "30 - 15", score);	
	}
	
	@Test
	public void test_player1_scored_three_player2_scored_once() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "40 - 15", score);	
	}

	@Test
	public void test_player1_scored_once_player2_scored_twice() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "15 - 30", score);	
	}
	
	@Test
	public void test_player1_scored_once_player2_scored_three() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "15 - 40", score);	
	}
	
	@Test
	public void test_player1_scored_twice_player2_scored_three() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "30 - 40", score);	
	}
	
	@Test
	public void test_player1_scored_three_player2_scored_twice() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "40 - 30", score);	
	}
	
	@Test
	public void test_deuce() {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "deuce", score);	
	}
}
