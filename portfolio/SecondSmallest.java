public class SecondSmallest {

    public static int findSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Array must contain at least two distinct elements.");
        }

        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,9};

        try {
            int secondSmallest = findSecondSmallest(arr);
            System.out.println("The second smallest element is: " + secondSmallest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
