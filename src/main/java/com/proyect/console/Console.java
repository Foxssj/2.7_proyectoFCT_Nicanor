package com.proyect.console;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyect.interPlayer.IPlayer;

public class Console {

	public boolean consoleIsOn = false;

	IPlayer player;

	
	
	@Autowired
	public Console(IPlayer player) {
		this.player = player;
	}
	
	
	public Console() {
		
	}
	
	public void getConsoleTurnedOn() {
		player.turnOnConsole();
		consoleIsOn = true;
	}
	
	public void getConsoleTurnedOff() {
		player.turnOffConsole(consoleIsOn);
		consoleIsOn = false;

	}
	
	// Getter method for the 'player' property
    public IPlayer getPlayer() {
        return player;
    }

    // Setter method for the 'player' property
    public void setPlayer(IPlayer player) {
        this.player = player;
    }
	
}
