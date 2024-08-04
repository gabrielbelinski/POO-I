public class Ex7 {
    public static void main(String[] args){
        int[][] mtr = {{0,1,2},{3,4,5},{6,7,8}};

        for(int i = 0; i < mtr.length; i++){
            for(int j = 0; j < mtr[i].length; j++){
                System.out.printf("%d ", mtr[i][j]);
            }
            System.out.println();
        }
    }
}
