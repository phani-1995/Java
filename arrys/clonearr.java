package arrys;

class clonearr {
    public static void main(String... args){
        int arr[] = {33,55,67,34};
        for (int i:arr) {
            System.out.println(i);
        }
        System.out.println("Cloning the array");
        int carr[] = arr.clone();
        for (int j: carr) {
            System.out.println(j);
        }
        if(arr==carr) {
            System.out.println("Both are equal");
        }
        else {
            System.out.println("Both are not equal");
        }
    }
}