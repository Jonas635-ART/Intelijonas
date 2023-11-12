package Semana01.Arrays;
// array
public class Ejemplo1 {
   public static void main(String[] args) {
      int[] values = new int[5];
      //cambio de posicion
      values[0] = 12;
      values[1] = 2;
      values[2] = 87;
      values[3] = 15;
      values[4] = 72;
      System.out.println(values[4]);
      System.out.println("------New-----Date----");
      for(int i =0; i<5; i++){
         System.out.println(values[i]);
      }
      int a = 7;
      int[] values2 = new int[a];
      int size = values2.length;
      values2[0] =21;
      values2[1] = 13;
      values2[2] = 45;
      values2[3] = 64;
      values2[4] = 87;
      values2[5] = 132;
      values2[6] =10093;
      System.out.println("-----new------");
      System.out.println(values2[2]);
      System.out.println(values2[4]);
      System.out.println(values2[6]);

   }
}
