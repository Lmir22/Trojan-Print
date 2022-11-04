
import java.util.*;

public class SlotG
{
    public static void  main(String args[]) {
        Random gRandom = new Random();
        Scanner machine = new Scanner(System.in);

        int insert, coins = 100, xslotONE, xslotTWO, xslotTHREE;

        do {
            System.out.println("Trojan City");
            System.out.println("Coins");
            System.out.println("Press x to pull lever or b to exit game");

            insert = machine.nextInt();

            xslotONE = gRandom.nextInt(3) + 1;
            xslotTWO = gRandom.nextInt(3) + 1;
            xslotTHREE = gRandom.nextInt(3) + 1;

            System.out.println(xslotONE + "  " + xslotTWO + "  " + xslotTHREE);

            if (xslotONE == xslotTWO && xslotONE == xslotTHREE) ;
            System.out.println("Congratulations!!! You just won 30 coins!!!");
            coins += 30;
        }

        while (xslotONE == xslotTWO || xslotONE == xslotTHREE || xslotTWO == xslotTHREE); {
            System.out.println("Congratulations!!! You just won 15 coins!!!");
            coins += 15;
        }
        else
        {
            System.out.println("Sorry!!! You just lost 5 coins!!!");
            coins -= 5;
        }
            if (insert == 1) ;
        }
    }

