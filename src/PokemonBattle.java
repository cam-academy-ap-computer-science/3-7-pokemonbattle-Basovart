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
		int newHP = damage(name);
		statsTable(name, newHP);
		
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
	public static int damage(String name) {
		System.out.println("Zebstrika used Thunderbolt!");
		System.out.println("Trainer, what are your " + name + "'s stats?");
		System.out.print("Level: ");
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
		double Modifier = (0.85 + (Math.random() * 0.15)) * STAB; 
		int Damage = (int)((((2 * Level + 10) / (250)) + ((Attack / Defense) * Base) + 2) * Modifier);
		System.out.print("Alakazam sustained " + Damage + " points of damage.");
		int newHP = HP - 10;
		System.out.println("HP, after damage, are now" + newHP);
		return newHP;
	}
	public static void statsTable(String name, int newHP) {
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

