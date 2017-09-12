public class Polimorfismo {
    public static void main(String[] args) {
        Object o = new Object();
        Corredor c = new Corredor("Speedy", "Gonzalez", 0);
        //Object test = c;
        
        System.out.println(o);
        System.out.println(o.getClass());
        
        System.out.println("hago o = c, es decir object = corredor");
        //System.out.println(c);
        o = c;
        System.out.println(o);
        System.out.println(o.getClass());
        
    }
}

class Corredor {
    String nombre;
    String apellido;
    int ubicacion;
    int velocidad;
    boolean lesionado;
    
    public void acelerar() {
        if (lesionado) {
            
        } else {
            velocidad++;
            if (velocidad > 23) {
                System.out.println("Ouch me lesioné *se arrastra como gusano en el piso*");
                lesionado = true;
                velocidad = 0;
            }
            ubicacion();
        }
    }
    
    public void ubicacion() {
        if (lesionado) {
            System.out.println("No me muevo porque no puedo, espero la ambulancia");
        } else {
            ubicacion += velocidad;
        }
    }

    //@Override
    //public String toString() {
    //    return "Corredor{" + "nombre=" + nombre + ", apellido=" + apellido + ", ubicaci\u00f3n=" + ubicacion + ", velocidad=" + velocidad + '}';
    //}

    public Corredor(String nombre, String apellido, int ubicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ubicacion = ubicacion;
    }
    
    
}
