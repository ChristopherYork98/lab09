package dungeon_game;


public class Hover_Potion implements Item{
	private int time;
	
	public Hover_Potion(int time){
		this.time = time;
	}
	

	@Override
	public void itembehaviour(PlayerCharacter player) {
		// TODO Auto-generated method stub
		player.setHovering(true);
	}


}
