public class FindPeakElements {
    public static void main(String[] args) {
        int arr[]={4,3,5,2,6,2,7,4,8,};
        int length=arr.length;
        for (int i=0;i<arr.length;i++);
        int fist=arr[0];
        int last=arr[length-1];
        for(int i=1; i<arr.length-1; i++) {
            if (arr[i] == 0 || arr[i] == length-1) {
                return;
            }
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }
}
