package dungeon_game;
import java.util.*;


public class Inventory {
	private int size;
	private ArrayList<Item> items;
	
	public Inventory(int size) {
		this.size = size;
		this.items = new ArrayList<Item>();
 	}
	
	public Inventory(int size, ArrayList<Item> items) {
		this.size = size;
		this.items = items;
	}
	
	public int number_of_items() {
		return items.size();
	}
	
	public void add_item(Item new_item) {
		if (number_of_items() < size) {
			items.add(new_item);	
		}
	}
	
	public void remove_item(Item item) {
		items.remove(item);
	}
	

	
}

