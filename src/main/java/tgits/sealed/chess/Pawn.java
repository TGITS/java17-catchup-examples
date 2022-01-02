package tgits.sealed.chess;

public final class Pawn extends Piece {
    @Override
    public String toString() {
        return "%s Pawn".formatted(this.color.toString());
    }
}
