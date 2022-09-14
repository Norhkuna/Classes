import java.sql.SQLOutput;

public class Homework1
{

    public static void main(String[] args)
    {

        double alpha = 0;

        for (int i = 0; i < 10; i++)
        {
            alpha = i * (Math.PI/5);

            System.out.print(alpha + ", ");

            System.out.print(Math.sin(alpha) + ", ");

            System.out.print(Math.cos(alpha) + ", ");

            System.out.println(" ");

        }

    }
}