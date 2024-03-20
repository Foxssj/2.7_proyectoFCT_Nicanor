package com.proyect.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;

import com.proyect.console.Console;
import com.proyect.player.PlayerDistance;
import com.proyect.player.PlayerLocal;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		BeanFactory BF = context;
		
		Console consoleLocal = (Console) BF.getBean("console_local");
		
		consoleLocal.getConsoleTurnedOff();
		consoleLocal.getConsoleTurnedOn();
		consoleLocal.getConsoleTurnedOff();
		consoleLocal.getConsoleTurnedOff();


		
		Console consoleDistance = (Console) BF.getBean("console_distance");

		consoleDistance.getConsoleTurnedOff();
		consoleDistance.getConsoleTurnedOn();
		consoleDistance.getConsoleTurnedOff();
		consoleDistance.getConsoleTurnedOff();
		
	}

}
