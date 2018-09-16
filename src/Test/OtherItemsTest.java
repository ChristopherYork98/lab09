package Test;
import dungeon_game.*;
import junit.framework.Assert;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OtherItemsTest {

	Map m = new Map(20);
	PlayerCharacter p = new PlayerCharacter();
	Enemy e = new TheHunter();
	
	@Test
	public void DoorTest() {
		Door door = new Door(m.get_maptile(12, 10));
		m.get_maptile(12, 9).addEntity(p);
		m.get_maptile(12, 10).addEntity(door);
		
		m.MoveEntity(p, p.get_MapTile(), "right");
		Assert.assertFalse(m.get_maptile(12, 10).hasPlayer());
	}
	
	@Test
	public void KeyTest() {
		Door door = new Door(m.get_maptile(12, 10));
		door.setDoorvalue(01);
		m.get_maptile(12, 9).addEntity(p);
		m.get_maptile(12, 10).addEntity(door);
		
		Key key = new Key(01);
		p.add_item(key);
		p.putInhand(key);
		p.use_item();
		m.MoveEntity(p, p.get_MapTile(), "right");
		
		Assert.assertTrue(m.get_maptile(12, 10).hasPlayer());
	}
	
	@Test
	public void TreasureTest() {
		Treasure treasure = new Treasure(100);
		m.get_maptile(10, 9).addEntity(p);
		m.get_maptile(11, 9).addEntity(treasure);
		
		
		m.MoveEntity(p, p.get_MapTile(), "down");
		Assert.assertEquals(100, p.get_treasure());
	}
	

}
