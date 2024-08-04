public class Ex6 {
    public static void main(String[] args){
        int n1 = 3, n2 = 8, n3 = 40, n4 = 15;

        System.out.println(soma(n1, n2));
        System.out.println(soma(n1, n2, n3));
        System.out.println(soma(n1, n2, n3, n4));
    }

    public static int soma(int ... nums){
        int sum = 0;
        for(int i: nums){
            sum += i;
        }
        return sum;
    }
}
