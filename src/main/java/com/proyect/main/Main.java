package com.proyect.main;

import com.proyect.console.Console;
import com.proyect.player.PlayerDistance;
import com.proyect.player.PlayerLocal;

public class Main {

	public static void main(String[] args) {
		
		Console consoleLocal = new Console(new PlayerLocal());

		consoleLocal.getConsoleTurnedOff();
		consoleLocal.getConsoleTurnedOn();
		consoleLocal.getConsoleTurnedOff();
		consoleLocal.getConsoleTurnedOff();
		
		System.out.println("<-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+->");
		
		Console consoleDistance = new Console(new PlayerDistance());

		consoleDistance.getConsoleTurnedOff();
		consoleDistance.getConsoleTurnedOn();
		consoleDistance.getConsoleTurnedOff();
		consoleDistance.getConsoleTurnedOff();
		
	}

}
