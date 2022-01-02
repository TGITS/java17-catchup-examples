package tgits.sealed.chess;

public sealed abstract class Piece permits Pawn,Bishop, Knight, Rook, Queen, King{

    protected Color color;

    @Override
    public abstract String toString();
}
