package arrys;

public class jagged {
    public static void main(String... args) {
        int[][] x = new int[3][];
        x[0] = new int[3];
        x[1] = new int[4];
        x[2] = new int[2];
//intialization of jagged array
        int count = 0;
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[i].length; j++)
                x[i][j] = count++;

        //printing the data of a jagged array
        for(int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

    }
}
