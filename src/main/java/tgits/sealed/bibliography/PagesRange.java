package tgits.sealed.bibliography;

public record PagesRange(int pageNumberStart, int pageNumberEnd) {
    public PagesRange of(int pageNumber) {
        return new PagesRange(pageNumber, pageNumber);
    }

    public PagesRange of(int pageNumberStart, int pageNumberEnd) {
        return new PagesRange(pageNumberStart, pageNumberEnd);
    }
}
