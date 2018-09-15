package dungeon_game;

public class Pit extends Terrain {
	private boolean passable;
	public Pit(MapTile current) {
		super(current);
		this.passable = true;
	}
	@Override
	public boolean isPassable() {
		return passable;
	}
	public void kill() {
		System.out.print("You have died\n");
	}
}
