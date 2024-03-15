package baitap.manageemployee.business.config;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InputMethod
{
    private InputMethod()
    {
    }

    ;
    public static final Scanner scanner = new Scanner(System.in);

    public static final String nextLine()
    {
        return scanner.nextLine();
    }

    public static final int nextInt()
    {
        return Integer.parseInt(scanner.nextLine());
    }

    public static final double nextDouble()
    {
        return Double.parseDouble(scanner.nextLine());
    }

    public static final Date nextDate()
    {
        while (true)
        {
            try
            {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.parse(nextLine());
            } catch (ParseException errException)
            {
                System.err.println("Vui lòng nhập đúng định dạng");
            }
        }
    }
}
