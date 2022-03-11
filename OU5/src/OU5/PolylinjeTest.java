package OU5;

public class PolylinjeTest {

    public static void main(String[] args)
    {
        // Några punkter
        Punkt p1 = new Punkt("A", 3, 4);
        Punkt p2 = new Punkt("B", 5 ,5);
        Punkt p3 = new Punkt("C", 2, 9);
        Punkt p4 = new Punkt("D", 6 ,3);
        System.out.println(p1 + "\n" + p2 + "\n" + p3 + "\n" + p4 + "\n");

        // En array och polylinje av punkter
        Punkt[] punkter = {p1, p2, p3, p4};
        Polylinje testPoly = new Polylinje(punkter);

        // testar getHorn
        for (Punkt p : testPoly.getHorn())
            System.out.println(p +" ");

        System.out.println();

        // testar getFarg
        System.out.println("Farg: " + testPoly.getFarg());

        // testar getBredd
        System.out.println("Bredd: " + testPoly.getBredd());

        // testar setFarg
        testPoly.setFarg("Röd");
        System.out.println("Ny Färg: " + testPoly.getFarg());

        // testar setBredd
        testPoly.setBredd(3);
        System.out.println("Ny Bredd: " + testPoly.getBredd());

        // testar langd
        System.out.println("Polylinjens längd: " + testPoly.langd());

        // testar laggTill
        System.out.println();

        Punkt pNy = new Punkt("X", 8, 9);
        testPoly.laggTill(pNy);

        System.out.println(testPoly);

        // testar laggTillFramfor
        System.out.println();

        Punkt pFore = new Punkt("Z", 0, 2);
        testPoly.laggTillFramfor(pFore, "B");

        System.out.println(testPoly);

        // testar taBort
        System.out.println();

        testPoly.taBort("X");

        System.out.println(testPoly);

        // Polylinje Iterator
        System.out.println();

        Polylinje.PolylinjeIterator it = testPoly.new PolylinjeIterator();
        while (it.finnsHorn())
        {
            System.out.println(it.horn());
            it.gaFram();
        }
    }
}