package tgits.sealed.chess;

public abstract sealed class Piece permits Pawn, Bishop, Knight, Rook, Queen, King {

    protected Color color;

    @Override
    public abstract String toString();
}

final class Bishop extends Piece {
    @Override
    public String toString() {
        return "%s Bishop".formatted(this.color.toString());
    }
}

final class King extends Piece {
    @Override
    public String toString() {
        return "%s King".formatted(this.color.toString());
    }
}

final class Knight extends Piece {
    @Override
    public String toString() {
        return "%s Knight".formatted(this.color.toString());
    }
}

final class Pawn extends Piece {
    @Override
    public String toString() {
        return "%s Pawn".formatted(this.color.toString());
    }
}

final class Queen extends Piece {
    @Override
    public String toString() {
        return "%s Queen".formatted(this.color.toString());
    }
}

final class Rook extends Piece {
    @Override
    public String toString() {
        return "%s Rook".formatted(this.color.toString());
    }
}