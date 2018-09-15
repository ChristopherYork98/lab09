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
		this.invinciblity = false;
		this.hovering = false;
		this.currentTreasure = 0;
	}
	
	public PlayerCharacter(int inventoryspace) {
		this.Inhand = null;
		this.Inventory = new Inventory(inventoryspace);
		this.invinciblity = false;
		this.hovering = false;
		this.currentTreasure = 0;
	}
	
	public void add_treasure(int value) {
		currentTreasure += value;
	}
	
	public Item pickupItem(Item item) {
		return Inventory.add_item(item);
	}
	
	public void dropItem(Item item) {
		Inventory.remove_item(item);
	}
	
	public void putInhand(Item item) {
		Inhand = item;
		Inventory.remove_item(item);
	}
	
	public void picking_up_item() {
		ArrayList<Item> item_list = maptile.get_items();
		for (Item item:item_list) {
			Inventory.add_item(item);
		}
	}

	public MapTile get_MapTile() {
		return maptile;
	}
	
	public void use_weapons() {
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

	

	
}
