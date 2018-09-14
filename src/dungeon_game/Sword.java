package dungeon_game;

public class Sword extends Item implements Weapon {
	private int used_hit;
	
	public Sword(String name) {
		super(name);
		this.used_hit = 0;
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void itembehaviour() {
		//TODO Auto-generated method stub
		
	}
	
	@Override
	public int limit_of_hits() {
		return 5;
	}
	
	
	

}
