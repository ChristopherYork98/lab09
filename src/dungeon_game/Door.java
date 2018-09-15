package dungeon_game;

public class Door extends Terrain {
	private boolean passable;
	private int doorvalue;
	public Door(MapTile current) {
		super(current);
		this.passable = false;
	}
	@Override
	public boolean isPassable() {
		return passable;
	}
	public void setDoorValue(int doorvalue) {
		this.doorvalue = doorvalue;
	}
	public void unlock() {
		this.passable = true;
	}
}
