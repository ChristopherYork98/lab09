package dungeon_game;

public class Map {
	private int mapsize; // map is a square, this is the side length 
	private MapTile[][] map;
	
	public Map(int size) {
		this.mapsize = size;
		map = new MapTile[size][size];
		//add boundries(); // puts walls on every tile that is on the edge
	}
}
