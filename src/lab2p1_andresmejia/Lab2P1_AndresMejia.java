// Andres Mejia
package lab2p1_andresmejia;
import java.util.Scanner;


public class Lab2P1_AndresMejia {

    
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("");
            System.out.println("********* MENU **********");
            System.out.println("Opcion 1: Ejercicio 1 ");
            System.out.println("Opcion 2: Ejercicio 2 ");
            System.out.println("Opcion 3: Ejercicio 3 ");
            System.out.println("Opcion 4: Sale del programa. ");
            System.out.println("Ingrese la opcion que desea: ");
            opcion=read.nextInt();
            
            if (opcion==1){
                int a,b, menor, mayor,a1,b1;
                System.out.println("Ingrese el valor de a: ");
                a=read.nextInt();
                System.out.println("Ingrese el valor de b: ");
                b=read.nextInt();
                a1=a;
                b1=b;
                if (a>0 && b>0){
                    
                    while(a!=b){
                        if (a>b){
                            a=a-b;
                        }
                        if(b>a){
                            b=b-a;
                        }  
                    }
                    System.out.println("El MCD de "+a1+"y "+b1+" es: "+b);
                }
                else {
                    System.out.println("Los numeros ingresados deben ser positivos. ");
                }
                
            }
            
            if (opcion==2){
                double n,suma;
                int k;
                
                suma=0;
                n=1;
                System.out.println("Ingrese el valor de k: ");
                k=read.nextInt();
                
                while(n<=k){
                    suma=Math.pow(n/(n+1), n)+suma;
                    n++;
                    
                }
                System.out.println("Output: "+suma);
                
            }
            
            if (opcion==3){
                int cliente, cantidad;
                double precio, totalbruto, totalfinal;
                System.out.println("Ingrese el tipo de cliente: ");
                cliente=read.nextInt();
                System.out.println("Ingrese el precio por unidad: ");
                precio=read.nextDouble();
                System.out.println("Ingrese la cantidad de producto que lleva: ");
                cantidad=read.nextInt();
                
                if (cliente==0){
                    if (cantidad>=10 && cantidad<=19){
                        cantidad=cantidad-2;
                        totalbruto=cantidad*precio;
                        totalfinal=totalbruto;
                        System.out.println("El total que debe pagar es: "+totalfinal);   
                    }
                    
                    if (cantidad>20){
                        cantidad=cantidad-5;
                        totalbruto=cantidad*precio;
                        totalfinal=totalbruto; 
                        System.out.println("El total que debe pagar es: "+totalfinal); 
                    }
                    else{
                        totalbruto=cantidad*precio;
                        totalfinal=totalbruto;
                        System.out.println("El total que debe pagar es: "+totalfinal); 
                    }
                }
                
                if(cliente==1){
                    if(cantidad>=20 && cantidad<=29){
                        cantidad=cantidad-2;
                        totalbruto=cantidad*precio;
                        totalfinal=totalbruto*0.9;
                        System.out.println("El total que debe pagar es: "+totalfinal);
                        System.out.println("La cantidad de productos gratis es 2. ");
                    }
                    if(cantidad >30){
                        cantidad=cantidad-5;
                        totalbruto=cantidad*precio;
                        totalfinal=totalbruto*0.9;
                        System.out.println("El total que debe pagar es: "+totalfinal);
                        
                    }
                    else{
                        totalbruto=cantidad*precio;
                        totalfinal=totalbruto*0.9;
                        System.out.println("El total que debe pagar es: "+totalfinal);
                    }
                }
                
                if(cliente==2){
                    if(cantidad>=30 && cantidad<=39){
                        cantidad=cantidad-2;
                        totalbruto=cantidad*precio;
                        totalfinal=totalbruto*0.7;
                        System.out.println("El total que debe pagar es: "+totalfinal);
                    }
                    if(cantidad>40){
                        cantidad=cantidad-5;
                        totalbruto=cantidad*precio;
                        totalfinal=totalbruto*0.7;
                        System.out.println("El total que debe pagar es: "+totalfinal);
                    }
                    else {
                        totalbruto=cantidad*precio;
                        totalfinal=totalbruto*0.7;
                        System.out.println("El total que debe pagar es: "+totalfinal);
                    }
                }
                
                
            }
            
        } while(opcion!=4);
    
    }
    
}
