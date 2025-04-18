import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            bw.write(result(Integer.parseInt(br.readLine()), 0) + "\n");
        }
        bw.flush();
    }

    public static int result(int n, int pos) {
        int value = 0;
        if (pos == n) return 1;
        else if (pos < n) {
            value += result(n, pos + 1);
            value += result(n, pos + 2);
            value += result(n, pos + 3);
        }
        return value;
    }
}
