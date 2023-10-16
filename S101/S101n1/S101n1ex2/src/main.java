public class main {
    public static void main(String[] args) {


        Cotxe c1 = new Cotxe("i20");


        //invocar mètode no static
        c1.accelerar();

        //invocar mètode static
        Cotxe.frenar();
    }
}
