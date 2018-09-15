package dungeon_game;

public class Wall extends Terrain{
	private boolean passable;
	public Wall(MapTile current) {
		super(current);
		this.passable = false;
	}
	
	public boolean isPassable() {
		return passable;
	}
}
