public class Tile {
    public static String name;
    
    public Tile(String n){
        n = name;
    }
    public String toString(){
        String n = "[             ]";
        if(name == "GuessedHit"){
            n = "[ hit  ]";
        }
        else if(name == "GuessedMiss"){
            n = "[ miss ]";
        }
        else if(name == "Ship"){
            n = "[ ship ]";
        }
        

        return n;
    }
}




