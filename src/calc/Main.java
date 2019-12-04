package calc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Допускаются выражения в формате '4+5.7+6/(-5.4)' или '-6*7-82' или '(-7-4)/7+8*(2+2*2)' \n" +
                "или даже (-7-(-4))/7+(8/9+2*(-6-(5-3)-3)+8+6)+8*(2+(2+2)+2*2)\n" +
                "Колличество операций неограничено. \n" +
                "Для завершения работы введите 'выйти' или 'exit'\n" +
                "Введите выражение:");

        while (true) {
            String str = scanner.nextLine();
            str = str.replaceAll("\\s", "");  // удаляем все пробелы
            if (str.equals("exit") || str.equals("выйти")) {
                break;
            } else if (checkErrors(str)) {
                System.out.println("Вы, возможно, опечатались или данный калькулятор не поддерживает этот функционал");
                System.out.println("Попробуйте ввести выражение заново:");
                continue;
            }
            str = skobki(str);
            System.out.println("Результат: " + startCalculate(str));
        }
    }

    // Этот метод принимает строку с выражением и вначале рекурсивно добирается до самых 'глубоких' скобок,
    // а потом сокращает скобки первого уровня. Возвращает строку с выражением в котором уже нет скобок
    private static String skobki(String str) {

        Pattern pp = Pattern.compile("[(][^)]*[(]+[^)]+[)]");  // поиск скобок в скобках
        Matcher mm = pp.matcher(str);
        // если найдем то уходим в рекурсию и добираемся до последних
        if (mm.find()) {
            str = str.replace(str.substring(mm.start() + 1, mm.end()), skobki(str.substring(mm.start() + 1, mm.end())));
            str = skobki(str);
        }
        Pattern p = Pattern.compile("[(][^)]+[)]");
        Matcher m = p.matcher(str);
        // пока мы находим в строке выражения в скобках передаем их на расчет
        while (m.find()) {
            String localStr = m.group().substring(1, m.group().length() - 1);  // получаем выражение в скобках и удаляем эти скобки
            str = str.replace(m.group(), startCalculate(localStr));
        }
        return str;
    }

    // Этот метод принимает строку с выражением и рапределяет, что считать первым (сначала умножение и деление)
    private static String startCalculate(String str) {
        str = str.replace("--", "+");
        str = str.replace("+-", "-");
        // проверяем есть ли умножение или деление и выполняем их первыми
        Pattern p = Pattern.compile("[\\d]+[\\.]?[\\d]*[*/]+[\\d]+[\\.]?[\\d]*");
        Matcher m = p.matcher(str);
        if (m.find()) {
            str = str.replace(str.substring(m.start(), m.end()), Double.toString(getResult(m.group())));
            str = startCalculate(str);
        }
        // проверяем есть ли умножение или деление на отрицательное число и выполняем их
        Pattern pp = Pattern.compile("[\\d]+[\\.]?[\\d]*[*/]+[-]+[\\d]+[\\.]?[\\d]*");
        Matcher mm = pp.matcher(str);
        if (mm.find()) {
            str = str.replace(str.substring(mm.start(), mm.end()), Double.toString(getResult(mm.group())));
            str = startCalculate(str);
        }
        str = Double.toString(getResult(str));
        return str;
    }

    // Метод принимает строку и производит расчет. Все зависит от того есть ли вначале строки минус,
    // или есть ли умножение или деление на отрицательное число
    private static double getResult(String str) {
        double result;
        String localStr = str;
        String[] numerics = localStr.split("[-+/*]");  // получаем все числа из этого выражения
        double[] numbers;  // Задание массива для преобразованиея в double
        String[] operators;  // Задание массива операторов выражения​
        Pattern pp = Pattern.compile("[\\d]+[\\.]?[\\d]*[*/]+[-]+[\\d]+[\\.]?[\\d]*");
        Matcher mm = pp.matcher(str);
        if (mm.find()) {
            numbers = new double[numerics.length - 1];
            numbers[0] = Double.parseDouble(numerics[0]);
            numbers[1] = Double.parseDouble(numerics[2]);
            numbers[1] = -numbers[1];
            operators = localStr.split("\\d+\\.*\\d*");  // Массив операторов выражения
            operators = operators[1].split("");
            result = numbers[0];
            if (operators[0].compareTo("*") == 0) {
                result = result * numbers[1];
            } else if (operators[0].compareTo("/") == 0) {
                result = result / numbers[1];
            }
            return result;
        } else if (localStr.startsWith("-")) {
            numbers = new double[numerics.length - 1];
            for (int i = 1; i < numerics.length; i++) {
                numbers[i - 1] = Double.parseDouble(numerics[i]);  // Заполнение массива преобразованными к double значениями
            }
            operators = localStr.split("\\d+\\.*\\d*");
            numbers[0] = -numbers[0];
        } else {
            numbers = new double[numerics.length];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Double.parseDouble(numerics[i]);
            }
            operators = localStr.split("\\d+\\.*\\d*");
        }
        result = numbers[0];
        int b = 1;
        while (b < operators.length) {

            // Сложение
            if (operators[b].compareTo("+") == 0) {
                result = result + numbers[b];
                b++;
                // Вычитание
            } else if (operators[b].compareTo("-") == 0) {
                result = result - numbers[b];
                b++;
                // Умножение
            } else if (operators[b].compareTo("*") == 0) {
                result = result * numbers[b];
                b++;
                // Деление
            } else if (operators[b].compareTo("/") == 0) {
                result = result / numbers[b];
                b++;
            }
        }
        return result;
    }

    // метод проводит проверку введенной пользователем строки на валидность и возвращает false если все хорошо
    private static boolean checkErrors(String str) {
        // Проверяем с чего начинается строка. Если цифра '+' или '-' или '(' то все норм
        Pattern pattern1 = Pattern.compile("^[-+(0-9].+.*");
        Matcher matcher1 = pattern1.matcher(str);
        boolean firstCheck = !matcher1.find();

        // Проверяем колличество открывающих и закрывающих скобок
        long open = str.chars().filter(ch -> ch == '(').count();
        long close = str.chars().filter(ch -> ch == ')').count();
        boolean secCheck = (open != close);

        // проверяем на символы с которыми мы не сможем работать
        Pattern pattern2 = Pattern.compile("[^-+*/)(0-9\\.]");
        Matcher matcher2 = pattern2.matcher(str);
        boolean thirdCheck = matcher2.find();

        // проверяем есть ли вообще выражение (может пользователь ввел только одно число)
        Pattern pattern3 = Pattern.compile("^[-+(0-9]+[^-*+/]*[-+/*]+[(0-9]+.*[)0-9]+$");
        Matcher matcher3 = pattern3.matcher(str);
        boolean fourthCheck = !matcher3.find();

        // проверяем есть ли в выражении скобки в которых нет чисел
        Pattern pattern4 = Pattern.compile("[(]+[^0-9]*[)]+");
        Matcher matcher4 = pattern4.matcher(str);
        boolean fifthCheck = matcher4.find();

        return firstCheck || secCheck || thirdCheck || fourthCheck || fifthCheck;
    }
}

