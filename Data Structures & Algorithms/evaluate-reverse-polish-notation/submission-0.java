class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(String s: tokens) {
            if (s.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (s.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (s.equals("-")) {
                int after = stack.pop();
                int before = stack.pop();
                stack.push(before - after);
            } else if (s.equals("/")) {
                int after = stack.pop();
                int before = stack.pop();
                stack.push(before / after);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }

        return stack.pop();

    }
}


// "1","2","+","3","*","4","-"
// 1 -> stack = [1]
// 2 -> stack = [2, 1]
// + -> stack.pop() -> 2 stack.pop() -> 1 --> result = 1 + 2 = 3 -> stack = [3]
// 3 -> stack = [3, 3]