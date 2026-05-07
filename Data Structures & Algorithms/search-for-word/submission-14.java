class Solution {
    public boolean exist(char[][] board, String word) {
        int length = board.length;
        int height = board[0].length;

        System.out.println("Board size : " + length + " x " + height);
        System.out.println("Word length: " + word.length());

        if(length * height < word.length()) {
            System.out.println("Impossible case -> board cells are fewer than word length");
            return false;
        }

        System.out.println("Searching for word : " + word);

        for(int i = 0; i < length; i++) {
            for(int j = 0; j < height; j++) {

                System.out.println("\n==============================");
                System.out.println("Starting search from [" + i + "][" + j + "]");
                System.out.println("Character at start : " + board[i][j]);
                System.out.println("==============================");

                if(track(board, i, j, word,0)) {
                    System.out.println("FINAL RESULT : TRUE");
                    return true;
                }
            }
        }

        System.out.println("FINAL RESULT : FALSE");
        return false;
    }

    private boolean track(char[][] board, int i, int j, String word, int index) {

    if(index == word.length())
        return true;

    if(i < 0 || j < 0 || i >= board.length || j >= board[0].length)
        return false;

    if(board[i][j] != word.charAt(index))
        return false;

    char temp = board[i][j];
    board[i][j] = '#';

    boolean found =
        track(board, i - 1, j, word, index + 1) ||
        track(board, i + 1, j, word, index + 1) ||
        track(board, i, j - 1, word, index + 1) ||
        track(board, i, j + 1, word, index + 1);

    board[i][j] = temp;

    return found;
}
}