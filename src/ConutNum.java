import java.util.Scanner;
import java.util.Stack;

//4. 取数字
public class ConutNum
{

    public static void main(String[] argc)
    {
        System.out.println("对传递进来的任意位数的10进制整数，可以将其转换为2进制、8进制、10进制、16进制，");
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();

        char[] binArr = Integer.toBinaryString(n).toCharArray();
        char[] octArr = Integer.toOctalString(n).toCharArray();
        char[] hexArr = Integer.toHexString(n).toCharArray();
        System.out.println("Binary:" + myToString(binArr));
        System.out.println("Octal:" + myToString(octArr));
        System.out.println("Hex:" + myToString(hexArr));
        printDigit(getDigits(n));

    }

    public static void printDigit(int[] n)
    {
        System.out.println("The digits of n are " + myToString(n));
    }

    public static String myToString(char[] a)
    {
        if (a == null)
        {
            return "null";
        }
        int iMax = a.length - 1;
        if (iMax == -1)
        {
            return "[]";
        }

        StringBuilder b = new StringBuilder();
        for (int i = 0; true; i++)
        {
            b.append(a[i]);
            if (i == iMax)
            {
                return b.toString();
            }
            b.append(",");
        }
    }

    public static String myToString(int[] a)//转换int[]为题目要求格式字符串
    {
        if (a == null)
        {
            return "null";
        }
        int iMax = a.length - 1;
        if (iMax == -1)
        {
            return "[]";
        }

        StringBuilder b = new StringBuilder();
        for (int i = 0; true; i++)
        {
            b.append(a[i]);
            if (i == iMax)
            {
                return b.toString();
            }
            b.append(",");
        }
    }

    public static int[] getDigits(int n)//int类型任意位数分解
    {
        Stack<Integer> numStack = new Stack<Integer>();
        while (n > 0)
        {
            numStack.add(n % 10);
            n /= 10;
        }

        int[] numArr = new int[numStack.size()];
        for (int i = 0; !numStack.isEmpty(); i++)
        {
            numArr[i] = numStack.pop();
        }
        return numArr;
    }
}
