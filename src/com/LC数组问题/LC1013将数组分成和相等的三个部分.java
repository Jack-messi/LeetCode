package com.LC数组问题;

public class LC1013将数组分成和相等的三个部分 {
    public static void main(String[] args) {
        int[] arr = new int[]{-7,57,-76,5,51,-57,27,83,68,39,-38,43,-79,42,-79,72,-58,-29,-34,23,20,-67,-67,74,10,-90,-91,41,22,-12,-75,-3,51,13,9,58,72,-3,48,-28,78,15,13,22,-68,62,33,-18,21,-2,56,41,27,-33,-35,-36,-6,-73,-9,-45,-16,4,51,-54,-92,79,-92,-12,-9,39,1,-60,78,16,-77,-45,26,-43,44,-21,-27,74,-68,-58,22,52,100,37,48,99,98,-34,36,25,-85,83,99,-64,-37,20,0,13,85,18,98,-91,86,-94,-92,-42,-82,89,67,-13,43,11,75,67,-38,-79,-3,-24,83,-1,74,-93,26,-69,92,40,-32,-89,-100,-36,80,9,92,79,-83,90,-8,-77,1,-60,100,63,87,-51,-33,17,24,-73,-81,-86,52,59,10,-84,-71,-12,24,-53,-14,-44,-48,-91,-57,-82,-5,48,-56,-92,83,-64,-17,-46,65,-15,87,-61,-29,79,-53,-81,-58,70,70,-12,-71,68,-57,-44,-18,-94,-84,7,-51,18,44,96,24,8,61,36,-83,-93,38,82,25,4,37,93,-5,24,-9,-31,15,-73,-91,-36,41,56,-17,3,-94,-26,96,5,-21,-20,60,-53,26,2,-97,41,-72,-29,-83,32,35,-29,82,-38,-15,81,-10,50,22,26,30,-31,74,-74,47,66,53,35,-58,-68,47,-21,78,12,-88,1,12,53,94,1,-43,-36,67,6,-89,44,-86,-22,48,-12,72,-90,-7,-92,30,-17};
        System.out.println(canThreePartsEqualSum(arr));
    }

    //[-7,57,-76,5,51,-57,27,83,68,39,-38,43,-79,42,-79,72,-58,-29,-34,23,20,-67,-67,74,10,-90,-91,41,22,-12,-75,-3,51,13,9,58,72,-3,48,-28,78,15,13,22,-68,62,33,-18,21,-2,56,41,27,-33,-35,-36,-6,-73,-9,-45,-16,4,51,-54,-92,79,-92,-12,-9,39,1,-60,78,16,-77,-45,26,-43,44,-21,-27,74,-68,-58,22,52,100,37,48,99,98,-34,36,25,-85,83,99,-64,-37,20,0,13,85,18,98,-91,86,-94,-92,-42,-82,89,67,-13,43,11,75,67,-38,-79,-3,-24,83,-1,74,-93,26,-69,92,40,-32,-89,-100,-36,80,9,92,79,-83,90,-8,-77,1,-60,100,63,87,-51,-33,17,24,-73,-81,-86,52,59,10,-84,-71,-12,24,-53,-14,-44,-48,-91,-57,-82,-5,48,-56,-92,83,-64,-17,-46,65,-15,87,-61,-29,79,-53,-81,-58,70,70,-12,-71,68,-57,-44,-18,-94,-84,7,-51,18,44,96,24,8,61,36,-83,-93,38,82,25,4,37,93,-5,24,-9,-31,15,-73,-91,-36,41,56,-17,3,-94,-26,96,5,-21,-20,60,-53,26,2,-97,41,-72,-29,-83,32,35,-29,82,-38,-15,81,-10,50,22,26,30,-31,74,-74,47,66,53,35,-58,-68,47,-21,78,12,-88,1,12,53,94,1,-43,-36,67,6,-89,44,-86,-22,48,-12,72,-90,-7,-92,30,-17]
    public static boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        if (sum % 3 != 0) {
            return false;
        }
        sum = sum / 3;
        int avg = 0, num = 0;
        //因为要保证最后数组最后一个元素，单独满足等于sum的情况下。
        for (int i = 0; i < arr.length - 1; i++) {
            avg += arr[i];
            if (avg == sum) {
                num++;
                avg = 0;
            }
            if (num == 2) {
                break;
            }
        }
        //这里判断，(num > 2 && sum == 0)  是为了排除全部是0的情况下。
        if (num == 2 || (num > 2 && sum == 0)) {
            return true;
        }
        return false;
    }


//    public static boolean canThreePartsEqualSum(int[] A) {
//        int s = 0;
//        for (int num : A) {
//            s += num;
//        }
//        if (s % 3 != 0) {
//            return false;
//        }
//        int target = s / 3;
//        int n = A.length, i = 0, cur = 0;
//        while (i < n) {
//            cur += A[i];
//            if (cur == target) {
//                break;
//            }
//            ++i;
//        }
//        if (cur != target) {
//            return false;
//        }
//        int j = i + 1;
//        while (j + 1 < n) {  // 需要满足最后一个数组非空
//            cur += A[j];
//            if (cur == target * 2) {
//                return true;
//            }
//            ++j;
//        }
//        return false;
//    }


}
