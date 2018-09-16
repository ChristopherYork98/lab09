package dungeon_game;
import java.lang.Thread;
public class Bomb implements Weapon{
	int countdown;
	
	public Bomb() {
		this.countdown = 5;
	}
	
	@Override
	public int limit_of_hits() {
		return 1;
	}

	@Override
	public void itembehaviour(PlayerCharacter player) {
		//add delay later
		MapTile maptile = player.get_MapTile();
		maptile.getUp().remove_all_entities();
		maptile.getDown().remove_all_entities();
		maptile.getLeft().remove_all_entities();
		maptile.getRight().remove_all_entities();
	}


	
	
}
