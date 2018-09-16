package dungeon_game;
import java.util.*;

public class PlayerCharacter {
	private Item Inhand;
	private Inventory Inventory;
	private String direction;
	private boolean invinciblity;
	private boolean hovering;
	private int currentTreasure;
	private MapTile maptile;
	
	public PlayerCharacter() {
		this.Inhand = null;
		this.Inventory = new Inventory(20);
		this.direction = "right";
		this.invinciblity = false;
		this.hovering = false;
		this.currentTreasure = 0;
		this.maptile = null;
	}
	
	public PlayerCharacter(int inventoryspace) {
		this.Inhand = null;
		this.Inventory = new Inventory(inventoryspace);
		this.invinciblity = false;
		this.hovering = false;
		this.currentTreasure = 0;
	}
	
	public void add_treasure(Treasure t) {
		currentTreasure += t.get_value();
	}
	
	public int get_treasure() {
		return currentTreasure;
	}
	
	public void dropItem(Item item) {
		Inventory.remove_item(item);
	}
	
	public void putInhand(Item item) {
		Inhand = item;
		Inventory.remove_item(item);
	}
	
	public Item add_item(Item new_item) {
		Item item = Inventory.add_item(new_item);
		return item;
	}
	
	public void pick_up_item() {
		ArrayList<Item> item_list = maptile.get_items();
		for (Item item:item_list) {
			if (item instanceof Treasure) {
				add_treasure((Treasure)item);
				continue;
			}
			Inventory.add_item(item);
		}
	}

	public MapTile get_MapTile() {
		return maptile;
	}
	
	public void use_item() {
		if (Inhand != null)
			Inhand.itembehaviour(this);
	}
	
	
	public MapTile facing_Maptile() {
		switch (direction) {
		case "up":return maptile.getUp();
		case "down": return maptile.getDown();
		case "left": return maptile.getLeft();
		case "right":return maptile.getRight();
		}
		return maptile;
	}
	
	public boolean Invinciblity() {
		return invinciblity;
	}

	public void setInvinciblity(boolean invinciblity) {
		this.invinciblity = invinciblity;
	}

	public boolean isHovering() {
		return hovering;
	}

	public void setHovering(boolean hovering) {
		this.hovering = hovering;
	}

	public String get_direction() {
		return this.direction;
	}

	public void set_maptile(MapTile maptile) {
		this.maptile = maptile;
	}
	
	public void make_a_move(MapTile maptile) {
		set_maptile(maptile);
		maptile.collision();
		pick_up_item();
	}
	
	

	
}
