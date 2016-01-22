package minesweeper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import minesweeper.consoleui.ConsoleUI;

public class Minesweeper {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("minesweeper/mines.xml");
		//BeanFactory factory = new XmlBeanFactory(new ClassPathResource("MineSweeper.xml"));
		//Document doc = context.getBean(Document.class); 
		
		((ConsoleUI) context.getBean("ui")).play();
		
	/*Field field = new Field(9, 9, 1);
		ConsoleUI ui = new ConsoleUI(field);
		ui.setHallOfFame(new HallOfFameDatabase());
		ui.play();*/			
	}
}
