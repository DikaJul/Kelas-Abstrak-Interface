public class InterfaceMain {
    public static void main(String[] args) {
        Autentikasi sistem = new SistemLogin();

        sistem.login("admin", "1234");
        sistem.logout();
    }
}