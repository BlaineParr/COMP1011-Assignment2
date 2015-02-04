/**
 * This class creates Hero objects with randomly generated abilities. Class includes a method to
 * view the Hero's stats and to fight. When fighting there is a 20% chance the Hero will hit their
 * target. A message is printed to the console displaying that the hero either dealt damage, or
 * that they missed.
 * 
 * @author Blaine Parr
 * @version February 3, 2015
 */
public class Hero 
{
	//variables
	private int strength;
	private int speed;
	private int health;
	public String name;
	
	/**
	 * This constructor generates Hero objects with the name provided by the user
	 * @param name The name of the hero
	 */
	public Hero(String name)
	{
		this.name = name;
		this.generateAbilities();
	} //constructor ends
	
	//Private Methods/////////////////////////////////////////////////////////////////////////////
	/**
	 * This method randomly generates a number between 1 and 100 for the values of the strength, 
	 * speed and health abilities of the hero
	 */
	private void generateAbilities()
	{
		this.strength = (int)(Math.random() * 100 + 1);
		this.speed = (int)(Math.random() * 100 + 1);
		this.health = (int)(Math.random() * 100 + 1);
	} //method generateAbilities ends
	
	/**
	 * This method determines whether the hero hits the target or not. A random number between 1
	 * and 100 is generated. If a number between 1 and 20 is generated call the hitDamage method
	 * and return true, else return false
	 * @return true if a number between 1 and 20 is generated, else return false
	 */
	private boolean hitAttempt()
	{
		//local variables
		int randomNumber = (int)(Math.random() * 100 + 1);
		
		//if the number is between 1 and 20 return true, else return false
		if(randomNumber >= 1 && randomNumber <= 20)
		{
			//print out how much damage the hero dealt
			System.out.println(this.name + " hit!");
			System.out.println(this.name + " dealt " + hitDamage() + " damage!");
			return true;
		} //if ends
		
		//print out that the hero missed
		System.out.println(this.name + " missed!");
		return false;
	} //method hit attempt ends
	
	/**
	 * This method determines how much damage the hero does by multiplying the hero's strength
	 * with a random number between 1 and 6
	 * @return the hero's strength * a random number between 1 and 6
	 */
	private int hitDamage()
	{
		return this.strength * (int)(Math.random() * 6 + 1);
	} //method hitDamage ends
	
	//Public Methods//////////////////////////////////////////////////////////////////////////////
	/**
	 * This method calls the hitAttempt method to determine if the hero hits the target
	 */
	public void fight()
	{
		this.hitAttempt();
	} //method fight ends
	
	/**
	 * This method prints the heroes strength, speed and health to the console
	 */
	public void show()
	{
		System.out.println(this.name + "'s stats"
				+ "\n**********"
				+ "\nStrength: " + this.strength
				+ "\nSpeed: " + this.speed
				+ "\nHealth: " + this.health);
	} //method show ends
} //class Hero ends
