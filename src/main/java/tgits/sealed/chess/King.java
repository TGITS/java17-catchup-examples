package tgits.sealed.chess;

public final class King extends Piece {
    @Override
    public String toString() {
        return "%s King".formatted(this.color.toString());
    }
}
