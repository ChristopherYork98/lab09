package dungeon_game;

// probably make abstract or interface later, depending on what we want
public class Terrain {
	MapTile current;
    public boolean isPassable() {
        return false;
    }
    public Terrain(MapTile current) {
    	current = this.current;
    }
    public void setCurrent(MapTile current) {
    	current = this.current;
    }
    
}
