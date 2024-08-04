import java.util.Scanner;
public class TestCompositor {
    public static void main(String[] args){
        Compositor c1 = new Compositor();
        Compositor arr[] = new Compositor[2];
        Scanner scan = new Scanner(System.in);

        c1.setCodigo("3333");
        c1.setNome("Gabriel");
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = new Compositor();
            System.out.printf("Digite o codigo do %d elemento: ", (i+1));
            arr[i].setCodigo(scan.nextLine());
            System.out.printf("Digite o nome do %d elemento: ", (i+1));
            arr[i].setNome(scan.nextLine());
        }

        System.out.println(c1.getCodigo());
        System.out.println(c1.getNome());

        for(int i = 0; i < arr.length; i++){
            System.out.println("Elemento " + (i+1));
            System.out.println("Codigo: " + arr[i].getCodigo());
            System.out.println("Nome: " + arr[i].getNome());
        }

        scan.close();
    }
}
