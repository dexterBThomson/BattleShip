import java.util.ArrayList;

public class PlayerShips {
    public ArrayList<Ship> playerShip = new ArrayList<Ship>();

    public PlayerShips(){
        
    }
    public void addShip(Ship s, Coord c){
        playerShip.add(s);
        int t = s.getTiles();
        if(t == 1){
            Main.b.addShip(c, s);
        }
        else if(t == 2){
            Main.b.addShip(c, s);
            Main.b.addShip(new Coord(c.col(), c.row() + 1), s);
        }
        else if(t == 3){
            Main.b.addShip(c, s);
            Main.b.addShip(new Coord(c.col(), c.row() + 1), s);
            Main.b.addShip(new Coord(c.col(), c.row() + 2), s);
        }

    }
   // public void 
}
