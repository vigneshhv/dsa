package arrays;
public class staircase_search {
    public static int search(int matrix[][],int key){
        int row =0;
        int col= matrix[0].length-1;
        while(row<matrix[0].length && col >=0){
            if(matrix[row][col]==key){
                System.out.println("element found");
                return 1;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("element not found");
        return 0;
    }
    public static void main(String[] args) {
        int matrix[][] ={{10,20,30,40,50},
                         {11,21,31,41,51},
                        {12,22,32,42,52},
                        {13,23,33,43,53}
                        };
           int key =1;
           search(matrix, key);   
           // time complexite big0(m+n)

        }
    
}
