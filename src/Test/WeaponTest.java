package Test;
import dungeon_game.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class WeaponTest {


	Map m = new Map(10);
	PlayerCharacter p = new PlayerCharacter();
	Enemy e = new TheHunter();
	
	@Test
	public void UseSwordtest() {
		Sword sword = new Sword();
		m.get_maptile(3, 5).addEntity(p);
		m.get_maptile(3, 6).addEntity(e);

		p.add_item(sword);
		p.putInhand(sword);
		p.use_item();
		Assert.assertTrue(m.get_maptile(3, 5).hasPlayer());
		Assert.assertFalse(m.get_maptile(3, 6).hasEnemy());	
	}
	
	@Test
	public void UseArrowtest() {
		Arrow arrow = new Arrow();
		m.get_maptile(3, 5).addEntity(p);
		m.get_maptile(3, 8).addEntity(e);

		p.add_item(arrow);
		p.putInhand(arrow);
		p.use_item();
		Assert.assertTrue(m.get_maptile(3, 5).hasPlayer());
		Assert.assertFalse(m.get_maptile(3, 8).hasEnemy());	
	}

	@Test
	public void UseBombtest() {
		Bomb bomb = new Bomb();
		m.get_maptile(3, 5).addEntity(p);
		m.get_maptile(4, 5).addEntity(e);

		p.add_item(bomb);
		p.putInhand(bomb);
		p.use_item();
		Assert.assertTrue(m.get_maptile(3, 5).hasPlayer());
		Assert.assertFalse(m.get_maptile(4, 5).hasEnemy());	
	}
	
	
	
	
}
