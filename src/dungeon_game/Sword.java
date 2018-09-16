package dungeon_game;

public class Sword implements Weapon {
	private int hitCount;
	
	public Sword() {
		this.hitCount = 0;
	}


	@Override
	public int limit_of_hits() {
		return 5;
	}
	
	
	@Override
	public void itembehaviour(PlayerCharacter player) {
		if (hitCount < limit_of_hits()) {
			player.facing_Maptile().killEnemy();
			hitCount ++;
		}
	}
	
	
	

}
