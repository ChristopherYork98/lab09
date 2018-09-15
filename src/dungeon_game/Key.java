package dungeon_game;

public class Key implements Item  {
	private int KeyValue;
	
	public Key(int KeyValue) {
		this.KeyValue = KeyValue;
	}

	@Override
	public void itembehaviour(PlayerCharacter player) {
		MapTile maptile = player.get_MapTile();
		if (maptile.hasDoor() != null) {
			Door door = maptile.hasDoor();
			if (door.getDoorvalue() == KeyValue)
				door.unlock();
		}
		
	}
	
}


