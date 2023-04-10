import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinsweeperTest {
    File file = new File("C:/Users/Steven/IdeaProjects/Minesweeper360/src/minesweeper_output.txt");
    File file2 = new File("C:/User/Steven/IdeaProjects/Minesweeper360/src/output.txt");
    Scanner fileRead;
    Scanner fileRead2;

    {
        try {
            fileRead = new Scanner(file);
            fileRead2 = new Scanner(file2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Test
    void test1x1All() {
        assertEquals(fileRead.nextLine(), fileRead2.nextLine());
        assertEquals(fileRead.nextLine(), fileRead2.nextLine());

    }

    @Test
    void test1x1None() {
        for (int i = 0; i < 3; i++) {
            fileRead.nextLine();
            fileRead2.nextLine();
        }
        assertEquals(fileRead.nextLine(), fileRead2.nextLine());
        assertEquals(fileRead.nextLine(), fileRead2.nextLine());
    }


    @Test
    void test1x100All() {
        for (int i = 0; i < 6; i++) {
            fileRead.nextLine();
            fileRead2.nextLine();
        }
        assertEquals(fileRead.nextLine(), fileRead2.nextLine());
        assertEquals(fileRead.nextLine(), fileRead2.nextLine());

    }

    @Test
    void test1x100None() {
        for (int i = 0; i < 9; i++) {
            fileRead.nextLine();
            fileRead2.nextLine();
        }
        assertEquals(fileRead.nextLine(), fileRead2.nextLine());
        assertEquals(fileRead.nextLine(), fileRead2.nextLine());


    }

    @Test
    void test1x100One() {
        for (int i = 0; i < 12; i++) {
            fileRead.nextLine();
            fileRead2.nextLine();
        }
        assertEquals(fileRead.nextLine(), fileRead2.nextLine());
        assertEquals(fileRead.nextLine(), fileRead2.nextLine());


    }

    @Test
    void test1x100Some() {
        for (int i = 0; i < 15; i++) {
            fileRead.nextLine();
            fileRead2.nextLine();
        }
        assertEquals(fileRead.nextLine(), fileRead2.nextLine());
        assertEquals(fileRead.nextLine(), fileRead2.nextLine());


    }

    @Test
    void test1x100SomeMore() {
        for (int i = 0; i < 18; i++) {
            fileRead.nextLine();
            fileRead2.nextLine();
        }
        assertEquals(fileRead.nextLine(), fileRead2.nextLine());
        assertEquals(fileRead.nextLine(), fileRead2.nextLine());


    }

    @Test
    void test5x5() {
        for (int i = 0; i < 21; i++) {
            fileRead.nextLine();
            fileRead2.nextLine();
        }
        for (int i = 0; i < 6; i++) {
            assertEquals(fileRead.nextLine(), fileRead2.nextLine());
        }
    }

    @Test
    void test100x100All() {
        for (int i = 0; i < 28; i++) {
            fileRead.nextLine();
            fileRead2.nextLine();
        }
        for (int i = 0; i < 101; i++) {
            assertEquals(fileRead.nextLine(), fileRead2.nextLine());
        }
    }

    @Test
    void test100x100None() {
        for (int i = 0; i < 130; i++) {
            fileRead.nextLine();
            fileRead2.nextLine();
        }
        for (int i = 0; i < 101; i++) {
            assertEquals(fileRead.nextLine(), fileRead2.nextLine());
        }
    }

    @Test
    void test100x1SomeMore() {
        for (int i = 0; i < 232; i++) {
            fileRead.nextLine();
            fileRead2.nextLine();
        }
        for (int i = 0; i < 101; i++) {
            assertEquals(fileRead.nextLine(), fileRead2.nextLine());
        }
    }

    @Test
    void test100x1Some() {
        for (int i = 0; i < 334; i++) {
            fileRead.nextLine();
            fileRead2.nextLine();
        }
        for (int i = 0; i < 101; i++) {
            assertEquals(fileRead.nextLine(), fileRead2.nextLine());
        }
    }

    @Test
    void test100x1All() {
        for (int i = 0; i < 436; i++) {
            fileRead.nextLine();
            fileRead2.nextLine();
        }
        for (int i = 0; i < 101; i++) {
            assertEquals(fileRead.nextLine(), fileRead2.nextLine());
        }
    }

    @Test
    void test100x1None() {
        for (int i = 0; i < 538; i++) {
            fileRead.nextLine();
            fileRead2.nextLine();
        }
        for (int i = 0; i < 101; i++) {
            assertEquals(fileRead.nextLine(), fileRead2.nextLine());
        }
    }
}
