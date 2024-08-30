package com.xworkz.engineering;

public class SnakeRunner {

	public static void main(String[] args) {
		Snake snake=new Snake("cobra",5,"poisonous");
		Snake snake1=new Snake("python",10,"poisonous");
		Snake snake2=new Snake("mamba",6,"poisonous");
		
		Snake[] ref=new Snake[3];
		ref[0]=snake;
		ref[1]=snake1;
		ref[2]=snake2;
		for(Snake snakeNames: ref)
		{
			System.out.println(snakeNames);
			snakeNames.display();
			
		}


	}

}
