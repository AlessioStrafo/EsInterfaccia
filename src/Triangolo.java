public class Triangolo implements  Forma{
    private double altezza;
    private double base;
    public Triangolo(double base, double altezza){
        this.altezza=altezza;
        this.base=base;
    }
    @Override
    public double calcolaArea() {
        return (base * altezza)/2;
    }

    public double getAltezza() {
        return altezza;
    }
    public double getBase() {
        return base;
    }
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "altezza=" + altezza +
                ", base=" + base +
                " = ";
    }
}
