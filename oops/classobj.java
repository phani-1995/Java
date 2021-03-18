package oops;
class Student {
   int id;  // instance variable
   String name;
   public static void main(String[] args){
       Student s = new Student(); // creating a object and 's' is a reference
       s.id = 1;
       s.name = "Karthik";
       System.out.println(s.id);// printing the datails using reference
       System.out.println(s.name);
   }
}

