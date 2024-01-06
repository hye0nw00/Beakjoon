package BeakJun;

import java.io.*;
import java.util.StringTokenizer;

public class main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int result = 0;

        for(int i =0; i<N; i++){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            result += a*b;
        }
        if(X == result){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


    }
}
