package bulaklak_week_intermediate;

public class BULAKLAK_WEEK_INTERMEDIATE {
    public static void main(String[] args) {
        double flowerAverage = 85;
        int flowerAbsences = 2;

        boolean flowerpassed = (flowerAverage >= 75 && flowerAbsences <= 3) || flowerAverage > 90;

        if (flowerpassed) {
            System.out.println("PASS");
            System.out.println("Reason: Average is at least 75 and absences are 3 or less");
        } else {
            System.out.println("FAIL");
            System.out.println("Reason: Student did not meet the required conditions");
        }
    }
    
}
