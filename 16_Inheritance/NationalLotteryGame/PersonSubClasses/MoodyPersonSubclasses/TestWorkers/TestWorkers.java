// Create one of each type of worker,
// and get them to fill the machine of a game.
public class TestWorkers {
    public static void main(String[] args) {
        testWorker(new Worker("May Kit Dewitt"),
                    new Game("Lott O'Luck Larry", 3, "Slippery's Mile", 2));
        testWorker(new TraineeWorker("Darwin Marbest", 0.75), 
                    new Game("13th Time Lucky", 5, "Oooz OK Lose", 2));
    } // main 

    // Make the given worker fill the given game,
    // reporting values before and after
    private static void testWorker(Worker worker, Game game) {
        System.out.println("--------------------------------------------------");
        System.out.println("Start with");
        System.out.println(game);

        System.out.println("Balls added by");
        System.out.println(worker);

        worker.fillMachine(game);
        System.out.println(game);
        System.out.println(worker);
    } // testWorker
} // class testWorkers