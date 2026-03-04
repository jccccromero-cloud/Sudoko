class SudokuBoard {

    private Cell[][] cells;
    private Validator validator;

    public SudokuBoard(Difficulty difficulty) {

        validator = new BasicValidator();
        cells = difficulty.getBoard();
    }

    public boolean placeNumber(int row, int col, int value) {

        if (!cells[row][col].isEmpty()) {
            System.out.println("Cell already filled!");
            return false;
        }

        if (validator.isValid(cells, row, col, value)) {
            cells[row][col].setValue(value);
            return true;
        }

        System.out.println("Invalid move!");
        return false;
    }

    public boolean isComplete() {
        for (Cell[] row : cells)
            for (Cell cell : row)
                if (cell.isEmpty())
                    return false;
        return true;
    }

    public Cell[][] getCells() {
        return cells;
    }
}