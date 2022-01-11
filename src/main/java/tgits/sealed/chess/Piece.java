package tgits.sealed.chess;

public sealed interface Piece permits Pawn, Bishop, Knight, Rook, Queen, King {
    Color color();
}

record Bishop(Color color) implements Piece {
    @Override
    public String toString() {
        return "%s Bishop".formatted(this.color.toString());
    }
}

record King(Color color) implements Piece {
    @Override
    public String toString() {
        return "%s King".formatted(this.color.toString());
    }
}

record Knight(Color color) implements Piece {
    @Override
    public String toString() {
        return "%s Knight".formatted(this.color.toString());
    }
}

record Pawn(Color color) implements Piece {
    @Override
    public String toString() {
        return "%s Pawn".formatted(this.color.toString());
    }
}

record Queen(Color color) implements Piece {
    @Override
    public String toString() {
        return "%s Queen".formatted(this.color.toString());
    }
}

record Rook(Color color) implements Piece {
    @Override
    public String toString() {
        return "%s Rook".formatted(this.color.toString());
    }
}