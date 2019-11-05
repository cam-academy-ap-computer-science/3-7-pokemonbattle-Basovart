/*PSEUDOCODE
 *1. method named battle start
 * 	Intro and prompt for name
 * 	user input name
 *2. method named damage
 *	ask for stats 
 *	use the damage formula 
 *3. stats table
 *	uses stats inputed in method damage
 *	input stats and use to create table 
 */

import java.util.*;
public class PokemonBattle {
	static Scanner userInput = new Scanner (System.in);
	public static void main(String[] args) { //calls the three methods
		String name = battleStart();
		int newHP = damage(name);
		statsTable(name, newHP);
		
	}
		

	public static String battleStart() { //method that starts the battle
		System.out.println("Another trainer is issuing a challenge!");
		System.out.println("Zebstrika appeared.");
		System.out.println("Which Pokemon do you choose?");
		String Pokename = userInput.nextLine(); //asks for player to input pokemon name
		System.out.println("You chose " + Pokename + "!");
		System.out.println("It's a Pokemon battle between Zebstrika and " + Pokename + "! Go!");
		System.out.println();
		return Pokename; //returns the name to main method to use for next methods
	}
	public static int damage(String name) {
		System.out.println("Zebstrika used Thunderbolt!");
		System.out.println("Trainer, what are your " + name + "'s stats?");
		System.out.print("Level: ");    //asks for input from player in all of the stats
		int Level = userInput.nextInt();
		System.out.print("Attack: ");
		int Attack = userInput.nextInt();
		System.out.print("Defense: ");
		int Defense = userInput.nextInt();
		System.out.print("Base: ");
		int Base = userInput.nextInt();
		System.out.print("STAB: ");
		int STAB = userInput.nextInt();
		System.out.print("HP: ");
		int HP = userInput.nextInt();
		System.out.println();
		double Modifier = (0.85 + (Math.random() * 0.15)) * STAB; //calculates the modifier
		int Damage = (int)((((2 * Level + 10) / (250)) + ((Attack / Defense) * Base) + 2) * Modifier); //calculates the damage dealt
		System.out.println(name + " sustained " + Damage + " points of damage."); 
		int newHP = HP - 10; //calculates the new HP after attack
		System.out.println("HP, after damage, is now " + newHP);
		System.out.println();
		return newHP; //returns the HP value after attack
	}
	public static void statsTable(String name, int newHP) { //prints the stats
		System.out.println("Name	  " + name);
		System.out.println("Level	  70");
		System.out.println("------------------------------"); 
		System.out.println("HP	  " + newHP);
		System.out.println("ATTACK	  52");
		System.out.println("DEFENSE   51");
		System.out.println("SP. ATK   121");
		System.out.println("SP. DEF   81");
		System.out.println("SPEED 	  107");
		System.out.println("------------------------------"); 
	}

	
}

