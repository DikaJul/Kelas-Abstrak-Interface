public interface Autentikasi {
    boolean login(String username, String password);
    void logout();
}
