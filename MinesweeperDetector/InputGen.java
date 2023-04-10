import java.util.Random;

public class InputGen {

    public static void main(String[] args) {
        Random random = new Random();
        int max = 50;
        int min = 0;
        double minePercent = .88;

        for (int q = 0; q < 1; q++) {
            int rows = random.nextInt((max - min) + 1) + min;
            int columns = random.nextInt((max - min) + 1) + min;
/*            int rows = 100;
            int columns = 100;*/
            System.out.println(rows + " " + columns);

            char[][] field = new char[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    field[i][j] = '.';
                }
            }
            int mineNum = (int) ((rows * columns) * minePercent);
            for (int g = 0; g < mineNum; g++) {
                int i = random.nextInt(rows);
                int j = random.nextInt(columns);
                field[i][j] = '*';
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(field[i][j]);
                }
                System.out.println();
            }
        }
    }
}
