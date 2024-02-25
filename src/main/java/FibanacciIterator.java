public class FibanacciIterator {
    //time O(n)
    //memory O(5)
    public static int calc(int n){
        int result=1;
        int temp=0;
        int last=0;

       for(int i=0;i<n-1;i++){
           temp=result;
           result+=last;
           last=temp;
        }
       return result;
    }
}
