package dungeon_game;

import java.time.Duration;

public abstract class Potion extends Item{
	public Duration last_time;

	
	public Potion(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public abstract void functionality();
}
