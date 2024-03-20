package com.proyect.console;

import com.proyect.interPlayer.IPlayer;

public class Console {

	public boolean consoleIsOn = false;

	IPlayer player;

	public Console(IPlayer player) {
		this.player = player;
	}
	
	
	public void getConsoleTurnedOn() {
		player.turnOnConsole();
		consoleIsOn = true;
	}
	
	public void getConsoleTurnedOff() {
		player.turnOffConsole(consoleIsOn);
		consoleIsOn = false;

	}
	
}
