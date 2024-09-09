import java.util.HashSet;

public class _36_ValidSudoku {
        public boolean isValidSudoku(char[][] board) {

        for (int row = 0; row < board.length; row++) {
            HashSet<Character> r = new HashSet<Character>();
            for (int col = 0; col < board.length; col++) {
                int squareR = row/3 * 3;
                int squareC = col/3 * 3;

                char digit = board[row][col];
                if (digit == '.') {
                    continue;
                }

                if (r.contains(digit)) {
                    System.out.println("row");
                    return false;
                }
                r.add(digit);

                if (board[(row + 1) % 3 + squareR][col] == digit || board[(row + 2) % 3 + squareR][col] == digit || 
                    board[row][(col + 1) % 3 + squareC] == digit || board[row][(col + 2) % 3 + squareC] == digit ||
                    board[(row + 1) % 3 + squareR][(col + 1) % 3 + squareC] == digit ||
                    board[(row + 2) % 3 + squareR][(col + 1) % 3 + squareC] == digit ||
                    board[(row + 1) % 3 + squareR][(col + 2) % 3 + squareC] == digit || 
                    board[(row + 2) % 3 + squareR][(col + 2) % 3  + squareC] == digit) {
                        return false;
                }

                if (board[(row + 1) % 9][col] == digit || board[(row + 2) % 9][col] == digit || 
                    board[(row + 3) % 9][col] == digit || board[(row + 4) % 9][col] == digit || 
                    board[(row + 5) % 9][col] == digit || board[(row + 6) % 9][col] == digit || 
                    board[(row + 7) % 9][col] == digit || board[(row + 8) % 9][col] == digit) {
                        System.out.println("col");
                        return false;
                }
            }
        }
        return true;
    }
}
