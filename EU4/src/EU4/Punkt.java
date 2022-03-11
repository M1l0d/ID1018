package EU4;

class Punkt {
    private int x;
    private int y;
    private String namn;

    Punkt(String namn, int x, int y)
    {
        this.x = x;
        this.y = y;
        this.namn = namn;
    }

    Punkt(Punkt p)
    {
        this.x = p.x;
        this.y = p.y;
        this.namn = p.namn;
    }

    // get
    public String getNamn()
    {
        return this.namn;
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    // set
    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    // toString
    public String toString()
    {
        return       "(" + this.namn + ": " + this.x + "," + this.y + ")";
    }

    // avstånd
    double avstand()
    {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    double avstand(Punkt p2)
    {
        return Math.sqrt((p2.x - this.x) * (p2.x - this.x)
                + (p2.y - this.y) * (p2.y - this.y));
    }
}
