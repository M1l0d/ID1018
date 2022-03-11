package EU4;

public class PolylinjeTest {

    public static void main(String[] args)
    {
        Polylinje polylinje = null;
        polylinje = new VPolylinje();
        //polylinje = new NPolylinje();

        polylinje.laggTill(new Punkt("A",2,3));
        polylinje.laggTill(new Punkt("B",5,1));
        polylinje.laggTill(new Punkt("C",7,4));
        polylinje.laggTill(new Punkt("D",1,8));

        System.out.println(polylinje);

        polylinje.taBort("D");
        polylinje.laggTillFramfor(new Punkt("X",7,7),"A");

        polylinje.setFarg("gul");

        System.out.println(polylinje);

        for (Punkt horn : polylinje)
            System.out.println(horn);

        System.out.println(Polylinjer.kortasteGul(new Polylinje[] {polylinje}));
    }
}
