package baitapbotuc.ngay01032023;

public class Peron {
    String name;
    String gender;
    int age;
    String clasName;

    public String getInf(){
        return "name - " + name + "\ngender - " + gender + "\nage - " + age + "\nclaname - " + clasName;


    }

    public static void main(String[] args) {
        Peron  person1 = new Peron ();

        person1.name = "Nguyen Tay";
        person1.gender = "Nam";
        person1.age = 18;
        person1.clasName = "IBSK1D2";

        System.out.println(person1.getInf());
    }
}
