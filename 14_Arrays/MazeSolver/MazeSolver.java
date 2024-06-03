import java.io.file;
import java.util.Scanner;

/* Reads a maze representation from each file given as an argument
   and prints it out showing the shortest route from any entrance to an exit.
*/

public class MazeSolver{
    public static void main(String args[]) throws Exception{
        for (String filename : args)
            System.out.println(new MazeSolver(new Scanner(new File(filename))));
    } // main

    // The dimenstions of the maze are fixed.
    private static final int HEIGHT = 10;
    private static final int WIDTH = 20;

    // The values for cells in the maze model.
    // Start: this must be zero because you get there in zero steps.
    private static final int START = 0;

    // Space, hedge, path and end: must all be negative.
    // so they are not ambiguous with a move count.
    private static final int SPACE = -1;
    private static final int HEDGE = -2;
    private static final int PATH = -3;
    private static final int END = -4;

    // The characters used in the file and output to represent the maze.
    private static final char SPACE_REP = ' ';
    private static final char HEDGE_REP = '#';
    private static final char START_REP = '?';
    private static final char END_REP = '!';
    private static final char PATH_REP = '.';

    // The maze model. It is two bigger in each dimension so we can have an
    // extra hedge around the whole maze. This means every real cell has 4 
    // neighbours, so we don't need to check edges of the array.
    private final int[][] maze = new int[HEIGHT + 2][WIDTH + 2];

    // Construct a MazeSolver from the given scanner for a file
    // which must contain HEIGHT lines each of WIDTH characters.
    public MazeSolver(Scanner input){
        // First we place a surround of HEDGE cells.
        for (int row = 0; row < HEIGHT + 2; row++)
            maze[row][0] = maze[row][WIDTH + 1] = HEDGE;
        for (int column = 0; column < WIDTH +2; column++)
            maze[0][column] = maze[WIDTH+1][column] = HEDGE;

        // Next we read the maze, assuming the file is valid. 
        // This goes in to positions 1 to HEIGHT and 1 to WIDTH
        // leaving the surrounding hedge unchanged.
        for (int row = 1; row <= HEIGHT; row++){
            String mazeLine = input.nextLine();
            for (int column = 1; column <= WIDTH; column++){
                char inputChar = mazeLine.charAt(column - 1)
                switch(inputChar) {
                    case SPACE_REP: maze[row][column] = SPACE; break;
                    case HEDGE_REP: maze[row][column] = HEDGE; break;
                    case START_REP: maze[row][column] = START; break;
                    case END_REP: maze[row][column] = END;     break;
                } // switch
            } // for
        } // for
        // Solving 
        solve();
    } // MazeSolver
    
    // Each cell has four neighbours: these offsets help us find them
    private int[] neighbourOffsets = {-1, 0, 1, 0};

    // Find the shortest path from any START to any END.
    // There must exist such a path or else....
    private void solve(){
        // Find Start Postions
        int[] Start = new int[2];
        int[] End = new int[2];
        int[][] solvedMaze = new int[HEIGHT + 2][WIDTH + 2];

        for (int row = 1; row <= HEIGHT; row++){
            for (int column = 1; column <= WIDTH; column++){
                if (maze[row][column]== PATH) 
                    solvedMaze[row][column] = neighbourOffsets[0];
                if (maze[row][column] == END) {
                    End[0] = row; Start[1] = column;
                if ()
            } // for
        } // for

        int[][] solvedMaze = new int[HEIGHT + 2][WIDTH + 2];

        for (int row = 1; row <= HEIGHT; row++){
            for (int column = 1; column <= WIDTH; column++){
                if (maze[row])
            } // for
        } // for
        int moveCount = 0;
        boolean FOUND_EXIT = false;
        while (!FOUND_EXIT){
            
        }
    }
} // class MazeSolver