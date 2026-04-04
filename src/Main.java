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
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф.");
        } else if (speed <= 60) {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно.");
        }
        System.out.println("Задание 4");
        byte agePeople = 2;
        byte ageTeenager = 14;
        byte ageStudent = 19;
        byte ageAdult = 29;
        if (agePeople >= 2 && agePeople <= 6) {
            System.out.println("Если возраст человека равен " + agePeople + " , то ему нужно ходить в детский сад.");
        } else if (agePeople < 2) {
            System.out.println("Если возраст человека равен " + agePeople + " , то ему ещё рано куда то ходить , он должен спать в кроватке.");
        } else if (agePeople > 6 && agePeople <= 17) {
            System.out.println("Если человеку " + agePeople + " , то он должен ходить в школу.");
        } else if (agePeople >= 18 && agePeople <= 24) {
            System.out.println("Если человеку " + agePeople + " , то он должен ходить в институт.");
        } else if (agePeople >= 24) {
            System.out.println("Если человеку " + agePeople + " , то он должен работать как папа Карло.");
        }
        System.out.println("Если возраст " + agePeople + " , то ему нужно ходить в детский сад.");
        System.out.println("Если возраст " + ageTeenager + " , то он должен ходить в школу.");
        System.out.println("Если возраст " + ageStudent + " , то он должен ходить в институт.");
        System.out.println("Если возраст " + ageAdult + " , то он должен работать.");

        System.out.println("Задание 5");
        byte ageChild = 14;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка " + ageChild + " ,то ему нельзя кататься на атракционе.");
        } else if (ageChild >= 5 && ageChild <= 14) {
            System.out.println("Если ребенку " + ageChild + " , то ему можно кататься на аттракционе в сопровождении.");
        } else if (ageChild > 14 && ageChild < 18) {
            System.out.println("Если ребенку " + ageChild + ", то ему можно кататься без взрослого.");
        } else if (ageChild >= 18) {
            System.out.println("Если человеку " + ageChild + " лет , то он уже взрослый и самостоятельный.");
        }

        System.out.println("Задание 6");
        byte peopleInACarriage = 110;
        byte capacityOfOneTrainCar = 102;
        byte seats = 60;
        if (peopleInACarriage <= seats) {
            System.out.println("Если в вагоне " + peopleInACarriage + " человек ,то сидячих мест " + (seats - peopleInACarriage) + " при условии, если все сидячие места заняты.");
        } else if (peopleInACarriage > seats && peopleInACarriage <= capacityOfOneTrainCar) {
            System.out.println("Если в вагоне " + peopleInACarriage + " человек , то стоячих мест " + (capacityOfOneTrainCar - peopleInACarriage) + " при условии если все сидячии заняты.");
        } else if (peopleInACarriage > capacityOfOneTrainCar) {
            System.out.println("В вагон не поместиться " + (peopleInACarriage - capacityOfOneTrainCar) + " человек.");
        }

        System.out.println("Задание 7");
        int one = 16752484;
        int two = 12456354;
        int three = 14578135;
        if (three > two && three > one) {
            System.out.println("Оно самое большое " + three);
        }  else if (two > three && two > one) {
            System.out.println("Оно самое большое " + two);
        } else if (one > two && one > three) {
            System.out.println("Оно самое большое " + one);
        }
    }
}













