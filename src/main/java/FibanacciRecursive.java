public class FibanacciRecursive {
    //time O(2^n)
    //memory O(n)
    public static int  calc(int n){
        if(n<=0){
            return 0;
        }
        if(n<=2){
            return 1;
        }
        return calc(n-2) + calc(n-1);

    }
}
