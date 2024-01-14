package bronze2;

import java.io.*;
import java.util.*;

public class Division {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // ó���� n�� ���ڸ� �ΰ��� 00���� ������ش�
        n /= 100;
        n *= 100;
        int f = Integer.parseInt(br.readLine());
        int ans = 0;
        //n�� f�� ���������� ������ ��� �����ش�
        while (n % f != 0) {
            n++;
            ans++;
        }
        if (ans < 10) {
            System.out.print("0" + ans);
        } else {
            System.out.print(ans);
        }
    }
}