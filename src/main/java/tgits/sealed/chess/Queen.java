package tgits.sealed.chess;

public final class Queen extends Piece {
    @Override
    public String toString() {
        return "%s Queen".formatted(this.color.toString());
    }
}
