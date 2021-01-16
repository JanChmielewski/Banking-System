package pl.janchmielewski;

import java.util.Random;

public class AccountNumberGenerator {

    public String generateAccountNumber() {

        Random random = new Random(System.currentTimeMillis());

        StringBuilder accountNumber = new StringBuilder();

        for (int i = 0; i < 12; i++) {
            int number = random.nextInt(10);
            accountNumber.append(number);
        }

        return accountNumber.toString();
    }

}
