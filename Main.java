public class Main {

    public static void main(String[] args) {
        long initialAmount = 100L;
        long deposit = 1100L;
        long bonus = 0L;
        if (deposit >= 1000L) {
            bonus = deposit / 100L;
        }

        long total = initialAmount + deposit + bonus;
        System.out.println(total);
    }
}