package arrys;

public class add_arry {
    public static void main(String args[]){
        int a[][]= {{1,2,3},{5,6,8}};
        int b[][]= {{2,3,4},{7,6,8}};

        // creating a matrix
        int c[][] = new int[2][3];

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(c[i][j]+"");
            }
            System.out.println();  // new line
        }
    }
}
