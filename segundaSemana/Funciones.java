/**
 *
 * @author gbene
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(suma(1,2));
        System.out.println(suma(1,2,3));
        System.out.println(suma(3.7f, 3));
    }
    
    //Sobrecarga de funciones
    public static int suma(int a, int b) {
        System.out.println("Suma para dos int");
        return a + b;
    }
    
    //no puedo hace un procedimiento con una firma que ya existía
    //firma: nombre, cantidad y tipo de parametros
    /*public static int suma(int a, int c) {
        
    }*/
    
    //sobrecarga por cantidad de parametros 
    public static int suma(int a, int b, int c) {
        System.out.println("Suma para tres int");
        return a + b + c;
    }
    
    //no se puede hacer sobrecarga por tipo de retorno
    /*public static float suma(int a, int b) {
        
    }*/
    
    //sobrecarga cambiando un tipo parámetro
    public static int suma(float a, int b) {
        System.out.println("Sobrecarga por tipo de parametro");
        System.out.println("a antes de castear = " + a);
        System.out.println("a después de castear = " + (int)a);
        return (int)a  + b;
    }
}
