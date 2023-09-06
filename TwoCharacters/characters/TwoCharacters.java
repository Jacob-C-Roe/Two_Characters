/*
 * Created by: Jacob Roe
 * Created On: 9/20/2022
 * 
 * Modification Log
 * Date			Programmer		Description
 * 9/20/2022	Jacob Roe		Initial Implementation
 * 10/12/2022	Jacob Roe		Fixed Errors
 * 
 * Description: This program will use the MyCharacter class data type and test the class methods
 */
package characters;

public class TwoCharacters {

	public static void main(String[] args) {
		
		//Create objects for two characters
		MyCharacter human = new MyCharacter(1, 1, 1);
		MyCharacter alien = new MyCharacter(3, 2, 2);
		
		//Call Display Method
		display(human, alien);
	}
	
	public static void display(MyCharacter human, MyCharacter alien) {
		//Display Character 1
		System.out.println("Character 1: Human");
		System.out.println("the human has " + human.getEyes() + " eyes.");
		System.out.println("the human has " + human.getAppendages() + " appendages.");
		System.out.println("the human has " + human.getLives() + " lives.");
				
		//Display Character 2
		System.out.println("Character 2: Alien");
		System.out.println("the human has " + alien.getEyes() + " eyes.");
		System.out.println("the human has " + alien.getAppendages() + " appendages.");
		System.out.println("the human has " + alien.getLives() + " lives.");
	}
	
}
