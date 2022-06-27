package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
       public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive > 3) {
            System.out.println(2);
            int i = 3;
            while (i <= printToInclusive) {
            boolean check = true;
                int j = 2;
                while (j < i) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                    j++;
                }

                if (check) {
                    System.out.println(i);
                }
                i++;
            }
        } else if (printToInclusive == 2){
            System.out.println(2);
        }
    }
}
