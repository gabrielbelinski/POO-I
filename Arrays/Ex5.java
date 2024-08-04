public class Ex5 {
    public static void main(String[] args){
        int x, array[] = {2, 6, 7, 9,11, 12};

        int diff = 0, maior = 0;
        for(int i = 0; i < array.length; i++){
            if(i < array.length-1){
                diff = array[i+1] - array[i];
            }
            if(diff > maior){
                maior = diff;
            }
        }
        System.out.println(maior);
    }
}
