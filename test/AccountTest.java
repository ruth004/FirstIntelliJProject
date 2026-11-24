

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class AccountTest{
    private Account account;

    @BeforeEach
    public void Account(){
        this.account = new Account();
        account.setAccountName("RuthBigBaby");
        account.setAccountPin(1234);
    }
            @Test
            public void AccountBalance_currentBalance_AtZero(){

        Assertions.assertEquals(0, account.getBalance());
            }

            @Test
            public void AccountBalanceIsZero_500AddedToAccount_AccountBalanceIs500(){
                account.accountDeposit(5000);
                assertEquals(5000, account.getBalance());
            }

            @Test
            public void AccountBalanceIs500_200IsWithdrawed_BalanceIs300(){
                account.accountDeposit(500);
                account.withdraw(200);
                assertEquals(300, account.getBalance());
            }

    @Test
   public void testInitialBalance() {

        assertEquals(0, account.getBalance());
    }

    @Test
    public void testDeposit() {
        account.accountDeposit(5000);

        assertEquals(5000, account.getBalance());
    }

    @Test
    public void testMultipleDeposits() {
        account.accountDeposit(5000);
        account.accountDeposit(3000);

        assertEquals(8000, account.getBalance());
    }

    @Test
   public void testNegativeDeposit() {
        account.accountDeposit(-500);

        assertEquals(0, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        account.accountDeposit(5000);

        account.withdraw(2000);

        assertEquals(3000, account.getBalance());
    }

    @Test
    public void testWithdrawMoreThanBalance() {
        account.accountDeposit(5000);

        account.withdraw(7000);

        assertEquals(5000, account.getBalance());
    }

    @Test
    public void testNegativeWithdrawal() {
        account.accountDeposit(5000);

        account.withdraw(-1000);

        assertEquals(5000, account.getBalance());
    }
}



