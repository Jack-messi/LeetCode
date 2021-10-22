package com.LC简单题;

public class LC1217玩筹码 {
    public static void main(String[] args) {

    }

    public static int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;
        for (int i : position) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
            if (odd>even)
            {
                return even;
            }

        return odd;
    }
}
