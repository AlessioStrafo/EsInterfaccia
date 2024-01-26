public class Rettangolo implements Forma{
    private double base;
    private double altezza;
    public Rettangolo(double base, double altezza){
        this.base=base;
        this.altezza=altezza;
    }
    @Override
    public double calcolaArea() {
        return base * altezza;
    }
    public double getAltezza(){
        return altezza;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
    @Override
    public String toString() {
        return "base=" + base +
                ", altezza=" + altezza +
                " = ";
    }
}
