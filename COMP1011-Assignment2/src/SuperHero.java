import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class extends the Hero class with extra methods to randomly generate super powers and
 * display what those randomly generated super powers are.
 * 
 * @author Blaine Parr
 * @version February 3, 2015
 */
public class SuperHero extends Hero 
{
	//variables
	private String superPowers[];
	
	/**
	 * This constructor generates super heroes with names provide from the user. It also
	 * initializes the superPowers array to a size of 3 and generates random powers for the
	 * SuperHero.
	 * @param name The name of the super hero
	 */
	public SuperHero(String name)
	{
		super(name);
		this.superPowers = new String[3];
		this.generateRandomPowers();
	} //constructor ends
	
	//Private Methods/////////////////////////////////////////////////////////////////////////////
	/**
	 * This method selects 3 random powers from an ArrayList and adds them to the superPowers
	 * array. After a power is selected, it is removed from the ArrayList to prevent it from
	 * being selected again.
	 */
	private void generateRandomPowers()
	{
		//create ArrayList powers as a String ArrayList with a size of 0
		/*this will be used for the purpose of holding all of the powers and removing ones that
		  have been selected*/
		ArrayList<String> powers = new ArrayList<String>(0);
		
		//add the different powers to the ArrayList
		powers.addAll(Arrays.asList("Super Speed", "Super Strength", "Body Armour", "Flight", "Fire Generation", "Weather Control"));
		
		//loop 3 times to pick random powers. remove the selected power from powers
		for(int i = 0; i < 3; i++)
		{
			//pick a random power from all of the remaining powers in the ArrayList
			int powerNumber = (int)(Math.random() * powers.size());
			
			//set the array slot to the selected power
			this.superPowers[i] = powers.get(powerNumber);
			
			//remove the selected power from the ArrayList
			powers.remove(powerNumber);
		} //for ends
	} //method generateRandomPowers ends
	
	//Public Methods//////////////////////////////////////////////////////////////////////////////
	/**
	 * This method prints out each of the SuperHero's super powers.
	 */
	public void showPowers()
	{
		/*print out a message showing the SuperHeros's name and announcing their powers are about
		  to follow*/
		System.out.println(this.name + "'s powers are: ");
		
		//loop through all of the SuperHero's powers, printing out each one
		for(int i = 0; i < superPowers.length; i++)
		{
			System.out.println(this.superPowers[i]);
		} //for ends
	} //method showPowers ends
} //class SuperHero ends
