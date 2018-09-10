package dungeon_game;

public class Map {
	private int mapsize; // map is a square, this is the side length 
	private MapTile[][] map;
	
	public Map(int size) {
		this.mapsize = size;
		map = new MapTile[size][size];
		this.addTiles(); // creates MapTile objects and puts Walls on edges
	}
	
	// adds walls to all MapTiles on the edge of the 2d array
	public void addTiles() {
		for (int i = 0; i < mapsize; i++) {
			for (int j = 0; j < mapsize; j++) {
				map[i][j] = new MapTile(i, j);
				if (i == 0 || j ==0 || i == mapsize-1 || j == mapsize-1) {
					Terrain w = new Wall();
					map[i][j].addTerrain(w);
				}
			}
		}
	}
	
	
	// for early troubleshooting
	public void printOnTerminal() {
		for (int i = 0; i < mapsize; i++) {
			for (int j = 0; j < mapsize; j++) {
				if (map[i][j].hasTerrain())
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
		System.out.println(m.mapsize);
		Terrain t = new Wall();
		//m.map[0][0].addTerrain(t);
		m.printOnTerminal();
	}
	
}
