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
    public static void helpFunction1(int age) {
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    static void task1() {
        int age1 = 17;
        int age2 = 19;
        helpFunction1(age1);
        helpFunction1(age2);
    }
    public static void helpFunction2(int temperature) {
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
    }
    static void task2() {
        int temperature1 = 0;
        int temperature2 = 5;
        helpFunction2(temperature1);
        helpFunction2(temperature2);
    }
    public static void helpFunction3(int speed) {
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }
    static void task3() {
        int speed1 = 100;
        int speed2 = 60;
        helpFunction3(speed1);
        helpFunction3(speed2);
    }
    public static void helpFunction4(int age) {
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age > 6 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университете.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему то ему нужно ходить на работу.");
        }
    }
    static void task4() {
        int age1 = 3;
        int age2 = 13;
        int age3 = 19;
        int age4 = 24;
        helpFunction4(age1);
        helpFunction4(age2);
        helpFunction4(age3);
        helpFunction4(age4);
    }
    public static void helpFunction5(int age) {
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    static void task5() {
        int age1 = 3;
        int age2 = 13;
        int age3 = 19;
        helpFunction5(age1);
        helpFunction5(age2);
        helpFunction5(age3);
    }
    public static void helpFunction6(int place) {
        if (place <= 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (place > 60 && place <= 102) {
            System.out.println("В вагоне остались только стоячие места");
        } else {
            System.out.println("В вагоне не осталось мест");
        }
    }
    static void task6() {
        int place1 = 3;
        int place2 = 102;
        int place3 = 500;
        helpFunction6(place1);
        helpFunction6(place2);
        helpFunction6(place3);
    }
    static void task7() {
        int one = 600;
        int two = 102;
        int three = 500;
        if (one >= two && one >= three) {
            System.out.println(one);
        } else if (two >= three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}
