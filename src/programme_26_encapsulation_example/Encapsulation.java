package programme_26_encapsulation_example;
//Private variable declared these can only be accessed by public method of class
public class Encapsulation {
    private String name;
    private int rollNo;
    private int age;
    //get method for name to access private variable name
    public String  getName (){
        return name;
    }
    //set method for name to access private variable name
    public void setName(String name){
        this.name=name;

    }
    // get method for roll to access private variable rollNo
    public int getRollNo(){
        return rollNo;
    }
    // set method for roll to access private variable rollNo
    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    // get method for age to access private variable age
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }



}
