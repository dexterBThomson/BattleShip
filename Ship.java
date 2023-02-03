public class Ship extends Tile {
    public static String name;
    public static int tiles;
    public static Coord position;
    public static int damage;
    public Ship(String n, int t){
        super(n);
        name = n;
        tiles = t;
    }
    //public Ship(String n){
    //    name = n;
    //    tiles = 0;
    //}
    public int getTiles(){
        return tiles;
    }
    public static int getHealth(){
        return tiles - damage;
    }
    public static void setPosition(Coord c){
        position = c;
    }
    public static String getName(){
        return name;
    }
    public static int hit(){
        damage++;
        if(getHealth() <= 0){
            return -1;
        }
        return 0;
    }
    
    public String toString(){
        return "[ " + name + " ]";
    }
    
}
