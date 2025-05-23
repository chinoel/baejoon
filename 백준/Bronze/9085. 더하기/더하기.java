import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int S = Integer.parseInt(br.readLine());
            int a = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < S; j++) {
                a += Integer.parseInt(st.nextToken());
            }
            System.out.println(a);
        }
    }
}