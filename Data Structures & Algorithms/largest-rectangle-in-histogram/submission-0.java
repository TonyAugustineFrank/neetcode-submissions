class Solution {
  public int largestRectangleArea(int[] heights) {
    Stack<Integer> indexStack = new Stack<>();
    int[] extendedHeights = Arrays.copyOf(heights, heights.length + 1);
    extendedHeights[extendedHeights.length - 1] = 0;
    int maxArea = 0;
    for (int i = 0; i < extendedHeights.length; i++) {
      while (!indexStack.isEmpty() && extendedHeights[indexStack.peek()] > extendedHeights[i]) {
        int topIndex = indexStack.pop();
        int height = extendedHeights[topIndex];
        int width = indexStack.isEmpty() ? i : (i - indexStack.peek() - 1);
        maxArea = Math.max(maxArea, height * width);
      }
      indexStack.push(i);
    }

    return maxArea;
  }
}
