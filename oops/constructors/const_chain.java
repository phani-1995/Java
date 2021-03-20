package oops.constructors;

class Stud1 {
    int id;
    String name;
    String course;
    float fee;

    Stud1(int id, String name, String course){
        this.id = id;
        this.name=name;
        this.course=course;
    }

    Stud1(int id, String name, String course, float fee){
        this(id,name,course); //reusing constructor
        this.fee=fee;
    }

    void show(){
        System.out.println(id+" "+name+" "+course+" "+fee);
    }
    public static void main(String...args){
        Stud1 s = new Stud1(1,"Karthik", "Data Science");
        Stud1 s1 = new Stud1(2,"Manish","Machine lerning", 1000f);
        s.show();
        s1.show();
    }
}
