package com.proyect.player;

import com.proyect.interPlayer.IPlayer;

public class PlayerDistance implements IPlayer{

	@Override
	public void turnOnConsole() {
		System.out.println("Encendiendo la consola a distancia!");
		
	}

	@Override
	public void turnOffConsole(boolean isOn) {
		if (isOn == true) {
			System.out.println("Apagando a distancia..");
			isOn = false;
		} else {
			System.out.println("No se ha podido apagar a distancia!");
		}		
	}

}
