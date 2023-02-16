import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 27;
        if (age > 17) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("задача 2");
        int weather = 7;
        if (weather >= 5) {
            System.out.println("На улице " + weather + " градусов, сегодня тепло, можно идти без шапки");
        }
        if (weather <= 5) {
            System.out.println("На улице " + weather + " градусов, на улице холодно, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 58;
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно.");
        }
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придеться оплатить штраф.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int age = sc.nextInt();
        if (age >= 2 && age <= 6) {
            System.out.println("если возвраст человека " + age + " то ему стоит ходить в детский сад");
        }
        if (age >= 7 && age < 18) {
            System.out.println("если возвраст человека " + age + " то ему стоит ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("если возвраст человека " + age + " то ему стоит ходить в университет");
        }
        if (age > 24) {
            System.out.println("если возвраст человека " + age + " то ему стоит ходить на работу");
        }
        return;
    }

    public static void task5() {
        System.out.println("Задача 5");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int age = sc.nextInt();
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " о он не может кататься на аттракционе.");
        }
        if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + " то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + " то он может кататься без сопровождения взрослого.");
        }
        return;
    }

    public static void task6() {
        System.out.println("Задача 6");
        Scanner people = new Scanner(System.in);
        int place = people.nextInt();
        if (place <= 1 && place <= 60) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (place >= 61 && place <= 102) ;
        {
            System.out.println("В вагоне нету сидячих мест , но есть стоячии");
        } if (place>=103){
            System.out.println("В вагоне мест нет");
        }
    return;
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 13;
        int two = 27;
        int three = 18;
        if(one>two){
            if(one>three) {
                System.out.println("Число самое большое " + one);
            } else if(three>one) {
                System.out.println("Число самое большое " + three);
            }  else{
                            System.out.println("Число "+one +" и "+three+" равны");
                        }
                    }else if(two>one) {
            if (two > three) {
                System.out.println("Число самое большое " + two);
            } else if (three > two) {
                System.out.println("Самое большое число " + three);
            } else {
                System.out.println("Число " + two + " и " + three + " равны");
            }
        }else {
            if (one > three)
                System.out.println("Самое большое число " + one);
        else if(three>one){
                System.out.println("Самое большое число "+three);
            }else {
                System.out.println("все числа равны");
            }
        }
    }
}