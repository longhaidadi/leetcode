package ict;

/**
 * Created by lon on 16-5-4.
 */
public class Solution79 {
    public boolean exist(char[][] board, String word) {
        if (word == null || word.length() == 0) {
            return false;
        }

        boolean[][] visited = new boolean[board.length][board[0].length];

        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (backtrack(board, words, i, j, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean backtrack(char[][] board, char[] words, int x, int y, int step, boolean[][] visited) {
        if (step == words.length) {
            return true;
        }
        if (x < 0 || x == board.length || y < 0 || y == board[0].length) {
            return false;
        }
        if (visited[x][y]) {
            return false;
        }
        if (words[step] != board[x][y]) {
            return false;
        }
        visited[x][y] = true;
        boolean isAnyOk = backtrack(board, words, x, y + 1, step + 1, visited) ||
                backtrack(board, words, x, y - 1, step + 1, visited) ||
                backtrack(board, words, x + 1, y, step + 1, visited) ||
                backtrack(board, words, x - 1, y, step + 1, visited);
        visited[x][y] = false;
        return isAnyOk;
    }

    public static void main(String[] args) {
        char[][] board ={{'a','a'}};
        new Solution79().exist(board,"aaa");
    }
}
