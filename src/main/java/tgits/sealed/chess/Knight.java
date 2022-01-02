package tgits.sealed.chess;

public final class Knight extends Piece {
    @Override
    public String toString() {
        return "%s Knight".formatted(this.color.toString());
    }
}
