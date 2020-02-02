package labs.lab_010;

public class Library {
    {
        this.filmsArr = new Film[5];
        this.filmsArr[0] = new Film("Avatar", 2.30, "Action");
        this.filmsArr[1] = new Film("This", 2.00, "Horror");
        System.out.println("Добавлены любимые фильмы");
    }
    private Film[] filmsArr;
    private final String name;

    public Library(String name) {
        this.name = name;
        System.out.println("Библиотека "+ this.name +", успешно создана");
    }

    public Film[] getFilmsArr() {
        return filmsArr;
    }

    public void setFilmsArr(Film[] filmsArr) {
        this.filmsArr = filmsArr;
    }

    public String getName() {
        return name;
    }
}
