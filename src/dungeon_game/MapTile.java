package dungeon_game;

import java.util.ArrayList;

public class MapTile {
	// Co-ordinates of MapTile
	private int row;
	private int column;
	// adjacent tiles
	private MapTile up;
	private MapTile down;
	private MapTile left;
	private MapTile right;
	// list of entities currently in this MapTile
	private ArrayList entities;	
	
	// must be give co-ordinates to be created
	public MapTile(int row, int column) {
		this.row = row;
		this.column = column;
		this.entities = new ArrayList(); // add generic type later
	}
	
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
	
	public void addEntity(Object o) {
		entities.add(o);
	}
	
	public void removeEntity(Object o) {
		entities.remove(o);
	}
	
	// change this later - will check is any objects of type Enemies or impassable terrain
	public boolean isPassable() {
		if (entities.size() > 0)
			return false;
		return true;
	}
	
	public boolean hasEnemy() {
		for (Object o: entities)
			if (o instanceof Enemy)
				return true;
		return false;
	}
	
	public void killEnemy() {
		for (Object o: entities)
			if (o instanceof Enemy)
				this.removeEntity(o);
	}
	
	public boolean hasPlayer() {
		for (Object o: entities)
			if (o instanceof PlayerCharacter)
				return true;
		return false;
	}
	
	// Moves specified object to the adjacent tile
	public void MoveUp(Object o) {
		up.addEntity(o);
		this.removeEntity(o);
	}
	public void MoveDown(Object o) {
		down.addEntity(o);
		this.removeEntity(o);
	}
	public void MoveRight(Object o) {
		right.addEntity(o);
		this.removeEntity(o);
	}
	public void MoveLeft(Object o) {
		left.addEntity(o);
		this.removeEntity(o);
	}
	
	// links adjacent tiles
	public void setUp(MapTile t) {
		up = t;
	}
	public void setDown(MapTile t) {
		down = t;
	}
	public void setRight(MapTile t) {
		right = t;
	}	
	public void setLeft(MapTile t) {
		left = t;
	}
	
}

