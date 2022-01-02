package tgits.sealed.chess;

public final class Bishop extends Piece {
    @Override
    public String toString() {
        return "%s Bishop".formatted(this.color.toString());
    }
}
