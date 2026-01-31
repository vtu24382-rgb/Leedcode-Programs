import java.util.*;

class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int ast : asteroids) {
            boolean destroyed = false;
            while (!stack.isEmpty() && ast < 0 && stack.peek() > 0) {
                if (Math.abs(ast) > stack.peek()) stack.pop();
                else if (Math.abs(ast) == stack.peek()) {
                    stack.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }
            if (!destroyed) stack.push(ast);
        }

        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) res[i] = stack.pop();
        return res;
    }
}
