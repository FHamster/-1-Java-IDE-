import java.util.Scanner;

//6. 求π的近似值
public class CountPi
{
    //嗯算个Pi，类名打出来没忍住就笑了
    public static void main(String[] argc)
    {
        double x = 0;
        double y = 0;
        int n = new Scanner(System.in).nextInt();
        int pointInRound = 0;
//        System.out.println(Math.pow(2, 10));
        for (int i = 0; i < n; i++)
        {
            x = Math.random();
            y = Math.random();
            if (Math.pow(x - 0.5, 2) + Math.pow(y - 0.5, 2) < 0.25)
            {
                pointInRound++;
            }
        }
        System.out.println((pointInRound / (double)n) / 0.25);

    }
}
