public class Main {
    public static void main(String[] args){
        int[] notas = new int[10];

        int[] notas1 = {8,10,5,9,8,7,5,6};

        notas[0] = 8;
        notas[1] = 9;

        System.out.println(notas[0]); //8
        System.out.println(notas[1]); //9

        for(int i = 0; i<notas1.length;i++) System.out.println(notas1[i]);

        for (int item:notas1) {
            System.out.println(item);
        }

        //notas1.binarySearch(notas1, 5); // binarySearch (nombreArray, valor a buscar) devuelve la posicion del valor

        //notas1.sort(notas1); // ordena los valores dentro del array
        System.out.println(notas1);

    }
    // compara arrays
    private void equals(int[] notas, int[] notas1) {
        if (notas == notas1){
            System.out.println("verdadero");
        }else{
            System.out.println("falso");
        }
    }
}