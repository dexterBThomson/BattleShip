
public class Main {
    public static Ship cruiser = new Ship("  Cruiser  ", 3);
    public static Ship smallBoat = new Ship("Small Boat ", 1);
    public static Ship bigBoat = new Ship("  Big Ship ", 2);
    public static Board b = new Board();
    public static void main(String[] args) {
        

        //Start Up
        
        System.out.println(b);
        Coord c = Input.takeC();
        System.out.println(c);
        System.out.println(cruiser);
        b.addShip(c, cruiser);
        System.out.println(b);

        //GameLoop
        //while(true){

       // }

    
    }
    
} 
