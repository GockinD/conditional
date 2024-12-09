public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();
        System.out.println("Задача 2");
        int temperature = 5;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println();
        System.out.println("Задача 3");
        int speed = 62;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        System.out.println();
        System.out.println("Задача 4");
        int age1 = 7;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека " + age1 + ", то ему нужно ходить в детский сад");
        }
        if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека " + age1 + ", то ему нужно ходить в школу");
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека " + age1 + ", то ему нужно ходить в университет");
        }
        if (age1 > 24) {
            System.out.println("Если возраст человека " + age1 + ", то ему нужно ходить на работу");
        }
        System.out.println();
        System.out.println("Задача 5");
        int ageChild = 7;
        boolean adult = true;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на атракционе");
        }
        if (ageChild >= 5 && ageChild < 14 && adult) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься в сопровождении");
        }
        if (ageChild >= 5 && ageChild < 14 && !adult) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", но нет сопровождения, то ему нельзя кататься");
        }
        if (ageChild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься без сопровождения");
        }
        System.out.println();
        System.out.println("Задача 6");
        int capacity = 102;
        int seat = 60;
        int passenger = 104;
        if (passenger < 60) {
            System.out.println("Если пассажиров " + passenger + ", то есть " + (seat - passenger) + " сидячих мест и 42 стоячих места");
        }if (passenger >= 60 && passenger <=102) {
            System.out.println("Если пассажиров " + passenger + ", то есть " + (capacity - passenger) + " стоячих мест");
        }if (passenger > 102) {
            System.out.println("Если пассажиров " + passenger + ", то вагон полностью забит");
            }
        System.out.println();
        System.out.println("Задача 7");
        int one = 7;
        int two = 8;
        int three = 10;
        if (one > two && one > three) {
            System.out.println("Самое большое число " + one);
        }if (two > one && two > three) {
            System.out.println("Самое большое число " + two);
        }if (three > one && three > two) {
            System.out.println("Самое большое число " + three);
        }

    }
}
