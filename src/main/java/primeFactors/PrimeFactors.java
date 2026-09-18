package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public List<Integer> factor(int number) {
        List<Integer> factors = new ArrayList<>();

        // early return(예외처리)
        if (number < 2) {
            return factors;
        }

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }

        return factors;
    }

    // Optimized Algorithm of Prime Factorization
    public List<Integer> optimizedFactor(int n) {
        List<Integer> factors = new ArrayList<>();

        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        if (n > 2) {
            factors.add(n);
        }

        return factors;
    }
}
