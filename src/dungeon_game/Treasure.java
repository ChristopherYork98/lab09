package dungeon_game;

public class Treasure implements Item{
	private int value;
	
	public Treasure(int value) {
		this.value = value;
	}
	
	public int get_value() {
		return value;
	}
	
	@Override
	public void itembehaviour(PlayerCharacter player) {
		// TODO Auto-generated method stub
		player.add_treasure(this);		
	}

}
