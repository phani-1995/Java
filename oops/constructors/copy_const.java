package oops.constructors;

class Employee{
    int emp_id;
    String emp_name;
    // constructor intilize a values id and name
    Employee(int id, String name){
        emp_id=id;
        emp_name=name;
    }
    // contructor to intialize one more object
    Employee(Employee e){
        emp_id=e.emp_id;
        emp_name=e.emp_name;
    }

    void display(){
        System.out.println(emp_id+" "+emp_name);
    }

    public static void main(String...args){

        Employee e1 = new Employee(10002, "karthik");
        Employee e2 = new Employee(e1);
        e1.display();
        e2.display();
    }
}

