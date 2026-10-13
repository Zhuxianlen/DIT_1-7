package bulaklak_week2_advance;

public class BULAKLAK_WEEK2_ADVANCE {
    public static void main(String[] args) {
        
        // Simula ng flowerbalance
        double flowerbalance = 1000;

        // Dagdag ng 200 sa flowerbalance
        flowerbalance += 200;
        System.out.println("After adding 200: " + flowerbalance);

        // Imultiply ang flowerbalance sa 2
        flowerbalance *= 2;
        System.out.println("After multiplying by 2: " + flowerbalance);

        // Dagdag ulit ng 500 sa flowerbalance
        flowerbalance += 500;
        System.out.println("After adding 500: " + flowerbalance);

        // Postfix increment
        int count = 5;

        // Ipi-print muna bago madagdagan ng 1
        System.out.println(count++);
        System.out.println(count);

        // Prefix increment
        count = 5;

        // Madadagdagan muna ng 1 bago i-print
        System.out.println(++count);
        System.out.println(count);

        // Sa count++, print muna bago magdagdag ng 1.
        // Sa ++count, dagdag muna ng 1 bago magprint.
    }
    
}
