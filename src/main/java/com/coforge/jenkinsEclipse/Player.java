package com.coforge.jenkinsEclipse;

public class Player {
	private int jerseyNo;
	private String playerName;
	private String state;
	
	public Player() {
		}
	public Player(int jerseyNo, String playerName, String state) {
		this.jerseyNo = jerseyNo;
		this.playerName = playerName;
		this.state = state;
	}
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Player [jerseyNo=" + jerseyNo + ", playerName=" + playerName + ", state=" + state + "]";
	}
	
	
	

}
