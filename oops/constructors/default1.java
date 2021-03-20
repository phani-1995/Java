package oops.constructors;

class Student {
    String name;
    int roll_no;

    Student(){}   // it will automatically called if we wont declear also

    void display(){ // not passing any parameters or values then default values will be taken
        System.out.println(name+" "+roll_no);
    }
    public static void main(String[] args){
        Student s1= new Student();   //when creted object without passing any values then it call default constructor
        s1.display();
    }
}
