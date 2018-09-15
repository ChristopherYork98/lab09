package dungeon_game;

public class Invincibility_Potion implements Item{
		
	@Override
	public void itembehaviour(PlayerCharacter player) {
		// TODO Auto-generated method stub
		player.setInvinciblity(true);
	}
	
	

}
