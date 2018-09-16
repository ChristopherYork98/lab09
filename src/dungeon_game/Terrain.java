package dungeon_game;

// probably make abstract or interface later, depending on what we want
public class Terrain {
	MapTile current;
    public boolean isPassable() {
        return false;
    }
    public Terrain(MapTile current) {
    	this.current = current;
    }
    public void setCurrent(MapTile current) {
    	this.current = current;
    }
    
    public MapTile get_MapTile() {
    	return current;
    }
}
