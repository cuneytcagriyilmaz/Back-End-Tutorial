package Applications.SigortaYonetimSistemi;

import Applications.SigortaYonetimSistemi.business.AccountManager;
import Applications.SigortaYonetimSistemi.exceptions.InvalidAuthenticationException;

public class Main {

    public static void main(String[] args) {

        AccountManager manager = new AccountManager();

        try {
            UserInput userInput = new UserInput(manager);
        } catch (InvalidAuthenticationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}