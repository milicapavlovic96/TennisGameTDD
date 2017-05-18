package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		player1Points=0;
		player2Points=0;
		gameEnded=false;
	}
	
	public void player1Scored(){
		player1Points++;
	}
	public void player2Scored(){
		player2Points++;
	}
	
	public String getScore(int points){
		if(points==0){
			return "0";
		} else if(points==1){
			return "1";
		}else if(points==2){
			return "2";
		}else if(points==4){
			return "4";
		}else{
			return "";
		}
	}
	
	public String getScore(){
		
			return getScore(player1Points) + " - " + getScore(player2Points);
		}
	}
	


