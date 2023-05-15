import java.util.Random;

public class empattendance {
    public static void main(String[] args) {
        int IS_FULL_TIME =1;
        double empcheck = Math.floor(Math.random() *10 %2);
        if (empcheck == IS_FULL_TIME)
            System.out.println( "Employee is Present");
        else
            System.out.println("Employee is Abscent");
        }
    }

    class AttendanceCheck {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isPresent = random.nextBoolean();
        //boolean value this method returns either truss or false with a 50% change of each value

        if (isPresent) {
            System.out.println("Employee is present.");
        } else {
            System.out.println("Employee is absent.");
        }
    }
}
