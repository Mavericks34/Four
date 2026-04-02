//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int age = 16;
        if (age >= 18) {
            System.out.println("Ты можешь водить");
        } else {
            System.out.println("Ты не можешь водить");

            int age1 = 19;
            boolean canNotGoToSchool = age1 < 7 || age1 > 18;
            if (age1 >=18 && age1 < 21) {
                System.out.println("Ты достаточно взрослый , чтобы водить , но недостаточно , чтобы пить алкоголь");
            }
            if (canNotGoToSchool) {
                System.out.println("Я думаю ты не ходишь в школу!!");
            }
            boolean skyIsClear = true;
            if (skyIsClear) {System.out.println("Небо чистое");}
        }



        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}