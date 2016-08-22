package tresenraya;

import java.util.Scanner;

public class TresEnRaya {

    public static void main(String[] args) {
        
            
        int[][] matriz= new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(0);
                
            }
            System.out.println();
            
        }
        
        
        int turno= 1;
        boolean gano= true;
        int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0;
        
        while(gano){
            if(turno==1){
                Scanner input= new Scanner(System.in);
                System.out.print("Ingrese fila: ");
                int fil= input.nextInt();
                Scanner in= new Scanner(System.in);
                System.out.print("Ingrese columna: ");
                int col= in.nextInt();
                
                if((fil-1)>2 || (col-1)>2 || (fil-1)<0 || (col-1)<0 ){
                    System.out.println("Coordenada fuera de rango");
                            
                }
                        
                for (int i = 0; i < 3; i++) {
                    cont1=0;
                    
                    for (int j = 0; j < 3; j++) {
                        
                        if(i==(fil-1) && j==(col-1) && matriz[i][j] == 0){
                            matriz[i][j]=turno;
                            for (int k = 0; k < 3; k++) {
                                for (int l = 0; l < 3; l++) {
                                    System.out.print(matriz[k][l]+" ");
                                }
                                System.out.println();
                            }
                            
                        }else if(i==(fil-1) && j==(col-1) && matriz[i][j] != 0){
                            System.out.println("Lugar de matriz ocupado!");
                            System.out.print("Ingrese fila: ");
                            Scanner inp= new Scanner(System.in);
                            System.out.print("Ingrese fila: ");
                            int fi= inp.nextInt();
                            Scanner inpu= new Scanner(System.in);
                            System.out.print("Ingrese columna: ");
                            int co= in.nextInt();
                            for (int f = 0; i < 3; i++) {
                                for (int c = 0; j < 3; j++) {
                                    if(i==fil && col==j && matriz[i][j] !=0)
                                        matriz[i][j]=turno;
                                    if(i==(fil-1) && j==(col-1) && matriz[i][j] == 1){
                                        matriz[i][j]=turno;
                                        for (int k = 0; k < 3; k++) {
                                            for (int l = 0; l < 3; l++) {
                                                System.out.print(matriz[k][l]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }   
                                }
                            }
                        }    
                        if(matriz[i][j]==1){
                            if(i==0)
                                cont1+= matriz[i][j];
                            //System.out.println(cont1);
                            if(i==1)
                                cont1+= matriz[i][j];
                            if(i==2)
                                cont1+= matriz[i][j];
                            if(j==2 && cont1 ==3){
                               gano=false;
                            }else if(j==2 && cont1 != 3)
                                cont1=0;
                        }
                        
                        
                    }
                    
                }
                cont2=0;
                cont3=0;
                cont4=0;
                cont5=0;
                cont6=0;
                
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if(j==0 && matriz[i][j]==1)
                            cont2+= matriz[i][j];
                        if(j==1 && matriz[i][j]==1)
                            cont3+= matriz[i][j];
                        if(j==2 && matriz[i][j]==1)
                            cont4+= matriz[i][j];
                        if(i==j && matriz[i][j]==1)
                            cont5+= matriz[i][j];
                        if(j==(3-i-1) && matriz[i][j]==1)
                            cont6+= matriz[i][j];
                    }
                }
                if(cont2==3 || cont3 == 3 || cont4==3 || cont5==3 || cont6==3)
                    gano=false;
                
                turno=2;
                
            }else{
                Scanner input= new Scanner(System.in);
                System.out.print("Ingrese fila: ");
                int fil= input.nextInt();
                Scanner in= new Scanner(System.in);
                System.out.print("Ingrese columna: ");
                int col= in.nextInt();
                
                if((fil-1)>2 || (col-1)>2 || (fil-1)<0 || (col-1)<0 ){
                    System.out.println("Coordenada fuera de rango");
                            
                }
                        
                for (int i = 0; i < 3; i++) {
                    cont1=0;
                    
                    for (int j = 0; j < 3; j++) {
                        
                        if(i==(fil-1) && j==(col-1) && matriz[i][j] == 0){
                            matriz[i][j]=turno;
                            for (int k = 0; k < 3; k++) {
                                for (int l = 0; l < 3; l++) {
                                    System.out.print(matriz[k][l]+" ");
                                }
                                System.out.println();
                            }
                            
                        }else if(i==(fil-1) && j==(col-1) && matriz[i][j] != 0){
                            System.out.println("Lugar de matriz ocupado!");
                            System.out.print("Ingrese fila: ");
                            Scanner inp= new Scanner(System.in);
                            System.out.print("Ingrese fila: ");
                            int fi= inp.nextInt();
                            Scanner inpu= new Scanner(System.in);
                            System.out.print("Ingrese columna: ");
                            int co= in.nextInt();
                            for (int f = 0; i < 3; i++) {
                                for (int c = 0; j < 3; j++) {
                                    if(i==fil && col==j && matriz[i][j]==2)
                                        matriz[i][j]=turno;
                                    if(i==(fil-1) && j==(col-1) && matriz[i][j] == 0){
                                        matriz[i][j]=turno;
                                        for (int k = 0; k < 3; k++) {
                                            for (int l = 0; l < 3; l++) {
                                                System.out.print(matriz[k][l]+" ");
                                            }
                                            System.out.println();
                                        }
                                    }   
                                }
                            }
                        }    
                        if(matriz[i][j]==2){
                            if(i==0)
                                cont1+= matriz[i][j];
                            //System.out.println(cont1);
                            if(i==1)
                                cont1+= matriz[i][j];
                            if(i==2)
                                cont1+= matriz[i][j];
                            if(j==2 && cont1 ==6){
                               gano=false;
                            }else if(j==2 && cont1 !=6)
                                cont1=0;
                        }
                        
                        
                    }
                    
                }
                cont2=0;
                cont3=0;
                cont4=0;
                cont5=0;
                cont6=0;
                
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if(j==0 && matriz[i][j]==2)
                            cont2+= matriz[i][j];
                        if(j==1 && matriz[i][j]==2)
                            cont3+= matriz[i][j];
                        if(j==2 && matriz[i][j]==2)
                            cont4+= matriz[i][j];
                        if(i==j && matriz[i][j]==2)
                            cont5+= matriz[i][j];
                        if(j==(3-i-1) && matriz[i][j]==2)
                            cont6+= matriz[i][j];
                    }
                }
                if(cont2 == 6 || cont3 == 6 || cont4 == 6 || cont5 == 6 || cont6 == 6)
                    gano=false;
                
                turno=1;
            
            }
                
            
            
        }
        if(turno==1)
            turno=2;
        else
            turno=1;
                  
        
        System.out.println("El ganador es Turno #"+turno);
    }    
}
