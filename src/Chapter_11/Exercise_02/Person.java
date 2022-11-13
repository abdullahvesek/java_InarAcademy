package Chapter_11.Exercise_02;

public class Person {
    private String name;
    private String adress;
    private String number;
    private String e_mail;

    public Person(){
        this(null,null,null,null);
    }

public Person(String name,String adress,String number,String e_mail){
        this.name=name;
        this.adress=adress;
        this.number=number;
        this.e_mail=e_mail;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }
public String toString(){
        return "name "+name+" \nadress "+adress+"\nnumber "+number+" \nemail "+e_mail;
}

}
