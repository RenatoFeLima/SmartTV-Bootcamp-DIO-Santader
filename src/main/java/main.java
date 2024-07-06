public class main {

    public static void main(String[] args) {

        SmartTV tv = new SmartTV();

        tv.mostrarEstado();
        tv.ligar();
        tv.aumentarVolume();
        tv.mudarCanal(5);
        tv.mostrarEstado();
    }

}
