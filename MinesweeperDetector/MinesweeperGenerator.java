/*
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

public class MinesweeperGenerator {

    private int max = 100;
    private int min = 0;
    private char[][] field;
    private int rows;
    private int columns;
    private double minePercent = .10;

    public static void main(String[] args) throws FileNotFoundException {

        MinesweeperGenerator input = new MinesweeperGenerator();

        Random random = new Random();

//        PrintStream minesweeperInput = new PrintStream(new File("input.txt"));
//        PrintStream console = System.out;
//        System.setOut(minesweeperInput);

        int fieldNum = 5;
        for (int i = 0; i < fieldNum; i++) {
            input.generateRowsColumns(random);
            input.generateFields(random);
            input.printFields();
        }

        //System.setOut(console);
    }

    public void generateRowsColumns(Random random) {
        int rows = random.nextInt((max - min) + 1) + min;
        int columns = random.nextInt((max - min) + 1) + min;
        System.out.println(rows + " " + columns);
    }

    public void generateFields(Random random) {
        char[][] field = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                field[i][j] = '.';
            }
        }
        int mineNum = (int) ((rows * columns) * minePercent);
        for (int g = 0; g < mineNum; g++) {
            int i = random.nextInt((rows) + 1);
            int j = random.nextInt((columns) + 1);
            field[i][j] = '*';
        }
    }

    public void edgeCases() {

    }

    public void printFields() {
        for (int i = 0; i < rows + 2; i++) {
            for (int j = 0; j < columns + 2; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}
*/
