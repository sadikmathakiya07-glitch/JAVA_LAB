public class rotatearay {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter array size : ");
        int s = sc.nextInt();
        int ar[] = new int[s];
        rotatearay obj = new rotatearay();
        obj.rotateArray(ar);
    }

    void rotateArray(int ar[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for (int i = 0; i < ar.length; i++) {
            System.out.println("enter ar[" + i + "] : ");
            ar[i] = sc.nextInt();
        }
        
        System.out.println("Enter rotation point (k): ");
        int k = sc.nextInt();
        k = k % ar.length;
        
        System.out.println("Array after rotation:");
        int[] rotated = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            rotated[i] = ar[(i + k) % ar.length];
        }
        for (int i = 0; i < ar.length; i++) {
            ar[i] = rotated[i];
            System.out.println("ar[" + i + "] = " + ar[i]);
        }
        
        System.out.println("\nEnter target to search: ");
        int target = sc.nextInt();
        int result = search(ar, target);
        System.out.println("Target found at index: " + result);
    }
    
     int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            }
            
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        
        return -1;
    }

}
