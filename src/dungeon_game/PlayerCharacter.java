package dungeon_game;

public class PlayerCharacter {
	private Item Inhand;
	private Inventory Inventory;
	private String direction;
	private boolean invincible;
	private boolean hovering;
	private int currentTreasure;
	
	public PlayerCharacter(int inventoryspace) {
		this.Inhand = null;
		this.Inventory = new Inventory(inventoryspace);
		this.invincible = false;
		this.hovering = false;
		this.currentTreasure = 0;
	}
	
	public Item pickupItem(Item item) {
		return this.Inventory.add_item(item);
	}
	
	public void dropItem(Item item) {
		this.Inventory.remove_item(item);
	}
	
	public void putInhand(Item item) {
		this.Inhand = item;
		this.Inventory.remove_item(item);
	}
	

	
	
}
