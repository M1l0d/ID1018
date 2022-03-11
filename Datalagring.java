//DATALAGRING
class Datalagring
{
	public static void main (String[] args)
	{
			int n = 15;
	  final int m = 25;
	        int s = m + n;

	//final int går inte att ändra på senare i programmet


			System.out.print("n = " + n);
			System.out.println(" , m = " + m);
			System.out.println("Summan av n och m är: " + s);

	//Lagra decimaler
			float f = 1.5F;
			double d = 2.5D;
			System.out.println("f är lika med: "+ f);
			System.out.println("d är lika med: "+ d);


	//Lagra hexadecimala tecken
			char c1 = 'A';
			char c2 = 'B';
			char c3 = '?';
			char c4 = '!';

			System.out.println(c1*c1);


			//Lagra booleska variabler
			boolean b1 = true;
			boolean b2 = false;

			System.out.println(b1);

	}
}