package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TennisGame;
import main.TennisGameException;

// Testing of midgame scores before both players score three times
public class NumericScores {

	
	@Test
	public void test_StartScore() throws TennisGameException{
		TennisGame game = new TennisGame();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 0", score);	
	}
	
	
	@Test
	public void test_player1_scored_once() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "15 - 0", score);	
	}
	
	@Test
	public void test_player1_scored_twice() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "30 - 0", score);	
	}
	
	@Test
	public void test_player1_scored_three() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "40 - 0", score);	
	}
	
	@Test
	public void test_player2_scored_once() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "0 - 15", score);	
	}
	
	@Test
	public void test_player2_scored_twice() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "0 - 30", score);	
	}
	
	@Test
	public void test_player2_scored_three() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "0 - 40", score);	
	}
	
	@Test
	public void test_player1_scored_once_player2_scored_once() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "15 - 15", score);	
	}
	
	@Test
	public void test_player1_scored_twice_player2_scored_once() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "30 - 15", score);	
	}
	
	@Test
	public void test_player1_scored_three_player2_scored_once() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "40 - 15", score);	
	}

	@Test
	public void test_player1_scored_once_player2_scored_twice() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "15 - 30", score);	
	}
	
	@Test
	public void test_player1_scored_once_player2_scored_three() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "15 - 40", score);	
	}
	
	@Test
	public void test_player1_scored_twice_player2_scored_three() throws TennisGameException{
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
	public void test_player1_scored_three_player2_scored_twice() throws TennisGameException{
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
	public void test_deuce() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "deuce", score);	
	}
	@Test
	public void test_advantage_player1() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "advantage_player1", score);	
	}
	
	@Test
	public void test_advantage_player2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "advantage_player2", score);	
	}
	
	@Test
	public void test_game_player1() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "game_player1", score);	
	}
	@Test
	public void test_game_player2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "game_player2", score);	
	}
	
	@Test(expected=TennisGameException.class)
	public void test_game_player1_exception() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "game_player1", score);	
	}
	@Test(expected=TennisGameException.class)
	public void test_game_player2_exception() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();
		assertEquals("Initial score incorrect", "game_player2", score);	
	}
}
