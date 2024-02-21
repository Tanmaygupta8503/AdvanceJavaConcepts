import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakingInputViaBufferReader {
    public static void main(String[] args) throws IOException{
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        float f = Float.parseFloat(br.readLine());
        double d = Double.parseDouble(br.readLine());
        System.out.println("Integer: " + n);
        System.out.println("String: " + s);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        br.close();
    }
}
