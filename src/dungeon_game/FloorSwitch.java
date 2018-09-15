package dungeon_game;

public class FloorSwitch extends Terrain{
	private boolean passable;
	private boolean triggered;
	public FloorSwitch() {
		this.passable = true;
		this.triggered = false;
	}
	@Override
	public boolean isPassable() {
		return passable;
	}
	public void trigger() {
		this.triggered = true;
	}
	
}
