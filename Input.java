import java.util.Scanner;
public class Input {
    public static String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

    public static Coord takeC(){
        Coord a = new Coord(0, 0);
        Scanner input = new Scanner(System.in);
        boolean bonk = true;
        boolean bonked = true;
        int col = 11;
        int row = -1;
        while(bonk && bonked){
            bonk = true;
            bonked = true;
            System.out.println("Where?");
            String c = input.nextLine();
            String l = c.substring(0, 1);
            l = l.toLowerCase();
            for(int i = 0; i < abc.length; i++){   
                if(l.equals(abc[i])){
                    col = i;
                    bonk = false;
                    break;
                }
            }
            if(col == 11){
                System.out.println("Bad input, please try again... (A1-J10)");
            }
            int t = Integer.parseInt(c.substring(1));
            if(0 <= t && t <= 10){
                row = t - 1;
                bonked = false;
            }
        }
        a.setCol(col);
        a.setRow(row);

        
        
        return a;
    }
}
