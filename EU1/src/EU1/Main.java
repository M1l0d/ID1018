package EU1;

import org.omg.CORBA.IMP_LIMIT;
import sun.nio.cs.ext.ISCII91;

import java.security.spec.DSAGenParameterSpec;

public class Main {

    public static void main(String[] args) {
        int[] s = {2,3,6,4,5,7,6,8,10,9,11,1,22,62,42,22,0,4,3};
        System.out.println(s.length);

        System.out.println(min(s));

    }

    // min returnerar det minsta elementet i en sekventiell samling.
    // Om samlingen är tom, kastas ett undantag av typen IllegalArgumentException.

    public static int min(int[] element) throws IllegalArgumentException {
    if (element.length == 0)
        throw new IllegalArgumentException("Samlingen är tom!");

    // hör ihop med spårutskriften 2:
    // int antalVarv = 1;

    int[] sekvens = element;
    int antaletPar = sekvens.length / 2;
    int antaletOparadeElement = sekvens.length % 2;
    int antaletTankbaraElement = antaletPar + antaletOparadeElement;
    int[] delsekvens = new int[antaletTankbaraElement];

    int i;
    int j;

    while (antaletPar > 0) { // FEL
        // Skilj ur en delsekvens med de tänkbara elementen
        i = 0;
        j = 0;
        while (j < antaletPar) {
            delsekvens[j++] = (sekvens[i] < sekvens[i + 1]) ? sekvens[i] : sekvens[i + 1];
            i = i + 2;
        }
        if (antaletOparadeElement == 1)
            delsekvens[j] = sekvens[i]; // FEL

        // Utgå nu ifrån delsekvensen
        sekvens = delsekvens;
        antaletPar = antaletTankbaraElement / 2;
        antaletOparadeElement = antaletTankbaraElement % 2;
        antaletTankbaraElement = antaletPar + antaletOparadeElement;
        //delsekvens = new int [antaletTankbaraElement]; // FELET

        // spårutskrift 1 - för att följa sekvensen
        //System.out.println(java.util.Arrays.toString(sekvens));

        // spårutskrift 2 - för att följa sekvensen
        // (för att kunna se vad som händer i början)
        //if (antalVarv++ == 10)
        //    System.exit(0);
    }

        // sekvens[0] är det enda återstående tänkbara elementet
        // - det är det minsta elementet
        return sekvens[0];
    }
}
