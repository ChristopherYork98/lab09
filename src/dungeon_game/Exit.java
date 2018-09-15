package dungeon_game;

public class Exit extends Terrain {
	private boolean passable;
	public Exit() {
		this.passable = true;
	}
	@Override
	public boolean isPassable() {
		return passable;
	}
	public String levelComplete() {
		return "You have completed the level\n";
	}
}
