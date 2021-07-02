package game;

import fixtures.Room;

public class RoomManager extends Room {
private Room[]rooms= new Room[8];
private Room startingRoom;
public Room outside,lr,dr,kit,hall,br1,br2,rr;


public void init() {
	
	Room outside= new Room(
			"Outside",
			"You are at the entrance of the house",
			" A living room can be entered and seen to west."+"\n"
			+"Outside, the house is surrounded by a white picket fence. "
			+ "\n"+ " There is a grass lawn that has a stone path leading to the enterance, which is between two flowebeds.");
	
	
	
	Room lr= new Room(
			"The Living Room",
			"A living room for socializing and relaxing",
			"A room containing the main entrance at the front of the house."
			+ " A dining room is open to the west,where a large wooden table can be seen." +"\n"
			+ " There is also an exit to the north where a hallway can be entered and framed photographs are hung along the walls.");
	
	Room dr= new Room(
			"The Dining Room",
			"A dining room for consuming food ",
			" A living room is open to east, where two leather sofas can be seen a large  one and a medium"+"\n"
			+"There is also an exit to the north where the kitchen can be seen and entered."
			);
	
	Room kit= new Room(
			"The Kitchen",
			"A kitchen where food is prepared, cooked, and stored",
			" A dining room is open to the south, where a large wooden table with wooden chairs can be seen."+"/n"
			+"An exit to the east can be seen leading to a hallway with many framed pictures along the walls");
	
	Room hall= new Room(
			"The HallWay",
			"A hallway is used to connect other rooms",
			" An entrance can be seen to a bedroom to the north."+"\n"+
			"Another bedroom entrance can be seen to the east of the hallway."+"\n"+
			"To the south the living room can be seen."+"\n"+
			"Lastly, to the west the kitchen can be entered.");
	
	Room br1= new Room("A Bedroom",
			"A bedroom is where you sleep, relax, and undwind ",
			"To the south of the bedroom the hallway can be entered"+"\n"+
			"In the bedroom a bed can be seen.");
	
	Room br2= new Room("Another Bedroom",
			"A bedroom is where you sleep, relax, and undwind ",
			"To the west of the bedroom the hallway can be entered"+"\n"+
			"In the bedroom a bed can be seen."+"\n"+
			"An entrance to a restroom can be seen to the east");
	
	Room rr= new Room("The Restroom",
			"To the west of the restroom an exit to a bedroom can be seen.",
			"A toilet for doint your necessities and and a sink for washing you hands as well as a shower can be seen in the restroom");
	
	this.startingRoom = outside;
	
	
	this.rooms[0]=outside;
	this.rooms[1]=lr;
	this.rooms[2]=dr;
	this.rooms[3]=kit;
	this.rooms[4]=hall;
	this.rooms[5]=br1;
	this.rooms[6]=br2;
	this.rooms[7]=rr;
	

	
	
	outside.setExits(null,null,null,lr);
	lr.setExits(hall,outside,null,dr);
	dr.setExits(kit,lr,null,null);
	kit.setExits(null,hall,dr,null);
	hall.setExits(br1,br2,lr,kit);
	br1.setExits(null,null,hall,null);
	br2.setExits(null,rr,null,hall);
	rr.setExits(null,null,null,br2);
		
}

public Room[] getRooms() {
	return rooms;
}

public void setRooms(Room[] rooms) {
	this.rooms = rooms;
}

public  Room getStartingRoom() {
	return startingRoom;
}

public void setStartingRoom(Room startingRoom) {
	this.startingRoom = startingRoom;
}

}







































/*lr.getExits()[3]=dr;
lr.getExits()[1]=outside;
lr.getExits()[0]=hall;
	
dr.getExits()[1]=lr;
dr.getExits()[0]=kit;

kit.getExits()[2]=dr;
kit.getExits()[1]=hall;

outside.getExits()[3]=lr;

hall.getExits()[0]=br1;
hall.getExits()[1]=br2;
hall.getExits()[2]=lr;
hall.getExits()[3]=kit;

br1.getExits()[2]=hall;

br2.getExits()[3]=hall;
br2.getExits()[1]=rr;

rr.getExits()[3]=br2;


	rooms[3]=lr;
outside.setExits(rooms);
rooms[0]=hall;
rooms[1]=outside;
rooms[3]=dr;
lr.setExits(rooms);
rooms[0]=kit;
rooms[1]=lr;
dr.setExits(rooms);
rooms[1]=hall;
rooms[2]=dr;
kit.setExits(rooms);
rooms[0]=br1;
rooms[1]=br2;
rooms[2]=lr;
rooms[3]=kit;
hall.setExits(rooms);
rooms[2]=hall;
br1.setExits(rooms);
rooms[1]=rr;
rooms[3]=hall;
br2.setExits(rooms);
rooms[3]=br2;
rr.setExits(rooms);
*/