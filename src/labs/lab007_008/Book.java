package labs.lab007_008;

public class Book {
    private int pageCount;
    private String title;
    private String author;
    static final String PUBLISHING_HOUSE = "Pepega";

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book { " +
                "pageCount=" + pageCount +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                " }";
    }

    public void goTo(int page){
        System.out.println("Вы перешли на " + page + " страницу");
    }

    public void goTo(String chapter){
        System.out.println("Вы перешли на главу " + chapter);
    }
}
