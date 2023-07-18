import java.util.Arrays;

public class FourierTransformer {

    public static double[] fft(double[] signal) {
        int n = signal.length;

        // Check if n is a power of 2
        if (n != (1 << (int) Math.floor(Math.log(n) / Math.log(2)))) {
            throw new IllegalArgumentException("n must be a power of 2");
        }

        // Compute the DFT of signal
        double[] fft = new double[n];
        for (int i = 0; i < n; i++) {
            fft[i] = signal[i];
        }

        for (int k = 1; k < n; k *= 2) {
            for (int i = 0; i < n; i += 2 * k) {
                for (int j = 0; j < k; j++) {
                    double c = Math.cos(2 * Math.PI * j / k);
                    double s = Math.sin(2 * Math.PI * j / k);

                    double t = fft[i + j];
                    fft[i + j] = fft[i + j] * c - fft[i + j + k] * s;
                    fft[i + j + k] = t * s + fft[i + j + k] * c;
                }
            }
        }

        return fft;
    }
}