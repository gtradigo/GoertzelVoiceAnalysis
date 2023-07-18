import java.util.Arrays;

public class GoertzelAlgorithm {

    public static double goertzel(double[] signal, double frequency) {
        int n = signal.length;
        double r = 0.0;
        double c = 0.0;
        double w = Math.cos(2 * Math.PI * frequency / n);
        double w_squared = w * w;

        for (int i = 0; i < n; i++) {
            r += signal[i] * (c + w * (r - c));
            c += w_squared * (r - c);
        }

        return r;
    }
}