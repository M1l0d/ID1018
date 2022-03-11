package EU4;

import java.util.Arrays;
import java.util.Iterator;

public class NPolylinje implements Polylinje {

    private static class Nod
    {
        public Punkt horn;
        public Nod nastaNod;

        public Nod(Punkt horn)
        {
            this.horn = horn;
            nastaNod = null;
        }
    }

    private Nod horn;
    private String farg = "svart";
    private int bredd = 1; //pixlar

    public NPolylinje()
    {
        this.horn = null;
    }

    public NPolylinje(Punkt[] horn)
    {
        if(horn.length > 0)
        {
            Nod nod = new Nod(new Punkt(horn[0]));
            this.horn = nod;
            int pos = 1;
            while(pos < horn.length)
            {
                nod.nastaNod = new Nod(new Punkt(horn[pos++]));
                nod = nod.nastaNod;
            }
        }
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        if (horn != null)
        {
            sb.append("[");
            Nod n = horn;

            while (n != null)
            {
                sb.append(n.horn);
                n = n.nastaNod;
            }

        sb.append("]");

        }
        sb.append(farg).append(",").append(bredd).append("}");
        /*sb.append(",");
        sb.append(bredd);
        sb.append("}");*/

        return sb.toString();
    }

    public Punkt[] getHorn() {
        int punkter = 0;
        Nod n = horn;

        while (n != null) {
            punkter++;
            n = n.nastaNod;
        }

        Punkt[] p = new Punkt[punkter];
        n = horn;
        for (int i = 0; i < punkter; i++)
        {
            p[i] = n.horn;
            n = n.nastaNod;
        }

        return p;
    }

    public String getFarg()
    {
        return farg;
    }

    public int getBredd()
    {
        return bredd;
    }

    public void setFarg(String farg)
    {
        this.farg = farg;
    }

    public void setBredd(int bredd)
    {
        this.bredd = bredd;
    }

    public double langd()
    {
        int punkter = 0;
        Nod n = horn;

        while(n != null)
        {
            punkter++;
            n = n.nastaNod;
        }

        return punkter;
    }

    public void laggTill(Punkt Nodhorn)
    {
        if (horn == null)
            horn = new Nod(Nodhorn);

        else
        {
            Nod n = horn;
            while(n.nastaNod != null)
            {
                n = n.nastaNod;
            }

            n.nastaNod = new Nod(Nodhorn);
        }
    }

    public void laggTillFramfor(Punkt Nodhorn, String hornNamn)
    {
        Nod n = horn;
        while(n != null)
        {
            if (n.nastaNod.horn.getNamn().equals(hornNamn))
            {
                Nod x = n.nastaNod;
                n.nastaNod = new Nod(Nodhorn);
                n.nastaNod.nastaNod = x;
                //break;
            }

            n = n.nastaNod;
        }
    }

    public void taBort(String hornNamn)
    {
        Nod n = horn;
        while(n != null)
        {
            if (n.nastaNod.horn.getNamn().equals(hornNamn))
            {
                n.nastaNod = n.nastaNod.nastaNod;
                //break;
            }

            n = n.nastaNod;
        }
    }

    public Iterator<Punkt> iterator()
    {
        return Arrays.asList(this.getHorn()).iterator();
    }
}
