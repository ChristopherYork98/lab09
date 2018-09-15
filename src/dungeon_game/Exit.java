package dungeon_game;

public class Exit extends Terrain {
	private boolean passable;
	public Exit(MapTile current) {
		super(current);
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
