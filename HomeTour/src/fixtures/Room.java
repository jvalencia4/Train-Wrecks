package fixtures;

public class Room extends Fixtures {

	protected Room[] exits;


	public Room () {
	}

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4];

	}

	public Room[] getExits() {
		return exits;

	}

	public void setExits(Room[] exits) {
		this.exits = exits;
	}

	public void setExits(Room north, Room east, Room south, Room west) {
		this.exits[0] = north;
		this.exits[1] = east;
		this.exits[2] = south;
		this.exits[3] = west;
	}

	public Room getExit(String direction) {

		String input = "";
		input.toLowerCase();
		direction = input.toLowerCase();
		switch (direction) {
		case "north":
			return exits[0];
		case "east":
			return exits[1];
		case "south":
			return exits[2];
		case "west":
			return exits[3];
		case "quit":
			System.exit(0);
		default:
			return null;
		}
	}
	/*
	 * public Room getExits(String position) { String uInput="";
	 * uInput.toLowerCase(); position=uInput.toLowerCase(); switch(position) { case
	 * "outside": return exits[0]; case "living room": return exits[1]; case
	 * "dining room": return exits[2]; case "kitchen": return exits[3]; case
	 * "hallway": return exits[4]; case "first bedroom": return exits[5]; case
	 * "second bedroom": return exits[6]; case "rest room": return exits[7]; //case
	 * "quit": //System.exit("quit"); default: return null; }
	 */

	@Override
	public String toString() {
				return "----Welcome to My Home Tour----"+ "\n"+ "You are " + this.getName() + " \n Short Description: " + this.getShortDescription()
				+ " \nLong Description: " + this.getLongDescription();
	}

}
