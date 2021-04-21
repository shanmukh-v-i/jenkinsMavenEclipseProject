package com.coforge.jenkinsEclipse;

public class App 
{
    	public static void main(String[] args) {
    		Player sachin=new Player(10, "Sachin Tendulkar", "Maharashtra");
    		System.out.println(sachin.getJerseyNo()+" : "+sachin.getPlayerName()+" : "
    				+sachin.getState());
    	}
    }
