package arrays;
public class pair_array {
    public static void  arr(int pair[])
    {
        int curr ;
        for(int i =0 ; i < pair.length ; i++)
            {
                curr = pair[i];
                for(int j = i+1; j < pair.length; j++){
                    System.out.print("("+curr+","+pair[j]+")");
                }
                System.out.println();
            }  
          }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        arr(arr);
    }
}
