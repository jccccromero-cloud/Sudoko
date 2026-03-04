
import java.util.Scanner;

class SudokuGame {

    private SudokuBoard board;
    private Player player;
    private SudokuPrinter printer;
    private GameTimer timer;

    public SudokuGame() {
        board = new SudokuBoard(Difficulty.EASY);
        player = new HumanPlayer("Player 1");
        printer = new SudokuPrinter();
        timer = new GameTimer();
    }

    public void start() {

        Scanner sc = new Scanner(System.in);
        timer.start();

        while (!board.isComplete()) {

            printer.print(board);

            System.out.print("Row (1-9): ");
            int row = sc.nextInt() - 1;

            System.out.print("Col (1-9): ");
            int col = sc.nextInt() - 1;

            System.out.print("Number (1-9): ");
            int value = sc.nextInt();

            Move move = new Move(row, col, value);
            player.makeMove(board, move);
        }

        timer.stop();
        printer.print(board);
        System.out.println("🎉 You solved it!");
        System.out.println("Time: " + timer.getElapsedSeconds() + " seconds");
    }
}
