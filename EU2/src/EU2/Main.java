package EU2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] v = {4,5,1,7,3};
	BubbleSort(v);

	//int antaljamforelser = v.length - 1;

	System.out.println();
	//System.out.println("Antal jämförelser: " + antaljamforelser);
    }

    public static void BubbleSort(int [] v){
        int t;
        int i = 0;
        int byten = 0;

        while (i < v.length)
        {
            int j = i + 1;

            while (j < v.length )
            {
                if (v[j] < v[i]) {
                    t = v[i];
                    v[i] = v[j];
                    v[j] = t;
                    byten++;
                }

                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(v));
    }
}

