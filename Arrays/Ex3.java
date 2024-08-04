public class Ex3 {
    public static void main(String[] args){

        double[] vet = {1,2,3,4,5};

        double md = 0;
        for(double i: vet){
            md += i;
        }

        double res = md/vet.length;
        System.out.println(res);

    }
}
