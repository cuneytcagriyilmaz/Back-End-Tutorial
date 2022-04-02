package Applications.SigortaYonetimSistemi;

import java.util.Scanner;

import Applications.SigortaYonetimSistemi.business.AccountManager;
import Applications.SigortaYonetimSistemi.entities.abstracts.Account;
import Applications.SigortaYonetimSistemi.exceptions.InvalidAuthenticationException;

public class UserInput {

    Scanner sc;

    public UserInput(AccountManager accountManager) throws InvalidAuthenticationException {
        this.sc = new Scanner(System.in);

        System.out.print("Email: ");
        String email = sc.next();

        System.out.print("Password: ");
        String password = sc.next();

        Account a = accountManager.login(email, password);

    }
}