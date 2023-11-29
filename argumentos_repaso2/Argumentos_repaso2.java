package com.mycompany.argumentos_repaso2;

public class Argumentos_repaso2 {
    
    //Debe recibir varios argumentos numericos
    //suma dichos argumentos y multiplicalos 
    // por el numero de argumentos
    
    public static void main(String[] args) {
        
        //Forma 1
        int [] numeros = new int [args.length];
        int total = 0;
        for (int i =0;i<args.length;i++){
            numeros[i] = Integer.parseInt(args[i]);
            total += numeros [i];
        }
        total = total * numeros.length;
        
        System.out.println("Forma1 : "+total);
        //Forma 2
        int suma = 0;
        
        for (int i = 0;i<args.length;i++){
            suma+= Integer.parseInt (args[i]);
        }
        suma = suma* args.length;
        System.out.println("Forma 2: "+suma);
    }
}
