package bulaklak_week2_expert;

public class BULAKLAK_WEEK2_EXPERT {
    public static void main(String[] args) {
        // PREDICTED result: 14
        int floweranswer = 2 + 3 * 4;
        System.out.println("Answer 1: " + floweranswer);

        // Multiplication muna bago addition kaya 14 yung sagot

        // PREDICTED result: false
        int flowerX = 5;
        int flowery = 3;

        boolean answer2 = flowerX - flowery > 5 || flowery == 3;
        System.out.println("Answer 2: " + answer2);

        // Mali ang prediction na false dahil true ang y == 3.
        // Ang || ay true kapag kahit isa sa conditions ay true

        // PREDICTED result: 6
        int fcount = 5;
        int floweranswer3 = ++fcount + 1;
        System.out.println("Answer 3: " + floweranswer3);

        // Nadagdagan muna ng 1 ang count bago ginamit
        System.out.println("Count: " + fcount);
    }
    
}
