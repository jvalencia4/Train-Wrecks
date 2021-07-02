package game;

import java.util.Scanner;
import fixtures.Room;

public class Main {
	static Scanner collectInput = new Scanner(System.in);

	public static void main(String[] args) {
		RoomManager roomManager = new RoomManager();
		roomManager.init();
		Player player = new Player();
		player.setCurrentRoom(roomManager.getStartingRoom());
		do {
			printRoom(player);
			String[] command = collectInput();
			parse(command, player);
		} while (!collectInput().equals(null));
	}

	private static void printRoom(Player player) {
		String printPlayerCurrentRoom = player.getCurrentRoom().toString();
		System.out.println(printPlayerCurrentRoom);
		System.out.println("What direction do you want to go: North, East, South, West?");
	}

	private static String[] collectInput() {
		Scanner userCommand = new Scanner(System.in);
		String[] commandArray = userCommand.nextLine().split(" ");
		return commandArray;
	}

	private static void parse(String[] command, Player player) {
		Room nextRoom = player.getCurrentRoom().getExit(command[1]);
		if (nextRoom != null) {
			player.setCurrentRoom(nextRoom);
		} else {
			System.out.println("Invalid Command! Thank you for going thorugh my home tour!!");
			System.exit(0);
		}

	}
}












































































/*public static void main(String[] args) {
		 // Set up RoomManager
		roomManager.init();// call init() method
		// set up Player
		player.setCurrentRoom(roomManager.getStartingRoom());// Assign player's currentRoom the value of StartingRoom from RoomManager
														
		do {
			printRoom(player);
			String[] command = collectInput();
			parse(command, player);
		} while(collectInput()!= null);

		// String playerInput = parse(playerInput, player);// I'm still unsure what this
		// line of code does:O
	}

	private static void printRoom(Player player) {
		System.out.println(player.getCurrentRoom().getName());
		System.out.println(player.getCurrentRoom().getLongDescription());
		System.out.println("What direction would you like to go?");
		//System.out.println(printPlayerCurrentRoom);
		//System.out.println(printPlayerCurrentRoomD);
		if(player.getCurrentRoom().getExit("north") != null) {
			System.out.println("North: "+player.getCurrentRoom().getExit("north").getShortDescription());
		}
		if(player.getCurrentRoom().getExit("east") != null) {
			System.out.println("East: "+player.getCurrentRoom().getExit("east").getShortDescription());
		}
		if(player.getCurrentRoom().getExit("south") != null) {
			System.out.println("South: "+player.getCurrentRoom().getExit("south").getShortDescription());
		}
		if(player.getCurrentRoom().getExit("west") != null) {
			System.out.println("West: "+player.getCurrentRoom().getExit("west").getShortDescription());
		}
	}

	private static String[] collectInput() {
		// read in the line from the user
		String userCommand = collectInput.nextLine();
		userCommand.toLowerCase();
		String[] commandArray = userCommand.split(" ");
		return commandArray;

	}

	private static void parse(String[] command, Player player) {
		// command is going to be something like
		String userDirection = command[1];// or command[0]; check length of command
		String goCommand=command[0];
		// {"go", "direction"}
		Room CurrentRoom = player.getCurrentRoom();
		Room nextRoom = CurrentRoom.getExit(userDirection);
		if (!goCommand.equals(null)) {
			player.setCurrentRoom(nextRoom);
		switch(userDirection) {
		case "north":
			player.setCurrentRoom(player.getCurrentRoom().getExit("north"));
			break;
		case "east":
			player.setCurrentRoom(player.getCurrentRoom().getExit("east"));
			break;
		case "south":
			player.setCurrentRoom(player.getCurrentRoom().getExit("south"));
			break;
		case "west":
			player.setCurrentRoom(player.getCurrentRoom().getExit("west"));
			break;
			}
		}
	}
}

*/



























/*
 * package game;

import java.util.Scanner;
import fixtures.Room;

public class Main {
	
	public static void main(String[] args) {
		Room someRoom;
		RoomManager roomManager = new RoomManager(); // Set up RoomManager
		Room currentRoom=roomManager.getStartingRoom();
		roomManager.init();// call init() method
		
		
		Player player = new Player();// set up Player
		//Player someRoom=player.getCurrentRoom();
		player.setCurrentRoom(roomManager.getStartingRoom());// Assign player's currentRoom the value of StartingRoom from
														// RoomManager
		do {
			printRoom(player);
			String[] command = collectInput();
			parse(command, player);
		} while (collectInput() != null);

		// String playerInput = parse(playerInput, player);// I'm still unsure what this
		// line of code does:O
	}

	private static void printRoom(Player player) {
		//String printPlayerCurrentRoom=player.getCurrentRoom().toString();
		//System.out.println(printPlayerCurrentRoom);
		String location = player.getCurrentRoom().getName() + "\n" + player.getCurrentRoom().getShortDescription()
				+ "\n" + player.getCurrentRoom().getLongDescription();
		System.out.println(location);
	}

	private static String[] collectInput() {
		// read in the line from the user
		Scanner userCommand = new Scanner(System.in);
		System.out.println("What direction do you want to go?");
		String command = userCommand.nextLine();
		command.toLowerCase();
		String[] commandArray = command.split(" ");
		return commandArray;

	}

	private static void parse(String[] command, Player player) {
		// command is going to be something like
		String userDirection = command[1];// or command[0]; check length of command
		//String goCommand = command[0];
		// {"go", "direction"}
		Room currentRoom = player.getCurrentRoom();
		Room nextRoom = currentRoom.getExit(userDirection);
		if (nextRoom != null) {
			player.setCurrentRoom(nextRoom);
		}
		
	}
	switch(goCommand) {
		case "go":
			player.setCurrentRoom(nextRoom);
			break;
			default:
				System.out.println("Invalid Command!!");
		}

}
 */
