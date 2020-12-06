public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        //Set an integer array consisting of elements 0 and 1. for Example: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // Use the loop and condition to replace 0 with 1, 1 with 0;
        int[] array = {1, 0, 0, 1, 1, 0, 1, 1, 1, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(" Finished N.1 ");

        //Set an empty integer array of size 8. use the loop to fill it with the values 0 3 6 9 12 15 18 21;
        int[] arraySec = new int[8];
        for (int a = 1, b = 0; a < arraySec.length; a++) arraySec[a] = b += 3;
//
//        for(int r : arraySec)
//            System.out.println(r);
//
        for (int i = 0; i < arraySec.length; i++) {
            System.out.println(arraySec[i]);
        }
        //Set an array [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] go through it in a loop,
        // and multiply numbers less than 6 by 2;
        int[] arrayTh = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int w = 0; w < arrayTh.length; w++) {
            if (arrayTh[w] < 6) {
                arrayTh[w] = arrayTh[w] * 2;
                System.out.println(arrayTh[w]);
            }
        }


        //Create a square two-dimensional integer array (the number of rows and columns is the same),
        // and use the loop (s) to fill its diagonal elements with units/1;
        System.out.println("Ass 4");
        int[][] square = new int[4][4];
        for (int i = 0; i < square.length; i++) {
            for (int f = 0; f < square.length; f++){
                if (i == f || i == ((square.length - 1) - f)) square[i][f] = 1;
                else square[i][f] = 0;
                System.out.print(square [i] [f] + " " );
            }
              System.out.print("\n");

        }
        System.out.println("FINISHED N.4");
        int [] arrayJ = {1,3,4,56,34,-50};
        int min = arrayJ[0];
            for(int i=0; i< arrayJ.length; i++){
                if(arrayJ[i]<min){
                    min=arrayJ[i];

                }
            }
        System.out.println(min);
        int max = arrayJ[0];
        for(int i=0; i< arrayJ.length; i++){
            if(arrayJ[i]>max) {
                max=arrayJ[i];

            }
        }
        System.out.println(max);
    }
}