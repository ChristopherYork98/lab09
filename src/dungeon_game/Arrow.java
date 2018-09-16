package dungeon_game;

public class Arrow implements Weapon{

	@Override
	public int limit_of_hits() {
		return 1;
	}

	@Override
	public void itembehaviour(PlayerCharacter player) {
		MapTile maptile = Find_enemy(player.get_MapTile(),player.get_direction());
		if (maptile != null) maptile.killEnemy();
	}
	
	public MapTile Find_enemy(MapTile maptile,String direction) {
		while (maptile != null) {
			if (maptile.isPassable() == false) return null;
			if (maptile.hasEnemy()) return maptile;
			switch (direction) {
				case "up":maptile = maptile.getUp();
				case "down": maptile = maptile.getDown();
				case "left": maptile = maptile.getLeft();
				case "right": maptile = maptile.getRight();
			}
		}
		return null;
	}
	
	
	

}
