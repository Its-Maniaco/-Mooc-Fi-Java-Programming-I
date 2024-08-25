public class Book {
    private String title;
    private int pages;
    private String publication;

    public Book(String title, int pages, String publication) {
        this.title = title;
        this.pages = pages;
        this.publication = publication;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public String getPublication() {
        return this.publication;
    }
}
