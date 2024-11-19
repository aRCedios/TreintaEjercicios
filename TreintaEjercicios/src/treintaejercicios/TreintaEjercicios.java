package treintaejercicios;
//Autor: Daniel Arce
import java.util.*;
public class TreintaEjercicios {
    public static void main(String[] args) {
        System.out.println("1. Escribir un programa en Java que imprima por pantalla la frase: Hola, ya se imprimir frases.");
        System.out.println("2. Escribir un programa en Java que imprima por pantalla un numero entero, por ejemplo el 273, o el 597.");
        System.out.println("3. Escribir un programa en Java que imprima por pantalla un numero decimal, por ejemplo el 5.3, ó el 7.5.");
        System.out.println("4. Escribir un programa en Java que imprima por pantalla la suma de 1234 y 532.");
        System.out.println("5. Escribir un programa en Java que imprima por pantalla la resta de 1234 y 532.");
        System.out.println("6. Escribir un programa en Java que imprima por pantalla la multiplicacion de 1234 y 532.");
        System.out.println("7. Escribir un programa en Java que imprima por pantalla la division de 1234 y 532.");
        System.out.println("8. Escribir un programa en Java que imprima por pantalla los numeros del 1 al 3.");
        System.out.println("9. Escribir un programa en Java que imprima por pantalla los numeros del 1 al 9.");
        System.out.println("10. Escribir un programa en Java que imprima por pantalla los numeros del 1 al 10000.");
        System.out.println("11. Escribir un programa en Java que imprima por Systempantalla los numeros del 5 al 10.");
        System.out.println("12. Escribir un programa en Java que imprima por pantalla los numeros del 5 al 15.");
        System.out.println("13. Escribir un programa en Java que imprima por pantalla los numeros del 5 al 15000.");
        System.out.println("14. Escribir un programa en Java que imprima 200 veces la palabra 'hola'.");
        System.out.println("15. Escribir un programa en Java que imprima por pantalla los cuadrados de los 30 primeros numeros naturales.");
        System.out.println("16. Escribir un programa en Java que multiplique los 20 primeros número naturales (1*2*3*4*5...).");
        System.out.println("17. Escribir un programa en Java que sume los cuadrados de los cien primeros números naturales, mostrando el resultado en pantalla.");
        System.out.println("18. Escribir un programa en Java que lea un número entero desde teclado y realiza la suma de los 100 número siguientes, mostrando el resultado en pantalla."); 
        System.out.println("19. Escribir un programa en Java que convierta de euros a dolares. Recibira un numero decimal correspondiente a la cantidad en euros y contestara con la cantidad correspondiente en dolares.");
        System.out.println("20. Escribir un programa en Java que calcule el area de un rectangulo del cual se le proporcionara por el teclado su altura y anchura (números decimales).");
        System.out.println("21. Escribir un programa en Java que lea dos numeros del teclado y diga cual es el mayor y cual el menor.");
        System.out.println("22. Escribir un programa en Java que lea un numero entero por el teclado e imprima todos los numeros impares menores que el.");
        System.out.println("23. Implemente el algoritmo de Euclides para encontrar el gcd de dos número leídos desde teclado.");
        System.out.println("24. Escriba un programa que lea los coeficientes a, b y c de una ecuación de segundo, y estudie si tiene o no solución. En caso positivo, las soluciones se calcularán e imprimirán en pantalla.");
        //aquí falta el 25
        System.out.println("26. Escriba un programa que lea tres numeros enteros positivos, y que calcule e imprima en pantalla el menor y el mayor de todos ellos.");
        System.out.println("27. Escriba un programa que lea temperaturas expresadas en grados Fahrenheit y las convierta a grados Celsius mostrándola. El programa finalizará cuando lea un valor de temperatura igual a 999. La conversión de grados Farenheit (F) a Celsius (C) está dada por C = 5/9(F − 32).");
        System.out.println("31. Salir.");   
        while(true){
            Scanner a = new Scanner(System.in);
            int s = a.nextInt();
            switch(s){
                case 1:
                    System.out.println("1. Escribir un programa en Java que imprima por pantalla la frase: Hola, ya se imprimir frases.");
                    TreintaEjercicios.ejercicio1();
                break;
                case 2:
                    System.out.println("2. Escribir un programa en Java que imprima por pantalla un numero entero, por ejemplo el 273, o el 597.");
                    System.out.println(TreintaEjercicios.ejercicio2());
                break;
                case 3: 
                    System.out.println("3. Escribir un programa en Java que imprima por pantalla un numero decimal, por ejemplo el 5.3, o el 7.5.");
                    System.out.println(TreintaEjercicios.ejercicio3());
                break;
                case 4:
                    System.out.println("4. Escribir un programa en Java que imprima por pantalla la suma de 1234 y 532.");
                    System.out.println(TreintaEjercicios.ejercicio4());
                break;
                case 5: 
                    System.out.println("5. Escribir un programa en Java que imprima por pantalla la resta de 1234 y 532.");
                    System.out.println(TreintaEjercicios.ejercicio5());
                break;
                case 6: 
                    System.out.println("6. Escribir un programa en Java que imprima por pantalla la multiplicacion de 1234 y 532.");
                    System.out.println(TreintaEjercicios.ejercicio6());
                break;
                case 7: 
                    System.out.println("7. Escribir un programa en Java que imprima por pantalla la division de 1234 y 532.");
                    System.out.println(TreintaEjercicios.ejercicio7());
                break;
                case 8: 
                    System.out.println("8. Escribir un programa en Java que imprima por pantalla los numeros del 1 al 3.");
                    TreintaEjercicios.ejercicio8();
                break;
                case 9: 
                    System.out.println("9. Escribir un programa en Java que imprima por pantalla los numeros del 1 al 9.");
                    TreintaEjercicios.ejercicio9();
                break;
                case 10: 
                    System.out.println("10. Escribir un programa en Java que imprima por pantalla los numeros del 1 al 10000.");
                    TreintaEjercicios.ejercicio10();
                break;
                case 11: 
                    System.out.println("11. Escribir un programa en Java que imprima por pantalla los numeros del 5 al 10.");
                    TreintaEjercicios.ejercicio11();
                break;
                case 12:
                    System.out.println("12. Escribir un programa en Java que imprima por pantalla los numeros del 5 al 15.");
                    TreintaEjercicios.ejercicio12();
                break;
                case 13: 
                    System.out.println("13. Escribir un programa en Java que imprima por pantalla los numeros del 5 al 15000.");
                    TreintaEjercicios.ejercicio13();
                break;
                case 14:
                    System.out.println("14. Escribir un programa en Java que imprima 200 veces la palabra 'hola'.");
                    TreintaEjercicios.ejercicio14();
                break;
                case 15: 
                    System.out.println("15. Escribir un programa en Java que imprima por pantalla los cuadrados de los 30 primeros numeros naturales.");
                    TreintaEjercicios.ejercicio15();
                break;
                case 16:
                    System.out.println("16. Escribir un programa en Java que multiplique los 20 primeros número naturales (1*2*3*4*5...).");
                    System.out.println("20! = "+TreintaEjercicios.ejercicio16());
                break;
                case 17: 
                    System.out.println("17. Escribir un programa en Java que sume los cuadrados de los cien primeros números naturales, mostrando el resultado en pantalla.");
                    System.out.println(TreintaEjercicios.ejercicio17());
                break;
                case 18:
                    System.out.println("18. Escribir un programa en Java que lea un número entero desde teclado y realiza la suma de los 100 número siguientes, mostrando el resultado en pantalla."); 
                    System.out.println("Ingrese un numero entero positivo: ");
                    int l = a.nextInt();
                    System.out.println("El resultado de la suma es: "+TreintaEjercicios.ejercicio18(l));
                break;
                case 19:
                    System.out.println("19. Escribir un programa en Java que convierta de euros a dolares. Recibira un numero decimal correspondiente a la cantidad en euros y contestara con la cantidad correspondiente en dolares.");
                    System.out.println("El cambio esta en: 1 euro = 1,0547 dolares, ingrese la cantidad de euros que tiene escribiendo los decimales con: ',' ");
                    double e = a.nextDouble();
                    System.out.println("Usted tiene: "+TreintaEjercicios.ejercicio19(e)+" dolares");
                break;
                case 20:
                    System.out.println("20. Escribir un programa en Java que calcule el area de un rectangulo del cual se le proporcionara por el teclado su altura y anchura (números decimales).");
                    System.out.println("Ingrese la base separando los decimales con ',': ");
                    double b = a.nextDouble();
                    System.out.println("Ingrese la altura separando los decimales con ',': ");
                    double c = a.nextDouble();
                    System.out.println("El area del rectangulo es: "+TreintaEjercicios.ejercicio20(b,c));
                break;
                case 21:
                    System.out.println("21. Escribir un programa en Java que lea dos numeros del teclado y diga cual es el mayor y cual el menor.");
                    System.out.println("Ingrese el primer numero separando los decimales con ',': ");
                    double f = a.nextDouble();
                    System.out.println("Ingrese el segundo numero separando los decimales con ',': ");
                    double g = a.nextDouble();
                    System.out.println("El mayor es: "+TreintaEjercicios.ejercicio21(f,g));
                break;
                case 22:
                    System.out.println("22. Escribir un programa en Java que lea un numero entero por el teclado e imprima todos los numeros impares menores que el.");
                    System.out.println("Ingrese un numero entero positivo: ");
                    double h = a.nextDouble();
                    TreintaEjercicios.ejercicio22(h);
                break;
                case 23:
                    System.out.println("23. Implemente el algoritmo de Euclides para encontrar el gcd de dos número leídos desde teclado.");
                    System.out.println("ingrese un numero entero positivo: ");
                    int m = a.nextInt();
                    System.out.println("ingrese un numero entero positivo: ");
                    int n = a.nextInt();
                    System.out.println("El maximo comun multiplo es: "+TreintaEjercicios.ejercicio23(m,n));

                break;
                case 24:
                    System.out.println("24. Escriba un programa que lea los coeficientes a, b y c de una ecuación de segundo, y estudie si tiene o no solución. En caso positivo, las soluciones se calcularán e imprimirán en pantalla.");
                    System.out.println("Ingrese un entero: ");
                    int ñ = a.nextInt();
                    System.out.println("Ingrese un entero: ");
                    int o = a.nextInt();
                    System.out.println("Ingrese un entero: ");
                    int p = a.nextInt();
                    TreintaEjercicios.ejercicio24(ñ,o,p);
                break;
                //aquí falta el 25
                case 26: 
                    System.out.println("26. Escriba un programa que lea tres numeros enteros positivos, y que calcule e imprima en pantalla el menor y el mayor de todos ellos.");
                    System.out.println("Ingrese el primer numero entero positivo: ");
                    int i = a.nextInt();
                    System.out.println("Ingrese el segundo numero entero positivo: ");
                    int j = a.nextInt();
                    System.out.println("Ingrese el tercer numero entero positivo: ");
                    int k = a.nextInt();
                    int [] mayorMenor = TreintaEjercicios.ejercicio26(i,j,k);
                    System.out.println("El numero mayor es: "+mayorMenor[0]);
                    System.out.println("El numero menor es: "+mayorMenor[1]);
                break;
                case 27:
                    System.out.println("27. Escriba un programa que lea temperaturas expresadas en grados Fahrenheit y las convierta a grados Celsius mostrándola. El programa finalizará cuando lea un valor de temperatura igual a 999. La conversión de grados Farenheit (F) a Celsius (C) está dada por C = 5/9(F − 32).");
                    double q = 0;
                    while(q!= 999){
                        System.out.println("Ingrese la temperatura en Fahrenheit: ");
                        q = a.nextInt();
                        System.out.println("La temperatura en celsius es: "+TreintaEjercicios.ejercicio27(q));
                    }
                break;
                case 31: 
                    System.out.println("31. Salir.");
                    System.out.println("Fin. ");
                    return;
                default: System.out.println("Ingrese una opcion valida.");
            }
            System.out.println("Siguiente opcion: ");
        }
    }
    
