import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
//        1)Для первой задачи
        System.out.println("Результат первой задачи:");
        System.out.println(task1(-9.0,45.0));
//        2)Для второй задачи
        System.out.println("Результат второй задачи:");
        System.out.println("Площадь: " + task2(10.0,2.0));
//        3)Для третьей задачи
        System.out.println("Результат третьей задачи:");
        System.out.println("Количество ног: " + task3(2,3,5));
//        4)Для четвертой задачи
        System.out.println("Результат четвертой задачи:");
        System.out.println(task4(1.0,3.0,5.0));
//        5)Для пятой задачи
        System.out.println("Результат пятой задачи:");
        System.out.println(task5(15.0,11.0,11.0));
//        6)Для Шестой задачи
        System.out.println("Результат шестой задачи:");
        System.out.println(task6((char)('A')));
//        7)Для седьмой задачи
        System.out.println("Результат седьмой задачи:");
        System.out.println(task7(7));
//        8)Для восьмой задачи
        System.out.println("Результат восьмой задачи:");
        System.out.println(task8(9,2));
//        9)Для девятой задачи
        System.out.println("Результат девятой задачи:");
        System.out.println(task9(new int[]{1,5,9}));
//        10)Для десятой задачи
        System.out.println("Результат десятой задачи:");
        System.out.println(task10(5,2,1));

    }
    static double task1(double a, double b){
        return a%b;
    }

    static double task2(Double A, Double h) {
        Double S = A * h * 0.5;
        return S;
    }

    static int task3(Integer Chicken, Integer Cow, Integer Pig) {
        Integer Legs = (Chicken * 2) + (Cow * 4) + (Pig * 4);
        return Legs;
    }

    static boolean task4(Double Prob, Double Prize, Double Pay) {
        if (Prob * Prize > Pay) {
            return true;
        } else {
            return false;
        }
    }

    static String task5(Double N, Double a, Double b) {
        if (a + b == N || b + a == N) {
            return "added";
        } else if (a - b == N || b - a == N) {
            return "subtracted";
        } else if (a * b == N) {
            return "умножено";
        } else if (a / b == N || b / a == N) {
            return "разделено";
        } else {
            return "none";
        }
    }
    static int task6(final char ASCII){
        return (char) ASCII;
    }
    static int task7(int O){
        Integer Count = 0;
        Integer Sum = 0;
        Integer sch = 1;
        while (Count!=O){
            Sum = Sum +sch;
            Count = Count +1;
            sch = sch +1;
        }
        return Sum;
        }
    static int task8(int a, int b){
        Integer Max = a+b-1;
        return Max;
    }
    static int task9(int[] array){
        Integer sum = 0;
        for (int i=0; i<array.length;i++)
            sum = sum + (array[i]*array[i]*array[i]);

        return sum;
    }
    static String task10(int a,int b, int c){
        Integer count = 0;
        while (count!=b) {
            a = a + a;
            count = count + 1;
        }if (a%c!=0) {
            return a + " не делится на " + c;
        }else
            return a + " делится на " + c;
        }
        }


