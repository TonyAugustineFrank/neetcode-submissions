class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Unit> stack = new Stack<>();
        ArrayList<Unit> list = new ArrayList<>();

        for (int i = 0; i < position.length; i++) {
            list.add(new Unit(position[i], speed[i]));
        }
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            Unit current = list.get(i);
            if (stack.isEmpty()) {
                stack.push(current);
            } else {
                Unit stel = stack.peek();
                double currentTime = (double) (target - current.p) / current.s;
                double stelTime = (double) (target - stel.p) / stel.s;

                if (currentTime > stelTime) {
                    stack.push(current);
                }
            }
        }

        return stack.size();
    }

    private static class Unit implements Comparable<Unit> {
        public int p;
        public int s;

        public int compareTo(Unit that) {
            return Integer.compare(that.p, this.p);
        }

        Unit(int p, int s) {
            this.p = p;
            this.s = s;
        }
    }
}
