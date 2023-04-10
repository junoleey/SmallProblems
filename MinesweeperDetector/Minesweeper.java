//import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Minesweeper {
    public static void main(String[] args) throws FileNotFoundException {

        //File file = new File("minesweeper_input.txt");
        //File file = new File("simplemine.txt");
        final Scanner mineReader = new Scanner(System.in);

        int fieldCount = 0;
        while (mineReader.hasNext()) {
            final int rows = mineReader.nextInt();
            final int columns = mineReader.nextInt();
            if (rows > 0 && columns > 0) {
                final char[][] fieldArray = new char[rows + 2][columns + 2];
                fieldCount++;
                readFile(mineReader, fieldArray, rows, columns, fieldCount);
                final int[][] fieldHint = new int[rows + 2][columns + 2];
                findMines(fieldHint, fieldArray, rows, columns);
                print(fieldHint, fieldArray, rows, columns);
            }
        }
    }

    public static void readFile(final Scanner theMineReader, final char[][] theFieldArray,
                                final int theRows, final int theColumns,
                                final int theFieldCount) {
        if (theRows > 0 && theColumns > 0) {
            System.out.println("Field #" + theFieldCount + ":");
            for (int i = 0; i < theRows; i++) {
                final String line = theMineReader.next();
                for (int j = 0; j < theColumns; j++) {
                    theFieldArray[i + 1][j + 1] = line.charAt(j);
                }
            }
        }
    }

    public static void findMines(final int[][] theFieldHint, final char[][] theFieldArray,
                                 final int theRows, final int theColumns) {
        for (int i = 0; i < theRows + 2; i++) {
            for (int j = 0; j < theColumns + 2; j++) {
                if (theFieldArray[i][j] == '*') {
                    theFieldHint[i - 1][j]++;
                    theFieldHint[i - 1][j + 1]++;
                    theFieldHint[i][j + 1]++;
                    theFieldHint[i + 1][j + 1]++;
                    theFieldHint[i + 1][j]++;
                    theFieldHint[i + 1][j - 1]++;
                    theFieldHint[i][j - 1]++;
                    theFieldHint[i - 1][j - 1]++;
                }
            }
        }
    }

    public static void print(final int[][] theFieldHint, final char[][] theFieldArray,
                             final int theRows, final int theColumns) {
        for (int i = 1; i < theRows + 1; i++) {
            for (int j = 1; j < theColumns + 1; j++) {
                if (theFieldArray[i][j] == '*') {
                    System.out.print("*");
                } else {
                    System.out.print(theFieldHint[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
