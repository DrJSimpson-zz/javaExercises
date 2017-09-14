/**
 * Created by gbene on 13/9/2017.
 */
public class EjemploPoli3 {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.carteludear();

        AutoHover autoHover = new AutoHover();
        autoHover.carteludear();

        AutoANafta autoANafta = new AutoANafta();
        autoANafta.carteludear();
    }
}

class Auto {

    public final void carteludear() {
        System.out.println("HOLA MIREN MI AUTO " + encender() + " pone música a todo volumen");

    }

    public String encender() {
        return "Arrancando auto";
    }
}

class AutoHover extends Auto {
    @Override
    public String encender() {
        return "Empezando a flotar";
    }
}

class AutoANafta extends Auto{
    @Override
    public String encender() {
        return "Largando humo tóxico";
    }
}