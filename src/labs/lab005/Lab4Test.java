package labs.lab005;

import java.util.Arrays;
import java.util.Random;

/**
 * This is prototype for Lab 4.
 */
public class Lab4Test {

    public static void main(String[] args) {

        // PART 1
        System.out.println("PART 1");
        // 1.1)
        System.out.println("1.1)");
        // Существует 2 способа используя newили литерал {...}.  Необходимо (следуя требованиям TODO),
        //  проинициализировать 2 массива первый с помощью new, второй с помощью {...}.
        //  Для первого массива необходимо вставить значения на требуемые позиции (в ячейки).
        //  Второй массив следует сразу же проинициализировать любымипроизвольными значениями.
        // TODO insert some value to start of array and to end of array.
        float[] firstArray = new float[4];
        firstArray[0] = 1.1f;
        firstArray[3] = 4.3f;
        System.out.println(Arrays.toString(firstArray));
        System.out.println();

        // TODO init and fill it's array with any values. Use {} syntax.
        int[] intArray = {1, 2, 3, 4};
        System.out.println(Arrays.toString(intArray));
        System.out.println();


        // 1.2)
        System.out.println("1.2)");
        // Копирование массива.Следует правильно скопировать указанный в TODO
        //  массив в новый, используя соответствующий метод утилиты Arrays.
        // TODO copy "intArray". Use copyOf...
        int[] intArrayCopy = Arrays.copyOf(intArray, 4);
        System.out.println(Arrays.toString(intArrayCopy));
        System.out.println();


        // 1.3)
        System.out.println("1.3)");
        // Сортировка массива Следует правильно отсортировать указанный в TODO массив, используя соответствующий метод утилиты Arrays.
        // TODO sort "intArrayCopy", use Arrays sort.
        Arrays.sort(intArrayCopy);
        System.out.println(Arrays.toString(intArrayCopy));
        System.out.println();


        // 1.4)
        System.out.println("1.4)");
        // Представление массива строкой Следует вывести на экран указанный в TODOмассив, используя соответствующий метод утилиты Arrays.
        // TODO print "intArrayCopy", use Arrays toString.
        System.out.println(Arrays.toString(intArrayCopy));
        System.out.println();


        // 1.5)
        System.out.println("1.5)");
        // Сравнение массивовСледует сравнить указанные в TODOмассивы, используя соответствующий метод утилиты Arrays.
        // Также необходимо вывести в консоль соответствующее сообщение если массивы равны или наоборот не равны.
        // TODO compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".
        if (Arrays.equals(intArray, intArrayCopy)){
            System.out.println("Arrays equals");
        }else{
            System.out.println("Arrays not equals");
        }
        System.out.println();


        // PART 2
        System.out.println("PART 2");
        // Необходимо посчитать сумму всех значений в массиве
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};


        // Print array values in cycle.
        for (int value: testArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        // 2.1)
        System.out.println("2.1)");
        // TODO calc sum of all array elements and print result.
        int result = 0;
        for (int val:testArray) {
            result += val;
        }
        System.out.println(result);
        System.out.println();


        // 2.2)
        System.out.println("2.2)");
        // TODO calc sum of all numbers with odd indexes and print result.
        int result2 = 0;
        for (int i = 0; i < testArray.length; i++) {
            if (i%2==0){
                result2 += testArray[i];
            }
        }
        System.out.println(result2);
        System.out.println();


        // 2.3)
        System.out.println("2.3)");
        // TODO find max value in array.
        int result3 = 0;
        for (int val:testArray) {
            if (val>result3){
            result3 = val;
            }
        }
        System.out.println(result3);
        System.out.println();


        // PART 3
        System.out.println("PART 3");


        //3.1
        // TODO create two-dimensional array with size [3][4]
        int[][] intArr = new int[3][4];


        //3.2
        // TODO fill array with any numbers in cycles.
        Random random = new Random();
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                intArr[i][j] = random.nextInt(10);
            }
        }


        //3.3
        System.out.println("3.3");
        // TODO calc sum of all array elements and print result.
        int mySum = 0;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                mySum += intArr[i][j];
            }
        }
        System.out.println(mySum);
        System.out.println();


        // PART 4*
        System.out.println("PART 4*");

        long[][] matrix = new long[9][9];

        int ratio = 0;
        for (long[] row: matrix ) {
            Arrays.fill(row, ++ratio);
        }

        long sum = 0;
        // TODO* calc sum only max and min values of matrix by expression: 2 < i <= 5 and only every third j value.
        long[] excerpt = {};
        long[] temp = new long[1];

        for (int i = 0; i < matrix.length; i++) {
        int step = 1;
            for (int j = 0; j < matrix[i].length; j++) {
                if (i > 2 && i <= 5 && (step % 3 == 0)){
                    temp[temp.length-1] = matrix[i][j];
                    temp = Arrays.copyOf(temp, temp.length + 1);
                }
                step-=-1;
            }
        }
        excerpt = Arrays.copyOf(temp, temp.length - 1);
        Arrays.sort(excerpt);
        sum = excerpt[0] + excerpt[excerpt.length-1];
        System.out.println(sum);
    }


}