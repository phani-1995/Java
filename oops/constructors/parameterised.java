package oops.constructors;

class Student1{
    String name;
    int roll_no;

    // intializing a parameterized constructor
    Student1(String n, int rno){
        name = n;
        roll_no = rno;
    }
    void display(){
        System.out.println(name+" "+roll_no);
    }
    public static void main(String[] args){
        Student1 s1 = new Student1("Rithik",101);
        Student1 s2 = new Student1("Mohan", 102);
        s1.display();
        s2.display();
    }
}

