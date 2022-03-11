package OU5;

import java.util.Arrays;

public class Polylinje1 {
    private Punkt[] horn;
    private String farg = "svart";
    private int bredd = 1;


    public Polylinje1() {
        this.horn = new Punkt[0];
    }

    public Polylinje1(Punkt[] horn)
    {
        this.horn = new Punkt[horn.length];
        for (int i = 0 ; i < horn.length ; i++)
            this.horn[i] = new Punkt (horn[i]);
    }

    public String toString()
    {
        return "{" + Arrays.toString(this.horn) + ", " + this.farg + ", " + this.bredd + "}";
    }

    public Punkt[] getHorn()
    {
        Punkt[] getHorn = new Punkt[this.horn.length];
        for (int i = 0 ; i < this.horn.length ; i ++)
            getHorn[i] = new Punkt(this.horn[i]);

        return getHorn;
    }

    public String getFarg()
    {
        return this.farg;
    }

    public int getBredd()
    {
        return this.bredd;
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
        double langd = 0;
        for (int i = 0 ; i < this.horn.length - 1 ; i++)
            langd = langd + this.horn[i].avstand(this.horn[i + 1]);

        return langd;
    }
    public void laggTill(Punkt horn)
    {
        Punkt[] h = new Punkt[this.horn.length + 1];
        int i = 0;
        for (i = 0 ; i < this.horn.length ; i++)
            h[i] = this.horn[i];
        h[i] = new Punkt(horn);

        this.horn = h;
    }
    public void laggTillFramfor(Punkt horn, String hornNamn)
    {
        Punkt[] h = new Punkt[this.horn.length + 1];

        int i, j = 0;
        for (i = 0 ; i < this.horn.length ; i++)
        {
            if (this.horn[i].getNamn().equals(hornNamn))
            {
                h[j] = horn;
                j++;
            }
            h[j] = this.horn[i];
            j++;
        }
        this.horn = h;
    }

    public void taBort(String hornNamn)
    {
        Punkt[] h = new Punkt[this.horn.length - 1];

        int j = 0;
        for (int i = 0 ; i < this.horn.length ; i++)
        {
            if (this.horn[i].equals(hornNamn))
            {
                j = i;
                break;
            }
        }

        for (int k = 0 ; k < j ; k++)
        {
            h[k] = this.horn[k];
        }
        for (int k = 0 ; k < h.length ; k++)
        {
            h[k] = this.horn[k + 1];
        }

        this.horn = h;
    }
}