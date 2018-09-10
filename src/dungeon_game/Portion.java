package dungeon_game;
import java.time.Duration;

public abstract class Portion extends Item {
	public Duration last_time;

	
	public Portion(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public abstract void functionality();
	
}
