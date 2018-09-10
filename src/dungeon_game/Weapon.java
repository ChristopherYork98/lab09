package dungeon_game;

public abstract class Weapon extends Item {
	
	public Weapon(String name) {
		super(name);
	}
	
	public abstract boolean if_has_limit();

}
