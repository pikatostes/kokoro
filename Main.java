public class Main {
     public static void main(String[] args) {
          int resultado = 0;
          String respuesta = "";
          String num1;
          String num2;
          int num1Int;
          int num2Int;

          System.out.println("*************************************");
          System.out.println("*            CALCULADORA            *");
          System.out.println("*************************************");
          System.out.println("*    Sumar         *     Restar     *");
          System.out.println("*    Multiplicar   *     Dividir    *");
          System.out.println("*************************************");
     
          System.out.print("Introduce una operación: ");
          respuesta = System.console().readLine();

          switch (respuesta) {
               case "sumar":
                    System.out.print("Introduce el primer número: ");
                    num1 = System.console().readLine();
     
                    System.out.print("Introduce el segundo número: ");
                    num2 = System.console().readLine();

                    if (num1.equals("tu") && num2.equals("yo")) {
                         System.out.println("*************************************");
                         System.out.println("*     Tú y yo, nace la perfección   *");
                         System.out.println("*           Duo dinámico            *");
                         System.out.println("*         Baby, tú piénsalo         *");
                         System.out.println("*    Tú y yo, somos un descontrol   *");
                         System.out.println("*           Mundo caótico           *");
                         System.out.println("*       Difícil la ecuación         *");
                         System.out.println("*************************************");
                    } else if (!num1.equals("tu") && !num2.equals("yo")) {
                         num1Int = Integer.parseInt(num1);
                         num2Int = Integer.parseInt(num2);
                         Sumar(num1Int, num2Int, resultado);
                    } else {
                         System.out.println("Valores introducidos no váidos");
                    }
               break;

               case "restar":
                    System.out.print("Introduce el primer número: ");
                    num1 = System.console().readLine();

                    System.out.print("Introduce el segundo número: ");
                    num2 = System.console().readLine();

                    if (num1.equals("tu") && num2.equals("yo")) {
                         System.out.println(num1+" - "+num2+" = "+"Seríamos dos mitades incompletas buscando la forma de volver a unirnos y completarnos de nuevo");
                    } else if (!num1.equals("tu") && !num2.equals("yo")) {
                         num1Int = Integer.parseInt(num1);
                         num2Int = Integer.parseInt(num2);
                         Restar(num1Int, num2Int, resultado);
                    } else {
                         System.out.println("Valores introducidos no váidos");
                    }
               break;

               case "multiplicar":
                    System.out.print("Introduce el primer número: ");
                    num1 = System.console().readLine();
     
                    System.out.print("Introduce el segundo número: ");
                    num2 = System.console().readLine();

                    if (num1.equals("tu") && num2.equals("yo")) {
                         System.out.println(num1+" * "+num2+" = "+"Nuestra conexión se eleva al infinito y más allá");
                    } else if (!num1.equals("tu") && !num2.equals("yo")) {
                         num1Int = Integer.parseInt(num1);
                         num2Int = Integer.parseInt(num2);
                         Multiplicar(num1Int, num2Int, resultado);
                    } else {
                         System.out.println("Valores introducidos no váidos");
                    }
               break;
               
               case "dividir":
                    System.out.print("Introduce el primer número: ");
                    num1 = System.console().readLine();
     
                    System.out.print("Introduce el segundo número: ");
                    num2 = System.console().readLine();
                    
                    if (num1.equals("tu") && num2.equals("yo")) {
                         System.out.println(num1+" / "+num2+" = "+"Te buscaría incansablemente la parte que me hace completo, porque sin ti mi vida está incompleta");
                    } else if (!num1.equals("tu") && !num2.equals("yo")) {
                         num1Int = Integer.parseInt(num1);
                         num2Int = Integer.parseInt(num2);
                         Dividir(num1Int, num2Int, resultado);
                    } else {
                         System.out.println("Valores introducidos no váidos");
                    }    
               break;

               case "batmovil":
                    System.out.println("***************************************");
                    System.out.println("*    Últimamente veo todo de colores   *");
                    System.out.println("*    Me dicen \"Oye, no te enamores\"    *");
                    System.out.println("*    Pero es que tú y yo por suerte    *");
                    System.out.println("*       Fluimos como los vapores       *");
                    System.out.println("*                                      *");
                    System.out.println("*      Y eso de ver está complicao     *");
                    System.out.println("*    No lo encuentras en ningún lao    *");
                    System.out.println("*     Y yo ni sé lo que me ha pasao    *");
                    System.out.println("*     Pero a mi alma tú has entrao     *");
                    System.out.println("****************************************");
               break;

               case "no quiero":
                    System.out.println("¿Ah, no? Vaya... ¿Entonces qué quieres hacer?");
                    String respuestaAlt = System.console().readLine();
                    if (respuestaAlt.equals("dibujar")) {
                         System.out.println("Así que quieres dibujar... Desgraciadamente solo puedes dibujar una cosa, ¡pero del tamaño que quieras!");
                         System.out.println("AVISO: Puede ser que la figura salga deforme según el tamaño introducido");
                         System.out.print("Introduce el mensaje a mostrar dentro del corazón: ");
                         String message = System.console().readLine();

                         System.out.print("Introduce el tamaño del corazón: ");
                         int n = Integer.parseInt(System.console().readLine());

                         dibujarCorazonMensaje(message, n);
                    } else {
                         System.out.println("Esa operación no es válida");
                    }
               break;

               default:
                    System.out.println("Operación incorrecta");
               break;
          }
     }



     // FUNCIONES
     public static void Sumar(int num1, int num2, int resultado) {
          resultado = num1 + num2;
          System.out.println(num1+" + "+num2+" = "+resultado);
     }
     public static void Restar(int num1, int num2, int resultado) {
          resultado = num1 - num2;
          System.out.println(num1+" - "+num2+" = "+resultado);
     }
     public static void Multiplicar(int num1, int num2, int resultado) {
          resultado = num1 * num2;
          System.out.println(num1+" * "+num2+" = "+resultado);
     }
     public static void Dividir(int num1, int num2, int resultado) {
          resultado = num1 / num2;
          System.out.println(num1+" / "+num2+" = "+resultado);
     }

     public static void dibujarCorazon(int tamaño) {
          final int N = tamaño;
      
          for (int i = 0; i < N; i++) {
              for (int j = 0; j <= 4 * N; j++) {
                  double d1 = Math.sqrt(Math.pow(i - N, 2) + Math.pow(j - N, 2));
                  double d2 = Math.sqrt(Math.pow(i - N, 2) + Math.pow(j - 3 * N, 2));
      
                  if (d1 < N + 0.5 || d2 < N + 0.5) {
                      System.out.print('*');
                  } else {
                      System.out.print(' ');
                  }
              }
              System.out.print(System.lineSeparator());
          }
      
          for (int i = 1; i < 2 * N; i++) {
              for (int j = 0; j < i; j++) {
                  System.out.print(' ');
              }
      
              for (int j = 0; j < 4 * N + 1 - 2 * i; j++) {
                  System.out.print('*');
              }
      
              System.out.print(System.lineSeparator());
          }
     }
     
     public static void dibujarCorazonMensaje(String message, int n) {
          for (int i = 0; i < n; i++) {
               for (int j = 0; j <= 4 * n; j++) {
                   double d1 = Math.sqrt(Math.pow(i - n, 2) + Math.pow(j - n, 2));
                   double d2 = Math.sqrt(Math.pow(i - n, 2) + Math.pow(j - 3 * n, 2));
   
                   if (d1 < n + 0.5 || d2 < n + 0.5) {
                       System.out.print('*');
                   } else {
                       System.out.print(' ');
                   }
               }
               System.out.print(System.lineSeparator());
           }
   
           for (int i = 1; i < 2 * n; i++) {
               for (int j = 0; j < i; j++) {
                   System.out.print(' ');
               }
   
               for (int j = 0; j < 4 * n + 1 - 2 * i; j++) {
                   if (i >= 2 && i <= 4) {
                       int idx = j - (4 * n - 2 * i - message.length()) / 2;
                       if (idx < message.length() && idx >= 0) {
                           if (i == 3) {
                               System.out.print(message.charAt(idx));
                           } else {
                               System.out.print(' ');
                           }
                       } else {
                           System.out.print('*');
                       }
                   } else {
                       System.out.print('*');
                   }
               }
               System.out.print(System.lineSeparator());
           }
       }
      
}