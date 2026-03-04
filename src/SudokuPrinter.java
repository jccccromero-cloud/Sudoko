class SudokuPrinter {

    public void print(SudokuBoard board) {

        Cell[][] cells = board.getCells();

        System.out.println("\nSudoku Board:");

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int value = cells[i][j].getValue();
                System.out.print((value == 0 ? "." : value) + " ");
            }
            System.out.println();
        }
    }
}