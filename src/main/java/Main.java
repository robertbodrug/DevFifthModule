public class Main {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(FibanacciRecursive.calc(10));

        System.out.println(System.currentTimeMillis());
        System.out.println(FibanacciIterator.calc(100000));
        System.out.println(System.currentTimeMillis());
        System.out.println(FibanacciIterator.calc(200000));


        System.out.println(System.currentTimeMillis());
        System.out.println(FibanacciDinamic.calc(100000));

        System.out.println(System.currentTimeMillis());
        System.out.println(FibanacciDinamic.calc(100000));

        System.out.println(System.currentTimeMillis());
    }
}
