class q1 {
    static int maxSum(int[] arr) {
        int start = arr[0];
        int end = arr[arr.length - 1];
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] > maxSum) {
                    maxSum = arr[i] + arr[j];
                }
            }
        }

        return maxSum;
    }

    static int maxSumbetter(int []arr){
    
    int max1 = Integer.MIN_VALUE; 
    int max2 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return max1 + max2;
    }


    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        //System.out.println(maxSum(arr));
    System.out.println(maxSumbetter(arr));    
    }
}