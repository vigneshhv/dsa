package arrays;
public class binnary {
    public static void search(int num[],int key){
    int strt ,mid,end;
    strt =0;
    end =num.length-1;
    while(strt<=end){
        mid=(strt+end)/2;
        if(key==num[mid]){
            System.out.println("value at "+mid);
            break; 
        }    
        else if(key>num[mid]){
            strt=mid+1;
        }
        else{
        end = mid-1;
        }
    }
    }
    public static void main(String[] args) {
       int numbers[]={1,2,3,4,5,8,9 };
       int key=9;
        search(numbers,key); 
    }
}
