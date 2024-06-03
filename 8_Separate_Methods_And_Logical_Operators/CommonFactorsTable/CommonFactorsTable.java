public class CommonFactorsTable {
    public static int GCD(int multiple1OfGCD, int multiple2OfGCD) {    
        while (multiple1OfGCD != multiple2OfGCD)
            if (multiple1OfGCD > multiple2OfGCD) 
                multiple1OfGCD-=multiple2OfGCD;
            else
                multiple2OfGCD-=multiple1OfGCD;
            return multiple1OfGCD;
    }
    public static void main(String args[]) {
        // Top line.
        printLine();

        // Column headings
        printColumnHeadings();

        // Underline headings -- same as Top line.
        printLine();

       // Now the rows.
        for (int row = 2; row <= 20; row++) 
            printRow(row);
        
        // Underline headings -- same as Top line.
        printLine();
    } // main

    private static void printLine(){
        // Left side, 5 characters for row labels, separator.
        System.out.print("|-----|");
        // Above the column headings.
        for (int column = 2; column <= 20; column++)
            // 3 charcters for each column.
            System.out.print("---");
        // The right side.
        System.out.println("-|");
    }

    private static void printColumnHeadings(){
        System.out.print("|     |");
        for (int column = 2; column <= 20; column++)
            // Need to make column number always occupy 4 characters
            if (column < 10)
                System.out.print("  " + column);
            else 
                System.out.print(" " + column);
        System.out.println(" |");
    }
    private static void printRow(int row) {
        // Need to make row number always occupy 7 characters
        // including vertical lines.
        if (row < 10) 
            System.out.print("|   " + row + " |");
        else 
            System.out.print("|  " + row + " |");

        // Now the columns on this row.
        for (int column = 2; column <= 20; column++) 
            printSymbol(GCD(row, column));
            
        // The right side.
         System.out.println(" |");
        
    }
    private static void printSymbol(int gcd){
        // Need to make product always occupy 4 characters.
        if (gcd != 1)
            System.out.print("--#");
        else
            System.out.print("--|");
    }
} // class CommonFactorsTable