package dungeon_game;
import java.time.Duration;


public class Hover_Potion implements Potion {
	private Duration duration;
	
	public Hover_Potion(Duration duration){
		this.duration = duration;
	}
	
	@Override
	public void itembehaviour() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean if_has_duration_limit() {
		// TODO Auto-generated method stub
		return true;
	}
}
