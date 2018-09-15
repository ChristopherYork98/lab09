package dungeon_game;

public class Boulder extends Terrain{
	private boolean passable;
	public Boulder() {
		this.passable = false;
	}
	public boolean isPassable() {
		return passable;
	}
	public String move() {
		return null;
	}

}
