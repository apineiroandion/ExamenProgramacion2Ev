public class Main {
    public static void main(String[] args) {
        ForniteManager fm = new ForniteManagerImpl();
        fm.agregarArma(new Arma("hola", 15));
        Menu.pintarMenu(fm);
    }
}
