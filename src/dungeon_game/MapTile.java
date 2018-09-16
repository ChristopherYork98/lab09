package dungeon_game;

import java.util.ArrayList;
import java.util.Iterator;

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
	private ArrayList<Object> entities;	
	
	// must be give co-ordinates to be created
	public MapTile(int row, int column) {
		this.row = row;
		this.column = column;
		this.entities = new ArrayList<Object>(); // add generic type later
	}
	
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
	
	public void addEntity(Object o) {
		entities.add(o);
		if (o instanceof PlayerCharacter) {
			((PlayerCharacter) o).make_a_move(this);
		}
	}
	
	public void removeEntity(Object o) {
		entities.remove(o);
	}
	public void triggerSwitch() {
		boolean flag = false;
		for (Object o : entities) {
			if (o instanceof Boulder) {
				flag = true;
			}
			if (flag == true && o instanceof FloorSwitch ) {
				((FloorSwitch) o).trigger();
			}
		}
	}
	public boolean isTriggered() {
		for (Object o : entities) {
			if (o instanceof FloorSwitch && ((FloorSwitch) o).isTriggered()) {
				return true;
			}
		}
		return false;
	}
	// change this later - will check is any objects of type Enemies or impassable terrain
	//Change terrain to an abstract class later
	public boolean isPassable() {
		for (Object o : entities) {
			if (o instanceof Terrain) {
				if (((Terrain) o).isPassable() == false) {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean hasEnemy() {
		for (Object o: entities)
			if (o instanceof Enemy)
				return true;
		return false;
	}
	
	public void killEnemy() {
//		for (Object o: entities) 
//			if (o instanceof Enemy)
//				this.removeEntity(o);
		for (Iterator<Object> it = entities.iterator();it.hasNext();) {
			Object o = it.next();
			if (o instanceof Enemy)
				it.remove();
		}
	}
	
	public boolean hasPlayer() {
		for (Object o: entities) 
			if (o instanceof PlayerCharacter)
				return true;
		return false;
	}
	
	public PlayerCharacter get_player(){
		for (Object o:entities) {
			if (o instanceof PlayerCharacter)
				return (PlayerCharacter)o;
		}
		return null;
	}
	
	public void setTerrainPos(Terrain t, MapTile dest) {
		t.setCurrent(dest);
	}
	// Moves specified object to the adjacent tile
	public void MoveUp(Object o) {
		up.addEntity(o);
		if (o instanceof Terrain) {
			setTerrainPos((Terrain )o, up);
		}

		this.removeEntity(o);
	}
	public void MoveDown(Object o) {
		down.addEntity(o);
		if (o instanceof Terrain) {
			setTerrainPos((Terrain )o, down);
		}

		this.removeEntity(o);
	}
	public void MoveRight(Object o) {
		right.addEntity(o);
		if (o instanceof Terrain) {
			setTerrainPos((Terrain )o, right);
		}

		this.removeEntity(o);
	}
	public void MoveLeft(Object o) {
		left.addEntity(o);
		if (o instanceof Terrain) {
			setTerrainPos((Terrain )o, left);
		}

		this.removeEntity(o);
	}
	public boolean canMoveLeft(Object o) {//Mainly for player character but also enemies
		return left.isPassable();
	}
	public boolean canMoveRight(Object o) {//Mainly for player character but also enemies
		return right.isPassable();
	}
	public boolean canMoveDown(Object o) {//Mainly for player character but also enemies
		return down.isPassable();
	}
	public boolean canMoveUp(Object o) {//Mainly for player character but also enemies
		return up.isPassable();
	}
	public boolean BoulderCheck() {//Checks a given MapTile (decided by map), to see if the boulder moves with the player, or if the boulder becomes like a wall
		for (Object o: entities) {
			if (o instanceof Boulder) {
				return true;
			}
		}
		return false;
	}
	public Boulder get_boulder(){
		for (Object o:entities) {
			if (o instanceof Boulder)
				return (Boulder)o;
		}
		return null;
	}
	public boolean PitCheck() {//Checks a given MapTile (decided by map), to see if the boulder moves with the player, or if the boulder becomes like a wall
		for (Object o: entities) {
			if (o instanceof Pit) {
				return true;
			}
		}
		return false;
	}
	public boolean FWCheck() {
		for (Object o: entities) {
			if (o instanceof FloorSwitch) {
				return true;
			}
		}
		return false;
	}
	public boolean WallCheck() {
		for (Object o: entities) {
			if (o instanceof Wall) {
				return true;
			}
		}
		return false;
	}
	public boolean ExitCheck() {
		for (Object o: entities) {
			if (o instanceof Exit) {
				return true;
			}	
		}
		return false;
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

	public MapTile getUp() {
		return up;
	}

	public MapTile getDown() {
		return down;
	}

	public MapTile getLeft() {
		return left;
	}

	public MapTile getRight() {
		return right;
	}
	
	
	//get the list of items on this tile
	public ArrayList<Item> get_items(){
		ArrayList<Item> item_list = new ArrayList<Item>();
		for (Object o:entities) {
			if (o instanceof Item) {
				Item item  = (Item)o;
				item_list.add(item);
			}
		}
		return item_list;
	}
	
	public void remove_all_entities() {
		entities.clear();		
	}
	
	
	//when enemy collides with player
	public void collision() {
		if (hasEnemy() && hasPlayer()) {
			PlayerCharacter player = get_player();
			if (player.Invinciblity()) {
				killEnemy();
			} else {
				entities.remove(player);
			}				
		}
	}
	
	public Door hasDoor() {
		for (Object o:entities) {
			if (o instanceof Door)
				return (Door)o;
		}
		return null;
	}
	
	
}

