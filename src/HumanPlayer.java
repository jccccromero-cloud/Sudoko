class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public void makeMove(SudokuBoard board, Move move) {
        board.placeNumber(move.getRow(), move.getCol(), move.getValue());
    }
}
