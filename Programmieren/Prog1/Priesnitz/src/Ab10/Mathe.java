package Ab10;

public class Mathe {
    public static double pi1(int n){
        if (n < 0) {
            throw new IllegalArgumentException("ungueltig n : " + n);
        }
        double pi = 0;

        for (int k = 0; k <= n; k++) {
            double term = 1 / (2. * k + 1);
            pi += (k & 1) == 0 ? term : -term;
        }
        return 4 * pi;
    }

    public static double pi2() {
        return pi2(1E-8);
    }

    public static double pi2(double eps) {
        if (eps <= 0 || eps >= 1) {
            throw new IllegalArgumentException("ungueltig eps : " + eps);
        }
        double pi = 0;
        int k = 0;
        double term = 1;
        while (term >= eps) {
            pi += (k & 1) == 0 ? term : -term;
            term = 1 / (2. * ++k + 1);
        }
        return 4 * pi;
    }


    public static double pi3() {
        return pi3(1E-8);
    }

    public static double pi3(double eps) {
        if (eps <= 0) {
            throw new IllegalArgumentException("ungueltig eps : " + eps);
        }
        double pi = 0;
        int k = 0;
        double term = 1;
        while (Math.abs(4 * pi - Math.PI) >= eps) {
            pi += (k & 1) == 0 ? term : -term;
            term = 1 / (2. * ++k + 1);
        }

        return 4 * pi;
    }
}

