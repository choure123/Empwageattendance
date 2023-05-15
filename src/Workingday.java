public class Workingday { public static void main(String[] args) {
    int wagePerHour = 20;
    int fullDayHour = 8;
    int partTimeHour = 4;
    int workingDaysPerMonth = 20;
    int totalWorkingHours = 100;
    int currentWorkingHours = 0;
    int currentWorkingDays = 0;
    int totalWage = 0;

    while (currentWorkingHours < totalWorkingHours && currentWorkingDays < workingDaysPerMonth) {
        if (currentWorkingHours + fullDayHour <= totalWorkingHours) {
            currentWorkingHours += fullDayHour;
            totalWage += fullDayHour * wagePerHour;
        } else {
            int remainingHours = totalWorkingHours - currentWorkingHours;
            currentWorkingHours += remainingHours;
            totalWage += remainingHours * wagePerHour;
        }

        currentWorkingDays++;
    }

    System.out.println("Total wage for the month is: " + totalWage);
}
}

