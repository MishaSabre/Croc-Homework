/**
 * This class describes a chess square with coordinates X for the letter part and Y for the part with numbers
 */


public class ChessCell {

    int x;
    int y;

    /*
    In constructor checked whether the variables meet the constraints
    In setters that fact checked too
     */

    ChessCell(int x, int y){
        if( (x <= 0 && y <= 0) || (x > 8 && y > 8)){
            throw new IllegalArgumentException("X and Y must be greater then zero");
        }else if (x <= 0 || x > 8){
            throw new IllegalArgumentException("X must be greater then zero");
        }else if (y <= 0 || y > 8){
            throw new IllegalArgumentException("Y must be greater then zero");
        }else {
            this.x = x;
            this.y = y;
        }
    }

    public void setX(int x) {
        if (x <= 0 || x > 8){
            throw new IllegalArgumentException("X must be greater then zero");
        }else {
            this.x = x;
        }
    }

    public void setY(int y) {
        if (y <= 0 || y > 8){
            throw new IllegalArgumentException("Y must be greater then zero");
        }else {
            this.y = y;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /*
    toString() is redefined to output the cell position. If the cell has coordinates x = 1 y = 1, output will be 'a1'.
     */
    @Override
    public String toString(){

        String output = "";

        switch (x) {
            case 1 -> output += 'a';
            case 2 -> output += 'b';
            case 3 -> output += 'c';
            case 4 -> output += 'd';
            case 5 -> output += 'e';
            case 6 -> output += 'f';
            case 7 -> output += 'g';
            case 8 -> output += 'h';
        }

        output += Integer.toString(y);

        return output;
    }
}
