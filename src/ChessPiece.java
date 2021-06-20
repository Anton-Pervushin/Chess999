public abstract class ChessPiece {
    public final static boolean White = true;
    public final static boolean Black = false;

    private boolean color;
    private int value;
    public ChessPiece(boolean c)
    {
        color = c;
        value = 0;
    }

    abstract public Vector getLegalMoves(Point from, ChessBoard b);

   abstract public void drawPiece(int x, int y, Graphics g);

    public boolean getColor() {
        return color;
    }
    public int getValue() {
        return value;
    }
    protected void setValue(int v) {
        value = v;
    }
}
