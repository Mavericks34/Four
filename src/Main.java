//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Задание 1");
        byte age = 18;
        if (age >= 18) {
            System.out.println("Если возраст " + age + " и больше, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека " + age + " то он не достиг совершеннолетия, нужно немного подождать.");
        }
        System.out.println("Задание 2");
        byte temperature = 8;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов,нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
        System.out.println("Задание 3");
        short speed = 60;
        if (speed >= 59) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно.");
        }
        System.out.println("Задание 4");
        byte agePeople = 29;
        byte ageTeenager = 14;
        byte ageStudent = 19;
        byte ageAdult = 29;
        if (agePeople >= 2 && agePeople <= 6) {
            System.out.println("Если возраст человека равен " + agePeople + " , то ему нужно ходить в детский сад.");
        } else if (agePeople < 2 ) {
            System.out.println("Если возраст человека равен " + agePeople + " , то ему ещё рано куда то ходить , он должен спать в кроватке.");
        } else if (agePeople > 6 && agePeople <= 17) {
            System.out.println("Если человеку " + agePeople + " , то он должен ходить в школу.");
        } else if (agePeople >= 18 && agePeople <=24) {
            System.out.println("Если человеку " + agePeople + " , то он должен ходить в институт.");
        } else  if (agePeople >= 24) {
            System.out.println("Если человеку " + agePeople + " , то он должен работать как папа Карло.");
        }
    }
}










