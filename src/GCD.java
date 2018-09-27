import sun.applet.Main;

import java.util.Scanner;

//5. 最大公约数
public class GCD
{
    public static void main(String[] argc)
    {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("最大公约数" + gcd1(a, b));
    }
    public static int gcd1(int a, int b)//循环实现
    {
        int k = 0;
        do
        {
            k = a % b;
            a = b;
            b = k;
        } while (k != 0);
        return a;
    }

    public static int gcd2(int a, int b)// 逆归实现
    {
        if (b == 0)
        {
            return a;
        }
        if (a < 0)
        {
            return gcd2(-a, b);
        }
        if (b < 0)
        {
            return gcd2(a, -b);
        }
        return gcd2(b, a % b);
    }
}
