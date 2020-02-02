package labs.lab_010;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Любимые фильмы");
        Film[] tempArr = library.getFilmsArr();
        int index = emptyIndex(tempArr);
        if (index != -1){
            tempArr[index] = new Film("Terminator 2", 2.00, "Action");
        }
        tempArr = library.getFilmsArr();
        index = emptyIndex(tempArr);
        if (index != -1){
            tempArr[index] = new Film("Terminator 3", 2.15, "Action");
        }
        tempArr = library.getFilmsArr();
        index = emptyIndex(tempArr);
        if (index != -1){
            tempArr[index] = new Film("Terminator 4", 2.12, "Action");
        }
        tempArr = library.getFilmsArr();
        index = emptyIndex(tempArr);
        if (index != -1){
            tempArr[index] = new Film("Terminator 5", 2.21, "Action");
        }

    }

    static int emptyIndex(Film[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null){
                return i;
            }
        }
        System.out.println("Вы достигли лимита");
        return -1;
    }
}
