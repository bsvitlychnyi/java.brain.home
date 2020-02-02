package labs.lab_010;

public class Film {
    private String title;
    private double lasting;
    private String genre;
    public static final String GENRE_COMEDY = "Comedy";
    public static final String GENRE_ACTION = "Action";
    public static final String GENRE_HORRORS = "Horrors";

    public Film(String title, double lasting, String genre){
        {
            System.out.println("Создается новый Фильм");
        }
        this.title = title;
        this.lasting = lasting;
        switch (genre){
            case(GENRE_ACTION):
                this.genre = GENRE_ACTION;
                break;
            case(GENRE_COMEDY):
                this.genre = GENRE_COMEDY;
                break;
            case(GENRE_HORRORS):
                this.genre = GENRE_HORRORS;
                break;
            default:
                this.genre = "Unknown";
        }
        System.out.println("Фильм " + this.title + " , успешно создан.");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLasting() {
        return lasting;
    }

    public void setLasting(double lasting) {
        this.lasting = lasting;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
