public class User implements Observer {

    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String message) {
        System.out.println(userName+" - Mensaje recibido: " + message);
    }
}
