package dungeon_game;

public class MapTile {
	// Co-ordinates of MapTile
	private int row;
	private int column;
	private Terrain terrain;
	private Item item;
	private Enemy enemy;
	
	// Holds its neigbours, may use, may not
//	private MapTile up;
//	private MapTile down;
//	private MapTile left;
//	private MapTile right;
	
	// must be give co-ordinates to be created
	public MapTile(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public void addTerrain(Terrain t) {
		terrain = t;
	}
	
	public void removeTerrain() {
		terrain = null;
	}
	
	public void addItem(Item i) {
		item = i;
	}
	
	public void removeItem() {
		item = null;
	}
	
	public void addEnemy(Enemy e) {
		enemy = e;
	}
	
	public void removeEnemy() {
		enemy = null;
	}
}

