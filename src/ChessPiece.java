public abstract class ChessPiece {
    String color;
    boolean check;

    ColorChess(String color) {
        this.color = color;
    }
    public abstract void getColor() {

    }
}
