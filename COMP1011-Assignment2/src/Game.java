/**
 * This class creates a SuperHero object and calls its showPowers and fight methods.
 * 
 * @author Blaine Parr
 * @version February 3, 2015
 * 
 * Revision History:
 * v0.1:
 * -Created project.
 * 
 * v0.2:
 * -Added the hero class from Assignment 1 and created the SuperHero class with the 
 * generateRandomPowers method.
 * 
 * v0.3:
 * -Finished methods and internal documentation of SuperHero class.
 * 
 * v1.0:
 * -Created and finished Game class.
 * -Fixed the console output of the SuperHero class.
 * -Stopped the randomly generated number that was printed out in the Hero class's hitAttempt 
 * method for debugging purposes from being printed out.
 */
public class Game 
{
	public static void main(String[] args) 
	{
		//create a new SuperHero object
		SuperHero superHero = new SuperHero("Somewhat-super Man");
		
		//call the showPowers and fight methods
		superHero.showPowers();
		superHero.fight();
	} //method main ends
} //class Game ends
