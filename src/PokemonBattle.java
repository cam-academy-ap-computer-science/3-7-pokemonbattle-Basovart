/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.util.*;
public class PokemonBattle {
	static Scanner userInput = new Scanner (System.in);
	public static void main(String[] args) {
		
		battleStart();
		damage();
	}

	public static void battleStart() {
		System.out.println("Another trainer is issuing a challenge!");
		System.out.println("Zebstrika appeared.");
		System.out.println("Which Pokemon do you choose?");
		String Pokename = userInput.nextLine();
		System.out.println("You chose " + Pokename + "!");
		System.out.println("It's a Pokemon battle between Zebstrika and " + Pokename + "! Go!");
	}
	public static void damage() {
		System.out.println("Zebstrika used Thunderbolt!");
		System.out.println("Trainer, what are your Arcanine's stats?");
		System.out.print("Level:");
		String Level = userInput.nextLine();
		System.out.println("Attack:");
	}
}
