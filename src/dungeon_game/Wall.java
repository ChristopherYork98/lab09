package dungeon_game;

public class Wall extends Terrain{
	private boolean passable;
	
	public Wall() {
		this.passable = false;
	}
	
	public boolean isPassable() {
		return passable;
	}
}
