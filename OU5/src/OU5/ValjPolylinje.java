package OU5;

import java.util.Random;

class ValjPolylinje {
    public static final Random rand = new Random();
    public static final int ANTAL_POLYLINJER = 10;

    public static void main(String[] args)
    {
        // skapa ett antal slumpmässiga polylinjer
        Polylinje[] polylinjer = new Polylinje[ANTAL_POLYLINJER];
        for (int i = 0 ; i < ANTAL_POLYLINJER ; i++)
            polylinjer[i] = slumpPolylinje();

        // visa polylinjerna
        for (Polylinje visaPol : polylinjer)
            System.out.println(visaPol + "\n");

        // bestäm den kortaste av de polylinjer som är gula
        double kortast = Double.MAX_VALUE;
        Polylinje gul = new Polylinje();
        for (Polylinje pol : polylinjer)
            if (pol.getFarg().equals("gul") && (pol.langd() < kortast))
            {
                gul = pol;
                kortast = pol.langd();
            }

        // visa den valda polylinjen
        System.out.println("Den kortaste polylinjen är: " + gul);
    }

    /* slumpPunkt returnerar en pinkt med ett slumpmässigt namn,
    som är en stor bokstav i det engelska alfabetet, samt slumpmässiga koordinater */
    public static Punkt slumpPunkt()
    {
        String n = "" + (char) (65 + rand.nextInt(26));
        int x = rand.nextInt(11);
        int y = rand.nextInt(11);

        return new Punkt(n,x,y);
    }

    /* slumpPolylinje returnerar en slumpmässig polylinje,
    vars färg är antingen blå, röd eller gul. Namn på polylinjens hörn är stora
    bokstäver i det engelska alfabetet. Två hörn kan inte ha samm namn */
    public static Polylinje slumpPolylinje()
    {
        // skapa en tom polylinje och lägg till hörn till den
        Polylinje polylinje = new Polylinje();
        int antalHorn = 2 + rand.nextInt(7);
        int antalValdahorn = 0;
        boolean[] valdaNamn = new boolean[26];

        // ett och samma namn kan inte förekomma flera gånger
        Punkt valdPunkt = null;
        char valtChar = 0;

        while (antalValdahorn < antalHorn)
        {
            valdPunkt = slumpPunkt();
            int varde = valdPunkt.getNamn().charAt(0) - 65;

            if (!valdaNamn[varde])
                valdaNamn[varde] = true;

            polylinje.laggTill(valdPunkt);
            antalValdahorn++;
        }

        // sätt färg
        polylinje.setFarg(randomFarg());
        return polylinje;
    }

    public static String randomFarg()
    {
        int slumpFarg = rand.nextInt(3);
        String randomFarg = "";
        if (slumpFarg == 0)
            randomFarg = "blå";

        if (slumpFarg == 1)
            randomFarg = "gul";

        if (slumpFarg == 2)
            randomFarg = "röd";

        return randomFarg;
    }
}