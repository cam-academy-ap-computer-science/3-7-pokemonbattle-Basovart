/*1. method named battlestart
 * 	Intro and prompt for name
 * 	user input name
 *2. method named damage
 *	ask for stats 
 *	use the damege formula 
 *3. stats table
 *	uses stats inputed in method damage
 *	input stats and use to create table 
 *.85 + (Math.random() * .15)
 */

import java.util.*;
public class PokemonBattle {
	static Scanner userInput = new Scanner (System.in);
	public static void main(String[] args) {
		String name = battleStart();
		damage(name);
	}
		

	public static String battleStart() {
		System.out.println("Another trainer is issuing a challenge!");
		System.out.println("Zebstrika appeared.");
		System.out.println("Which Pokemon do you choose?");
		String Pokename = userInput.nextLine();
		System.out.println("You chose " + Pokename + "!");
		System.out.println("It's a Pokemon battle between Zebstrika and " + Pokename + "! Go!");
		return Pokename;
	}
	public static void damage(String name) {
		System.out.println("Zebstrika used Thunderbolt!");
		System.out.println("Trainer, what are your " + name + " stats?");
		System.out.print("Level: ");
		String Level = userInput.nextLine();
		System.out.print("Attack: ");
		String Attack = userInput.nextLine();
		System.out.print("Defense: ");
		String Defense = userInput.nextLine();
		System.out.print("Base: ");
		String Base = userInput.nextLine();
		System.out.print("STAB: ");
		String STAB = userInput.nextLine();
		System.out.print("HP: ");
		String HP = userInput.nextLine();
	}
	public static void statsTable(int Level, int Attack, int HP) {
		
	}
}