    public static void ejercicio1(){
        System.out.println("Hola, ya se imprimir frases.");
    }
    public static int ejercicio2(){
        int x = 273;
        return x;
    }
    public static float ejercicio3(){
        float x = 5.3f;
        return x;
    }
    public static int ejercicio4(){
        int x = 1234+532;
        return x;
    }
    public static int ejercicio5(){
        int x = 1234-532;
        return x;
    }
    public static int ejercicio6(){
        int x = 1234*532;
        return x;
    }
    public static double ejercicio7(){
        final float a = 1234f;
        final float b = 532f;
        double x = a/b;
        return x;
    }
    public static void ejercicio8(){
        for(int i = 1;i<4;i++){
            System.out.println(i);
        }
    }
    public static void ejercicio9(){
        for(int i = 1;i<10;i++){
            System.out.println(i);
        }
    }
    public static void ejercicio10(){
        for(int i = 1;i<10001;i++){
            System.out.println(i);
        }
    }
    public static void ejercicio11(){
        for(int i = 5;i<11;i++){
            System.out.println(i);
        }
    }
    public static void ejercicio12(){
        for(int i = 5;i<16;i++){
            System.out.println(i);
        }
    }
    public static void ejercicio13(){
        for(int i = 5;i<15001;i++){
            System.out.println(i);
        }
    }
    public static void ejercicio14(){
        for(int i = 1;i<201;i++){
            System.out.println(i+". Hola");
        }
    }
    public static void ejercicio15(){
        for(int i = 1;i<31;i++){
            System.out.println("El numero es: "+i+" Su cuadrado es: "+Math.pow(i,2));
        }
    }
    public static long ejercicio16(){
        long s = 1;
        for(int i = 1;i<21;i++){
            s *= i;
        }
        return s;
    }
    public static int ejercicio17(){
        int s = 0;
        for(int i = 1;i<101;i++){
            s += Math.pow(i,2);
        }
        return s;
    }
    public static int ejercicio18(int n){
        int s = 0;
        for (int i = n + 1; i <= n + 100; i++) { // así comienz desde 1 mayor a n y termina 100 numeros despues.
        s += i;
        }
        return s;
    }
    
    
    public static double ejercicio19(double x){
        double d = x*1.0547;
        return d;
    }
    public static double ejercicio20(double x, double y){
        double A = x*y;
        return A;
    }
    public static double ejercicio21(double x, double y){
        if(x>y){
            return x;
        }  
        return y;
    }
    public static void ejercicio22(double x){
        for(int i = 0; i<x;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    public static int ejercicio23(int x, int y){
        int r = 1;
        while (r != 0) {
            r = x % y; 
            x = y;
            y = r;
        }
    return x; 
    }
    public static void ejercicio24(int x, int y, int z){
        double a = Math.pow(y, 2)-4*x*z;
        if(a<0){
            System.out.println("No tiene solucion");
        }
        else{
            double r1 = (-y + Math.sqrt((Math.pow(y, 2))-4*x*z))/(2*x);
            double r2 = (-y - Math.sqrt((Math.pow(y, 2))-4*x*z))/(2*x);
            System.out.println("Las raices son: "+r1+" y "+r2);
        }  
    }
    //aquí falta el 25
    public static int[] ejercicio26(int x, int y, int z){
        int mayor= x, menor = x;
        if(y>mayor){
            mayor = y; 
        }
        if(y<menor){
            menor = y;
        }
        if(z>mayor){
            mayor = z; 
        }
        if(z<menor){
            menor = z;
        }
        int [] mayorMenor = new int[2];
        mayorMenor[0] = mayor;
        mayorMenor[1] = menor;
        return mayorMenor;
        
    }
    public static double ejercicio27(double x){
        double C = (5.0/9.0)*(x-32);// si pongo 5 y 9 hace division de enteros y no funciona bien.
        return C;
    }
}