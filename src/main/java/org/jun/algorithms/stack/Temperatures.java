package org.jun.algorithms.stack;

import java.util.Stack;

public class Temperatures {
    private Stack<Integer> stack;

    public Temperatures() {
        stack = new Stack<Integer>();
    }

    public int[] dailyTemperatures(int[] temperatures) {
        if (temperatures == null || temperatures.length == 0)
            return new int[]{};
        int[] dailyTemperatures = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int index = stack.pop();
                dailyTemperatures[index] = i - index;
            }
            stack.push(i);
        }
//        int daily = 0;
//        for (int i = 0; i < temperatures.length; i++) {
//            int temperature = temperatures[i];
//            dailyTemperatures[i] = 0;
//            if (!stack.isEmpty() && temperature > stack.peek()) {
//                boolean popIndicator = false;
//                while (stack.isEmpty() == false && temperature > stack.peek()) {
//                    int top = stack.pop();
//                    daily++;
//
//                    if(popIndicator == true){
//                        dailyTemperatures[i - daily] = daily;
//                    } else {
//                        popIndicator = true;
//                        dailyTemperatures[i - 1] = 1;
//                    }
//                }
//            }
//            if (stack.isEmpty())
//                daily = 0;
//            stack.push(temperature);
//
//        }
        return dailyTemperatures;
    }
}
