package oops;
class Employee {
    int emp_id;
    String name;

    Employee(int emp_id, String name) {
        emp_id = emp_id;
        name = name;
    }

//    Employee(int emp_id, String name){
//        this.emp_id = emp_id;
//        this.name = name;
//    }

    void show() {
        System.out.println(emp_id + " " + name);
    }
}
class test{
    int emp_id;
    String name;
    // here we are referencing the instance variables using this key word
    test(int emp_id, String name) {
        this.emp_id = emp_id;
        this.name = name;
    }
    void show() {
        System.out.println(emp_id + " " + name);
    }
    public static void main(String... args) {
        Employee e1 = new Employee(101, "Washim");
        Employee e2 = new Employee(102, "Ramesh");
        // it will display default values i.e null values
        e1.show();
        e2.show();
        System.out.println("-----------------------------------------------------------------");
        test e3 = new test(103, "Kareem");
        test e4 = new test(104, "Karthik");
        // it will display values
        e3.show();
        e4.show();
    }
}