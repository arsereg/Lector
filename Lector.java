import java.io.*;
import java.math.BigInteger;
import java.math.BigDecimal;

public class Leer {
    static PrintStream out = System.out;
    private static int proceso = 0;
    private static String ultimaLectura;
    
    static int Entero()throws java.io.IOException{
        boolean invalid = false;
        int resul = Integer.MIN_VALUE;
        String lectura = "";
        proceso = 1;
        do{
            try{
                invalid = false;
                lectura = in();
                resul = Integer.parseInt(lectura);
            }catch(Exception e){
                out.println();
                out.println("Error de lectura. Vuelva a intentarlo");
                invalid = true;
            }
        }while(invalid);
        ultimaLectura = lectura;
        return resul;
    }
    
    static String in()throws java.io.IOException{
        InputStreamReader buffer = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(buffer);
        String userInput = in.readLine();
        buffer = null;
        in = null;
        return userInput;
    }
    
    static short Short()throws java.io.IOException{
        boolean invalid = false;
        short resul = Short.MIN_VALUE;
        String lectura = "";
        proceso = 2;
        do{
            try{
                invalid = false;
                lectura = in();
                resul = Short.parseShort(lectura);
            }catch(Exception e){
                out.println();
                out.println("Error de lectura. Vuelva a intentarlo");
                invalid = true;
            }
        }while(invalid);
        ultimaLectura = lectura;
        return resul;
    }
    
    static long Long()throws java.io.IOException{
        boolean invalid = false;
        long resul = Long.MIN_VALUE;
        String lectura = "";
        proceso = 3;
        do{
            try{
                invalid = false;
                lectura = in();
                resul = Long.parseLong(lectura);
            }catch(Exception e){
                out.println();
                out.println("Error de lectura. Vuelva a intentarlo");
                invalid = true;
            }
        }while(invalid);
        ultimaLectura = lectura;
        return resul;
    }
    
    
    static double Double()throws java.io.IOException{
        boolean invalid = false;
        double resul = Double.MIN_VALUE;
        String lectura = "";
        proceso = 4;
        do{
            try{
                invalid = false;
                lectura = in();
                resul = Double.parseDouble(lectura);
            }catch(Exception e){
                out.println();
                out.println("Error de lectura. Vuelva a intentarlo");
                invalid = true;
            }
        }while(invalid);
        ultimaLectura = lectura;
        return resul;
    }
    
    static float Float()throws java.io.IOException{
        boolean invalid = false;
        float resul = Float.MIN_VALUE;
        String lectura = "";
        proceso = 5;
        do{
            try{
                invalid = false;
                lectura = in();
                resul = Float.parseFloat(lectura);
            }catch(Exception e){
                out.println();
                out.println("Error de lectura. Vuelva a intentarlo");
                invalid = true;
            }
        }while(invalid);
        ultimaLectura = lectura;
        return resul;
    }
    
    static String Texto()throws java.io.IOException{
        String resul = in();
        proceso = 6;
        ultimaLectura = resul;
        return resul;
    }
    
    static BigInteger EnteroInfinito()throws java.io.IOException{
        boolean invalid = false;
        BigInteger resul = BigInteger.ZERO;
        String lectura = "";
        proceso = 7;
        do{
            try{
                invalid = false;
                lectura = in();
                resul = new BigInteger(lectura);
            }catch(Exception e){
                out.println();
                out.println("Error de lectura. Vuelva a intentarlo");
                invalid = true;
            }
        }while(invalid);
        ultimaLectura = lectura;
        return resul;
    }
    
    static BigDecimal DecimalInfinito()throws java.io.IOException{
        boolean invalid = false;
        BigDecimal resul = BigDecimal.ZERO;
        String lectura = "";
        proceso = 8;
        do{
            try{
                invalid = false;
                lectura = in();
                resul = new BigDecimal(lectura);
            }catch(Exception e){
                out.println();
                out.println("Error de lectura. Vuelva a intentarlo");
                invalid = true;
            }
        }while(invalid);
        ultimaLectura = lectura;
        return resul;
    }
    
    static boolean Boolean()throws java.io.IOException{
        boolean invalid = false;
        boolean resul = false;
        proceso = 9;
        do{
            invalid = false;
            out.println();
            out.println("- Digite 1 para si");
            out.println("- Digite 2 para no");
            try{
                int eleccion = Integer.parseInt(in());
                if(eleccion < 0 || eleccion > 2){
                    out.println();
                    out.println("Eleccion invalida. Intentelo de nuevo");
                    invalid = true;
                }
                if(eleccion == 1){
                    resul = true;
                }else{
                    resul = false;
                }
            }catch(Exception e){
                out.println();
                out.println("Error de lectura. Vuelva a intentarlo");
                invalid = true;
            }
        }while(invalid);
        ultimaLectura = "" + resul;
        return resul;
    }
    
    public static String obtenerUltimaLectura(){
        String tipo = "";
        switch(proceso){
            case 1:
                tipo = "int";
                break;
            case 2:
                tipo = "short";
                break;
            case 3:
                tipo = "long";
                break;
            case 4:
                tipo = "double";
                break;
            case 5:
                tipo = "float";
                break;
            case 6:
                tipo = "texto";
                break;
            case 7:
                tipo = "BigInteger";
                break;
            case 8:
                tipo = "BigDecimal";
                break;
            case 9:
                tipo = "Boolean";
                break;
        }
        
        String resul = "Ultimo dato leido: " + ultimaLectura + "\nTipo de dato: " + tipo;
        return resul;
    }
    
}
