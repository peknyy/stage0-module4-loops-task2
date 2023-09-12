package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        for (int i = 0; i <= printToInclusive; i++) {
            int result = 1;
            for (int j = 1; j <= i; j++) {
                result *= j;

            }
            System.out.println(result);
        }
    }
}
