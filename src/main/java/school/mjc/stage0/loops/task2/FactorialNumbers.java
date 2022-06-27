package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        if (printToInclusive == 0) {
            System.out.println(1);
            return;
        }
        int i = 1;
        int j = 1;

        while (i <= printToInclusive + 1) {
            System.out.println(j);
            j *= i;
            i++;
        }
    }
}
