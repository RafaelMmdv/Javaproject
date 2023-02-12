package model;

public class Student {

    private String name;
    private String surname;
    private int age;
    private String groupNumber;


    public Student(String name, String surname, int age, String groupNumber){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.groupNumber = groupNumber;

    }

    public String getName() {return name;}

    public String getSurname()  {return surname;}

    public int getAge() {return age;}

    public String getGroupNumber()  {return groupNumber;}

public  String getFullInfo(){
        return this.getName() + " " + this.getSurname() + " " + this.getAge() + " " + this.getGroupNumber();
}

}


