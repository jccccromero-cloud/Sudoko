class BasicValidator implements Validator {

    @Override
    public boolean isValid(Cell[][] board, int row, int col, int value) {

        for (int i = 0; i < 9; i++) {
            if (board[row][i].getValue() == value) return false;
            if (board[i][col].getValue() == value) return false;
        }

        int boxRow = row - row % 3;
        int boxCol = col - col % 3;

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[boxRow + i][boxCol + j].getValue() == value)
                    return false;

        return true;
    }
}
