package dafaq;

public class Main {

    public static void main(String[] args) {
        double [][] test ={{85,90,80},{86,88,90},{84,92,89},{88,95,82}};

        for (int column = 0; column < test[0].length; column++) {
            double total=0;
            for (int row = 0; row < test.length; row++) {
                total+=test[row][column];
                System.out.println(total);
           }

        }







    }
}
