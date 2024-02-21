import java.util.*;
class Amazon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for(int i : arr) {
            max.add(i);
            min.add(i);
        }
        int maxDiff = Integer.MAX_VALUE;
        while(true) {
            int maxVal = max.poll();
            int minVal = min.poll();
            maxDiff = Math.min(maxDiff, maxVal - minVal);
            max.add(maxVal + 1);
            min.add(minVal - 1);
            if(maxDiff > maxVal - minVal) {
                break;
            }
        }
        System.out.println(maxDiff);
    }
}