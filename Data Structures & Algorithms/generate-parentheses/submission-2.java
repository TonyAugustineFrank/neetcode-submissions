class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(0, 0, n, "", result);
        return result;
    }
    private void backtrack(int openCount, int closedCount, int n, String currentString, List<String> result) {
        if (openCount == n && closedCount == n) {
            result.add(currentString);
            return;
        }

        if (openCount < n) {
            backtrack(openCount + 1, closedCount, n, currentString + "(", result);
        }

        if (closedCount < openCount) {
            backtrack(openCount, closedCount + 1, n, currentString + ")", result);
        }
    }
}