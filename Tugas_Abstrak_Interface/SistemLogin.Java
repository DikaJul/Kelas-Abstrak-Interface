public class SistemLogin implements Autentikasi {
    private String userLogin;

    @Override
    public boolean login(String username, String password) {
        if (username.equals("admin") && password.equals("1234")) {
            userLogin = username;
            System.out.println("Login berhasil sebagai " + username);
            return true;
        } else {
            System.out.println("Login gagal");
            return false;
        }
    }

    @Override
    public void logout() {
        System.out.println("User " + userLogin + " telah logout.");
        userLogin = null;
    }
}