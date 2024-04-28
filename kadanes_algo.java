package arrays;
public class kadanes_algo {
    public static void algo(int arr[]){
        int crr=0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {

            crr=crr+arr[i];
            if(crr<0){
                crr=0;
            }
            max= Math.max(crr,max);
        }
        System.out.println("the maximum subarry volume is " + max);
    }
    public static void main(String[] args) {
        int arr[]={-1,1,2,-5,3,4,5};
        algo(arr);
    }
}
