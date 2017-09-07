public class Objetos {
    public static void main(String[] args) {
        
    }
    
    public static void ejercicio1() {
        //utilizando esta estructura node, crear y mostrar por pantalla
        //la siguiente lista 1 -> 10 -> 23 -> 15
    }
    
    public static void tercerEjemplo() {
        //crea un objeto node con value = 1 y lo refencia con la variable n1
        //que es de tipo Node
        Node n1 = new Node(1);
        //crea un objeto node con value = 2 y lo referencia con la variable
        //next del objeto n1 que es del tipo Node
        n1.setNext(new Node(2));
        System.out.println(n1.getValue() + " " + n1.getNext().getValue());
        
        //ejemplo de lo que sucede al ser una estructura de datos recursiva
        //en algun momento, cuando algúno de los nodos de la cadena no tenga
        //inicializado (o instanciada la referencia al node next) voy a tener
        //un excepción de tipo null pointer
        n1.getNext().getNext().getNext().getNext().getNext();
    }
    
    public static void segundoEjemplo() {
        //al usar new se crea un objeto nuevo, y la variable n de tipo Node
        //hace referencia a este objeto nuevo
        Node n = new Node(3);
        System.out.println(n.getValue());
        //3
        n.setValue(15);
        System.out.println(n.getValue());
        //15
        
        //si intento mostrar el la referencia de next, para n
        System.out.println(n.getNext());
        //null
        
        //si intento ver el value que tiene n1.getNext() el programa falla
        System.out.println(n.getNext().getValue());
    }
    
    //ejemplo de métodos que funcionan a nivel de clase, y a nivel de instancia
    //comportamiento de Java al intentar utilizar un método de instancia
    //utilizando una variable de referencia queno está apuntando a un objeto
    public static void primerEjemplo() {
        //Node n = new Node(3);
        Node n = null;
        n.saludar();
        //Hola desde la clase!
        n.setValue(15);
        //exception por null pointer
        System.out.println(n.getValue());
        //exception por null pointer
        System.out.println(n.getNext());
        //exception por null pointer
    }
}

class Node {
    private int value;
    private Node next;

    //get significa obtener, por lo tanto este método permite obtener
    //el valor de un atributo de una instancia
    //accesor
    public int getValue() {
        return value;
    }

    //set significa establecer o cambiar, este método permite cambiar el estado
    //de un atributo de una instancia
    //mutador
    public void setValue(int value) {
        this.value = value;
    }
    
    //static es una palabra reservada que me permite crear métodos que funcionan
    //en la clase, y no son propios de ningún objeto creado con la misma
    public static void saludar() {
        //error! Las variables que no son estáticas no se pueden referenciar
        //desde un contexto estático!!!
        //this.value = 20;
        System.out.println("Holaa desde la clase!");
    }
    
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    //este constructor recibe un parámetro para inicializar el objeto
    //en un estado útil
    public Node(int value) {
        this.value = value;
    }
}

class Queue {
    
}
