package Test;
import dungeon_game.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MovingTest {

	@Test
	public void MoveUp() {
		Map m = new Map(10);
		PlayerCharacter player = new PlayerCharacter();
		m.get_maptile(5,6).addEntity(player);
		m.MoveEntity(player, m.get_maptile(5, 6), "up");
		Assert.assertTrue(m.get_maptile(4, 6).hasPlayer());
		Assert.assertTrue(player.get_MapTile() == m.get_maptile(4, 6));
	}
	
	@Test
	public void MoveDown() {
		Map m = new Map(10);
		PlayerCharacter player = new PlayerCharacter();
		m.get_maptile(5,6).addEntity(player);
		m.MoveEntity(player, m.get_maptile(3, 1), "down");
		Assert.assertTrue(m.get_maptile(4, 1).hasPlayer());
		Assert.assertTrue(player.get_MapTile() == m.get_maptile(4, 1));
	}
	
	@Test
	public void move_Boulder() {
		Map m = new Map(20);
		PlayerCharacter player = new PlayerCharacter();
		m.get_maptile(5,4).addEntity(player);
		Boulder boulder = new Boulder(m.get_maptile(5, 5));
		m.get_maptile(5, 5).addEntity(boulder);
		m.MoveEntity(player, player.get_MapTile(), "right");
		Assert.assertTrue(m.get_maptile(5, 5).hasPlayer());
		Assert.assertEquals(m.get_maptile(5, 6),boulder.get_MapTile());
	}
	
	@Test
	public void move_two_Boulder() {
		Map m = new Map(20);
		PlayerCharacter player = new PlayerCharacter();
		m.get_maptile(5,5).addEntity(player);
		Boulder boulder1 = new Boulder(m.get_maptile(4, 5));
		m.get_maptile(4,5).addEntity(boulder1);
		Boulder boulder2 = new Boulder(m.get_maptile(3, 5));
		m.get_maptile(3,5).addEntity(boulder2);
		m.printOnTerminal();
		m.MoveEntity(player, player.get_MapTile(), "up");
		Assert.assertTrue(m.get_maptile(5, 5).hasPlayer());
		Assert.assertEquals(m.get_maptile(4, 5),boulder1.get_MapTile());
		Assert.assertEquals(m.get_maptile(3, 5),boulder2.get_MapTile());

	}
}
