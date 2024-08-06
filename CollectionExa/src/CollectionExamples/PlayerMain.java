package CollectionExamples;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Player> al = new ArrayList<>(5);
		
		
		for(int i=0;i<al.size();i++) {
			String playerName = sc.nextLine();
			int playerId = sc.nextInt(); 
			String skill= sc.nextLine();
			String country=sc.nextLine();
			Player p =new Player(playerName, playerId, skill, country);
			al.add(p);
		}
		for(Player p1:al) {
			System.out.println(p1);
	}
	}
}
