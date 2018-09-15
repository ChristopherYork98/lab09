package dungeon_game;

public class Map {
	private int mapsize; // map is a square, this is the side length 
	private MapTile[][] map;
	private String command; //the input from the user (assume it is "up", "down", "left", or "right")
	public Map(int size) {
		this.mapsize = size;
		map = new MapTile[size][size];
		this.addTiles(); // creates MapTile objects and puts Walls on edges
		this.addNeighbours(); //gives each tile the reference to adjacent MapTiles
	}
	
	// adds walls to all MapTiles on the edge of the 2d array
	private void addTiles() {
		for (int i = 0; i < mapsize; i++) {
			for (int j = 0; j < mapsize; j++) {
				map[i][j] = new MapTile(i, j);
				if (i == 0 || j ==0 || i == mapsize-1 || j == mapsize-1) {
					Terrain w = new Wall();
					map[i][j].addEntity(w);
				}
			}
		}
	}
	
	// adds references for adjacent tiles to each other
	private void addNeighbours() {
		for (int i = 0; i < mapsize; i++) {
			for (int j = 0; j < mapsize; j++) {
				if (i > 0)
					map[i][j].setUp(map[i-1][j]);
				if (i < mapsize-1)
					map[i][j].setDown(map[i+1][j]);
				if (j > 0)
					map[i][j].setLeft(map[i][j-1]);
				if (j < mapsize-1)
					map[i][j].setRight(map[i][j+1]);
			}
		}
	}
	
	// takes object then calls MapTiles to move them
	// objects passed in should have method named 'move' that returns a String ("up", "down", "right", "left")
	public void MoveEntity(Object o, MapTile from, String command) {
	    if (o instanceof PlayerCharacter) {
	    	if (command=="up") {
	    		if (from.getUp().BoulderCheck() && from.getUp().canMoveUp(o)) {
	    			from.MoveUp(o);
	    			from.getUp().MoveUp(o);
	    			from.getUp().triggerSwitch();
	    		}
	    		else if (from.getUp().PitCheck()) {// we can add hover potion stuff here
	    			System.out.print("You have died.\n");
	    		}
	    		else if (from.canMoveUp(o)) {
		    		from.MoveUp(o);
	    		}

	    	}
	    	if (command=="left") {
	    		if (from.getLeft().BoulderCheck() && from.getLeft().canMoveLeft(o)) {
	    			from.MoveLeft(o);
	    			from.getLeft().MoveLeft(o);
	    			from.getLeft().triggerSwitch();
	    		}
	    		else if (from.getLeft().PitCheck()) {
	    			System.out.print("You have died.\n");
	    		}
	    		else if (from.canMoveLeft(o)) {
		    		from.MoveLeft(o);
	    		}

	    	}
	    	if (command=="right") {
	    		if (from.getRight().BoulderCheck() && from.getRight().canMoveRight(o)) {
	    			from.MoveRight(o);
	    			from.getRight().MoveRight(o);
	    			from.getRight().triggerSwitch();
	    		}
	    		else if (from.getRight().PitCheck()) {
	    			System.out.print("You have died.\n");
	    		}
	    		
	    		else if (from.canMoveRight(o)) {
		    		from.MoveRight(o);
	    		}

	    	}
	    	if (command=="down") {
	    		if (from.getDown().BoulderCheck() && from.getDown().canMoveDown(o)) {
	    			from.MoveDown(o);
	    			from.getDown().MoveDown(o);
	    			from.getDown().triggerSwitch();
	    		}
	    		else if (from.getDown().PitCheck()) {
	    			System.out.print("You have died.\n");
	    		}
	    		
	    		else if (from.canMoveDown(o)) {
		    		from.MoveDown(o);
	    		}

	    	}
	    }
	}
	private String getCommand() {
		return this.command;
	}
	// for early troubleshooting
	public void printOnTerminal() {
		for (int i = 0; i < mapsize; i++) {
			for (int j = 0; j < mapsize; j++) {
				if (map[i][j].hasPlayer())
					System.out.print("C ");
				else if (map[i][j].BoulderCheck()) {
					System.out.print("B ");
				}
				else if (map[i][j].isPassable())
					System.out.print("T ");
				else
					System.out.print("F ");
			}
			System.out.print("\n");
		}
	}
	
	// main function only for early testing and debugging
	public static void main(String[] args) {
		Map m = new Map(8);
		//System.out.println(m.mapsize);
		PlayerCharacter p = new PlayerCharacter();
		m.map[6][6].addEntity(p);
		m.printOnTerminal();
		m.MoveEntity(p,m.map[6][6],"down");
		m.printOnTerminal();

	}
	
}
