package com.proyect.player;
import com.proyect.interPlayer.IPlayer;

public class PlayerLocal implements IPlayer {

	@Override
	public void turnOnConsole() {
		System.out.println("Encendido!");
		
	}

	@Override
	public void turnOffConsole(boolean isOn) {
		if (isOn == true) {
			System.out.println("Apagando..");
			isOn = false;
		} else {
			System.out.println("La consola ya está apagada");
		}
		
	}

}
