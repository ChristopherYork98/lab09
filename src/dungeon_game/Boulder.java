package dungeon_game;

public class Boulder extends Terrain{
	private boolean passable;
	public Boulder(MapTile current) {
		super(current);
		this.passable = false;
		
	}
	@Override
	public boolean isPassable() {
		return passable;
	}
	public String move(MapTile moveTo) {
		this.current = moveTo;
		return null;
	}

}
