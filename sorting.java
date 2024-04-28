package arrays;
class sorting{
    public static void bubble(int arr[]){
        for (int turn = 0; turn < arr.length
        ; turn++){
            for(int i = 0; i < arr.length-1-turn; i++){

                if(arr[i]> arr[i+1]){
                    int temp = arr[i];
                     arr[i]= arr[i+1];
                     arr[i+1]= temp;

                }
             }
       
    }
    
    }
    public static void selection(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int small=i;

            for(int j = i+1; j < arr.length; j++){
                if(arr[small]<arr[j]){
                    small =j;
                }
            }
            int temp = arr[small];
            arr[small]= arr[i];
            arr[i]=temp;
        }

    }
    public static void insertion(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int curr =arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }

    }
public static void main(String[] args) {
    int arr[]={4,1,6,3,2,7};
    //  bubble(arr);
    //  selection(arr);
    insertion(arr);
     for(int i=0; i<arr.length; i++) {
        System.out.print(arr[i]);
     }
}
}