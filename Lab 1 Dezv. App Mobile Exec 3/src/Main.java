public class Main {
    public static void main(String[] args) {

        System.out.println("Numere prime mai mici de 100");
        findTwinPrimes(100);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void findTwinPrimes(int limit) {
        for (int i=2; i< limit; i++) {
            if (isPrime(i) && isPrime(i+2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
}