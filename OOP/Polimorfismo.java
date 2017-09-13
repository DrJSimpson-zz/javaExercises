public class Polimorfismo {
    public static void main(String[] args) {
        Object o = new Object();
        Corredor c = new Corredor("Speedy", "Gonzalez", 0);
        //Object test = c;
        
        System.out.println(o);
	//El método getClass, me devuelve NO EL TIPO DE LA VARIABLE DE
	//REFERENCIA, SINO EL TIPO DEL OBJETO al que me estoy refiriendo
        System.out.println(o.getClass());
	//Object
        
        System.out.println("hago o = c, es decir object = corredor");
        //System.out.println(c);
	//Esto se puede lograr gracias a que en Java, todas las clases heredan
	//de la clase object
        o = c;
        System.out.println(o);
	//Corredor.toString()
        System.out.println(o.getClass());
	//La clase mostrada es Corredor
        
    }
}

//Defino una clase Corredor con cierto comportamiento
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
                System.out.println("Ouch me lesionÃ© *se arrastra como gusano en el piso*");
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


    //Está comentado, pero la única sobreescritura que realizo es al métood
    //toString() de la clase Object
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
