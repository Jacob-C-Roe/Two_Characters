/*
 * Created by: Jacob Roe
 * Created On: 9/20/2022
 * 
 * Modification Log
 * Date			Programmer		Description
 * 9/20/2022	Jacob Roe		Initial Implementation
 * 10/12/2022	Jacob Roe		Fixed Errors
 * 
 * Description: This is the character attributes builder
 */
package characters;

public class MyCharacter {
	//Create variables for character attributes
	private int eyePairs;
	private int appendageSets;		
	private int hearts;	
	
	
	//Constructor for character aspects
	MyCharacter(int newEyes, int newAppendages, int newHearts) {
		
		eyePairs = newEyes * 2;
		appendageSets = newAppendages * 4;
		hearts = newHearts;
		
	}
	
	//Method to set number of eyes
	public void setEyes(int eyes) {
		
		this.eyePairs = eyes;
		
	}
	
	//Method to set number of appendages
	public void setApendages(int appendages) {
		
		this.appendageSets = appendages;
		
	}
	
	//Method to set number of Lives
	public void setLives(int lives) {
		
		this.hearts = lives;
		
	}
	
	//Method to get number of eyes
	public int getEyes() {
		
		return this.eyePairs;
		
	}
	
	//Method to get number of appendages
	public int getAppendages() {
		
		return this.appendageSets;
		
	}
	
	//Method to get number of lives
	public int getLives() {
		
		return this.hearts;
		
	}
	
}
