import presentation.AuthView;
import utils.DataConnectionManager;

public class Main {
    public static void main(String[] args) {
        if (DataConnectionManager.openConnect() != null) {
            System.out.println("Kết nối thành công!");

            AuthView authView = new AuthView();

            authView.displayAuthMenu();
        } else {
            System.err.println("Không thể kết nối");
        }

        DataConnectionManager.openConnect();
    }
}