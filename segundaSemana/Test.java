/**
 * Created by gbene on 28/8/2017.
 */
public class Test {
    public static void main(String[] args) {
        Auto2 a = new Auto2();
        a.rpm = 2000;
        a.cambio = 2;
        System.out.println(a);
        a.meterCambio(1);
        System.out.println(a);
        a.acelerar();
        a.acelerar();
        a.acelerar();
        a.acelerar();
        a.acelerar();
        System.out.println(a);
        a.meterCambio(2);
        System.out.println(a);
        a.cambio = 8;
        System.out.println(a);
        a.meterCambio(8);
        System.out.println(a);
    }


}

class Auto2 {
    //esconder estos atributos, y corregir el código que accede directamente
    int rpm;
    int cambio;
    int velocidad;

    //crear un método que muestre por pantalla la velocidad en forma de
    //kilometos/hora
    //
    //aprovechar ese método en el toString()
    public void calcularVelocidad() {
        if (cambio == 1) {
            this.velocidad = this.rpm / 100;
        } else if (cambio == 2){
            this.velocidad = this.rpm / 70;
        } else {
            this.velocidad = 300000;
        }
    }

    public void acelerar() {
        this.rpm += 100;
        calcularVelocidad();
    }

    public void meterCambio(int cambio) {
        this.cambio = cambio;
        calcularVelocidad();
    }

    @Override
    public String toString() {
        return "Auto2{" +
                "rpm=" + rpm +
                ", cambio=" + cambio +
                ", velocidad=" + velocidad +
                '}';
    }
}
