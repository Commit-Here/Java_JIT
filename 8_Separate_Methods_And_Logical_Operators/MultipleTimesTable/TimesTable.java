// Program to print out a neat 10 by 10 multiplication table.
public class TimesTable {
    public static void main(String args[]) {
        // Top line.
        printLine();

        // Column headings
        printColumnHeadings();

        // Underline headings -- same as Top line.
        printLine();

        // Now the rows.
        for (int row = 1; row <= 10; row++) 
            printRow(row);

        // Bottom line  -- same as top line.
        printLine();
    } // main

    // Print a line across the table.
    private static void printLine(){
        // Left side, 5 characters for row labels, separator.
        System.out.print("|-----|");
        // Above the column headings.
        for (int column = 1; column <= 10; column++)
            // 4 charcters for each column.
            System.out.print("----");
        // The right side.
        System.out.println("-|");
    } // printLine

    // Print a line containing the column headings.
    private static void printColumnHeadings(){
        System.out.print("|     |");
        for (int column = 1; column <= 10; column++)
            // Need to make column number always occupy 4 characters
            if (column < 10)
                System.out.print("   " + column);
            else 
                System.out.print("  " + column);
        System.out.println(" |");
    } // printColumnHeadings

    // Print one row of the table.
    private static void printRow(int row){
        // The left side.
        System.out.print("|");
        printNumber(row);
        // Separator.
        System.out.print(" |");

        // Now the columns on this row.
        for (int column = 1; column <= 10; column++) 
            printNumber(row * column);

        // The right side.
        System.out.println(" |");
    } // printRow


    private static void printNumber(int numberToPrint) {
        // Need to make product always occupy 4 characters.
        if (numberToPrint < 10)
            System.out.print("   " + numberToPrint);
        else if (numberToPrint < 100)
            System.out.print("  " + numberToPrint);
        else
            System.out.print(" " + numberToPrint);
    } // printNumber
}  // class TimesTable