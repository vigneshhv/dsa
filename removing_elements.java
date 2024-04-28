package arrays;
class  even{
  void check(char [] array){
  int  n =array.length;
 for(int i = 0,j=n-1;i<n;i++,j--)
 {
    if(array[j]==array[i]){
        continue;
    }
    else{
        System.out.println("not a pallindrome");
        break;
    }
 }
 
} 
    
    }

class removing_elements{
    public static void main(String[] args){
     even abc = new even();
        char [] array = {'m', 'a', 'd','a','m'};
        abc.check(array);
      
    }
}