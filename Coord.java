public class Coord {
    public static int row;
    public static int col;
    public Coord(int c, int r){
        row = r;
        col = c;
    }
    public int col(){
        return col;
    }
    public int row(){
        return row;
    }
    public void setRow(int r){
        row = r;
    }
    public void setCol(int c){
        col = c;
    }
    public String toString(){
        return "(" + col + ", " + row + ")";
    }
}
