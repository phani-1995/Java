package oops;

class employee {
    int id;
    String name;
    float salary;

    void insert(int i, String n, float s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}
public class Testemployee{
    public static void main(String[] args){
        employee e1 = new employee();
        employee e2 = new employee();
        e1.insert(101,"abc",4500);
        e2.insert(102,"xyz",5000);
        e1.display();
        e2.display();
    }
}

