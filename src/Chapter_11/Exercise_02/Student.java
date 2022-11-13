package Chapter_11.Exercise_02;

public class Student extends Person{
  private int statu;
  public final static int FRESHMAN=1;
    public final static int SOPHOMORE = 3;
    public final static int JUNIOR = 2;
    public final static int SENIOR = 4;

  public Student(String name, String adress, String number, String e_mail, int statu) {
    super(name, adress, number, e_mail);
    this.statu = statu;
  }

  public String getStatu() {
   switch (statu){
     case 1:return "FRESMANN";
     case 2:return "sophomore";
     case 3:return "junıor";
     case 4:return "senior";
     default:return "unknown";

   }

  }

  public void setStatu(int statu) {
    this.statu = statu;
  }

@Override
  public String toString(){
    return  super.toString()+"statu "+statu;
}

}
