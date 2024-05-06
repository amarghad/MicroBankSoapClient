package ma.amarghad;

import ma.amarghad.proxy.Account;
import ma.amarghad.proxy.BankWS;
import ma.amarghad.proxy.MicroBankService;

import java.util.Scanner;

public class BankWSClient {
    public static void main(String[] args) {
        BankWS bankWS = new MicroBankService().getBankWSPort();
        System.out.println("Convertion du 1500£ en MAD :");
        System.out.println(bankWS.toMAD(1500));

        System.out.println("--------------------------------");
        System.out.println("Obtenir un compte [code = 5]");
        printAccount(bankWS.getAccount(5));

        System.out.println("--------------------------------");
        System.out.println("Afficher tous les comptes");
        bankWS.getAccounts().forEach(BankWSClient::printAccount);

    }

    public static void printAccount(Account account) {
        String accountStr = "Account{" +
                "code=" + account.getCode() +
                ", balance=" + account.getBalance() +
                ", date=" + account.getDate() +
                '}';

        System.out.println(accountStr);
    }
}