public class Monthlywage {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullDayHour = 8;
        int workingDaysPerMonth = 20;
        int monthlyWage;
        int partTimeHour = 4;

        int dailyWage = wagePerHour * fullDayHour;

        monthlyWage = dailyWage * workingDaysPerMonth;
        dailyWage = wagePerHour * partTimeHour;
        monthlyWage = dailyWage * workingDaysPerMonth;
        System.out.println("Monthly wage of the full-time employee is: " + monthlyWage);
        System.out.println("Monthly wage of the part-time employee is: " + monthlyWage);
    }
}

