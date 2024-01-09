package LoginSystem;

public class Main {
    IDandPassword iDandPassword = new IDandPassword();

    LoginPage loginPage = new LoginPage(iDandPassword.getLoginInfo());
}
