package Classes;

import Interfaces.Camera;
import Interfaces.Rellotge;

public class Smartphone extends Telefon implements Camera, Rellotge {


    public Smartphone(String marca, String model) {
        super(marca, model);
    }

    @Override
    public void fotografiar() {

        System.out.println("S’està fent una foto");

    }

    @Override
    public void alarma() {

        System.out.println("Està sonant l’alarma");

    }

    @Override
    public void trucar(String numero) {
        super.trucar(numero);
    }
}
