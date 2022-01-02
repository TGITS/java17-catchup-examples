package tgits.sealed.chess;

public final class Rook extends Piece {
    @Override
    public String toString() {
        return "%s Rook".formatted(this.color.toString());
    }
}
