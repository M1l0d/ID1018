package EU4;

import java.util.Objects;

public class Polylinjer {
    public static Polylinje kortasteGul(Polylinje[] pLinjer) {
        Polylinje kortastPol = pLinjer[0];
        double kortastLangd = Double.MAX_VALUE;
        for (int i = 0; i < pLinjer.length; i++)
            if (pLinjer[i].getFarg().equals("gul") && pLinjer[i].langd() < kortastLangd)
            {
                pLinjer[i] = kortastPol;
                kortastLangd = kortastPol.langd();
                System.out.println("hej");
            }

        else
            return null;

        return kortastPol;
    }
}
