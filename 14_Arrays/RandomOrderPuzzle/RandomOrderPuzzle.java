import java.util.Scanner;
import java.io.File;

public class RandomOrderPuzzle {
    // The file data in original order.
    private String[] puzzleInOriginalOrder;
    // The file data in randomise order
    private String[] puzzleInRandomizeOrder;

    private int noOfLines;

    // Constructor
    public RandomOrderPuzzle(Scanner fileScanner) {
        readPuzzleInOriginalOrder(fileScanner);

        puzzleInRandomizeOrder = copyArray(puzzleInOriginalOrder, noOfLines);

        randomizeLines(puzzleInRandomizeOrder);
    } // RandomOrderPuzzle.

    // Initial size of the puzzleData array.
    private static final int INITIAL_ARRAY_SIZE = 2;
    // When puzzleData is full, we extend it by this factor.
    private static final int ARRAY_RESIZE_FACTOR = 2;

    private void readPuzzleInOriginalOrder(Scanner fileScanner) {
        puzzleInOriginalOrder = new String[INITIAL_ARRAY_SIZE];
        noOfLines = 0;
        while(fileScanner.hasNextLine()) {
            String currentLine = fileScanner.nextLine();
            if (noOfLines == puzzleInOriginalOrder.length) {
                // Array Resize Code
                String[] biggerArray = new String[puzzleInOriginalOrder.length * ARRAY_RESIZE_FACTOR];
                for (int index = 0; index < puzzleInOriginalOrder.length; index++)
                biggerArray[index] = puzzleInOriginalOrder[index];
                puzzleInOriginalOrder = biggerArray;
            } // if
            puzzleInOriginalOrder[noOfLines] = currentLine;
            noOfLines++;
        } // while
    } // readPuzzleInOriginalOrder

    // Return a shallow copy of given source,
    // but only the first dataLength elements.
    private String[] copyArray(String[] source, int dataLength) {
        String[] result = new String[dataLength];
        for (int index = 0; index < dataLength; index++)
            result[index] = source[index];
        return result;
    } // copyJobArray

    private void randomizeLines(String[] puzzleLines) {
        for (int itemsRemaining = puzzleLines.length; itemsRemaining > 0; itemsRemaining--) {
            int anIndex = (int) (Math.random() * itemsRemaining);
            String itemsAtAnIndex = puzzleLines[anIndex];
            puzzleLines[anIndex] = puzzleLines[puzzleLines.length - 1];
            puzzleLines[puzzleLines.length - 1] = itemsAtAnIndex;
        } // for
    } // randomizeLines

    public String toString() {
        String result = "";
        for (int index = 0; index < noOfLines; index++)
            result += "\n" + index + "\t" + puzzleInRandomizeOrder[index];
        return result;
    } // toString

    public boolean isSorted() {
        int flag = 0, index = 0;
        while (flag == 0) {
            flag = puzzleInRandomizeOrder[index].compareTo(puzzleInOriginalOrder[index]);
            if (flag != 0)
                break;
            if (index == puzzleInRandomizeOrder.length - 1)
                break;
            index++;
        } // while
        if (flag == 0)
            return true;
        else
            return false;
    } // isSorted

    public void swapLine(int lineNo) {
        String lineToSwap = puzzleInRandomizeOrder[lineNo];
        puzzleInRandomizeOrder[lineNo] = puzzleInRandomizeOrder[puzzleInRandomizeOrder.length - 1];
        puzzleInRandomizeOrder[puzzleInRandomizeOrder.length - 1] = lineToSwap;
    } // swapLine

    public static void main(String[] args) throws Exception {
        Scanner fileScanner = new Scanner(new File(args[0]));
        RandomOrderPuzzle puzzle = new RandomOrderPuzzle(fileScanner);

        Scanner inputScanner = new Scanner(System.in);
        System.out.println(puzzle);
        int moveCount = 0;
        while (!puzzle.isSorted()) {
            System.out.print("\nEnter a line number to swap with the last one: ");
            puzzle.swapLine(inputScanner.nextInt());
            System.out.println(puzzle);
            moveCount++;
        } // while
        System.out.println("Game Over in " + moveCount + " moves.");
    } // main
} // class RandomOrderPuzzle