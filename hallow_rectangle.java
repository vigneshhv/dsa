package arrays;
public class hallow_rectangle {
    public static void hollow(int row, int column){
    //    for (int i = 1; i <= row; i++) {
    //     for(int j = 1; j <= column; j++){
    //         if(i==1||j==1||i==row||j==column){
    //             System.out.print("*");

    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.print("\n");
    //    }
    for (int i = 1; i <= row; i++) {
            for(int j = 1; j <= column; j++){
                if(j<=row-i+1){
                    System.out.print(" ");

                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
       hollow(5, 6); 
    }
}
