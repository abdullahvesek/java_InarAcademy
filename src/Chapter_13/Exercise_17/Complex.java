package Chapter_13.Exercise_17;

public class Complex implements Comparable<Complex>,Cloneable {
    private double n1 = 0;
    private double n2 = 0;

    public Complex() {
        this(0, 0);
    }

    public Complex(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Complex(double n1) {
        this.n1 = n1;
        n2 = 0;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getRealPart() {
        return n1;
    }

    public double getImaginaryPart() {
        return n2;

    }

    public String add(Complex a) {
        return (a.getN1() + this.n1) + " , " + (a.getN2() + this.n2) + "i";

    }

    public String sub(Complex a) {
        return (a.getN1() - this.n1) + " , " + (a.getN2() - this.n2) + "i";
    }

public String multiply(Complex a){

            return (this.n1*a.getN1()-this.n2*a.getN2())+" "+ (this.n2*a.getN1()+this.n1*a.getN2())+"i";
}
public double abs(){
        return Math.sqrt(Math.pow(this.n1,2)+Math.pow(this.n2,2));

}
@Override
    public String toString(){
        return this.n1+" "+this.n2+"i";
}
@Override
    public int compareTo(Complex a){
        if (this.abs()>a.abs())
            return 1;
        else if (this.abs()<a.abs()) {
            return -1;
        }
else
    return 0;
}

@Override
    public Object clone(){
        try {
        return     super.clone();
        }catch (CloneNotSupportedException ex){
            System.out.println("cannot be cloned ");
       return null;
        }

    }
}