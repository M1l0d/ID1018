package OU3;

public class Main {

    public static void main(String[] args) {
        // Avstånden från Zon 1 till Zon 2 lagras i "a"
        double[] a =    {14,26,16};

        // Avstånden från Zon 2 till Zon 3 lagras i "a"
        double[][] b = {{21,11,12,32},
                        {12,22,23,21},
                        {12,15,23,19}};

        // Avstånden från Zon 3 till Zon 4 lagras i "a"
        double[] c =    {12,17,21,25};

        System.out.println(("Vägen " + BestamKortasteVagen.bestamVilkenVag(a,b,c)) + " är kortast och har längden " +
                (BestamKortasteVagen.bestamKortasteStrackan(a,b,c)) + " längdenheter.");
    }
}
