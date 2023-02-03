public class Board {
    Tile nothing = new Tile("Nothing");
    Tile ship = new Tile("Ship");
    Tile guessedHit = new Tile("GuessedHit");
    Tile guessedMiss = new Tile("GuessedMiss");
    Tile[][] board = {
            {nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing},
            {nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing},
            {nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing},
            {nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing},
            {nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing},
            {nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing},
            {nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing},
            {nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing},
            {nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing},
            {nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing, nothing}};
    public Board(){

    }
    public String toString(){
        System.out.println("          A              B               C             D               E              F               G              H               I               J");
        String b = "";
        for(int i = 0; i < board.length; i++){
                b += i + 1;
                if(i < 9){
                    b += " ";
                }
            
            for(int j = 0; j < board[i].length; j++){
                b += board[j][i] + " ";
            }
            b += "\n\n";
        }
        return b;
    }
    public void addShip(Coord c, Ship s){
        board[c.col()][c.row()] = s;

    }
    
}


