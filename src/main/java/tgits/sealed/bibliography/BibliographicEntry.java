package tgits.sealed.bibliography;

import java.time.Month;
import java.time.Year;
import java.util.List;

/**
 * A bibliographic entry of type BibTex
 */
public sealed abstract class BibliographicEntry permits Article, Book, Booklet, Conference, Inbook, Incollection,
        Inproceedings, Manual, MastersThesis, Misc, PhdThesis, Proceedings, Techreport, Unpublished {

    protected String address;
    protected String annote;
    protected List<String> authors;
    protected String bookTitle;
    protected int chapter;
    protected String edition;
    protected String howPublished;
    protected String institution;
    protected String journal;
    protected String key;
    protected Month month;
    protected String note;
    protected int number;
    protected String organization;
    protected List<PagesRange> pages;
    protected String publisher;
    protected String school;
    protected String series;
    protected String title;
    protected String type;
    protected int volume;
    protected Year year;

    public abstract String toString();

    public abstract boolean isValid();
}
