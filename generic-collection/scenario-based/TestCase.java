package scenario_based_real_wala;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class UnitTest {

    @Test
    public void Test_Deposit_ValidAmount() {
        Program account = new Program(1000.0);

        account.Deposit(500.0);

        assertEquals(1500.0, account.Balance, 0.0);
    }

    @Test
    public void Test_Deposit_NegativeAmount() {
        Program account = new Program(1000.0);

        Exception exception = assertThrows(
                Exception.class,
                () -> account.Deposit(-200.0)
        );

        assertEquals("Deposit amount cannot be negative", exception.getMessage());
    }

    @Test
    public void Test_Withdraw_ValidAmount() {
        Program account = new Program(1000.0);

        account.Withdraw(400.0);

        assertEquals(600.0, account.Balance, 0.0);
    }

    @Test
    public void Test_Withdraw_InsufficientFunds() {
        Program account = new Program(500.0);

        Exception exception = assertThrows(
                Exception.class,
                () -> account.Withdraw(800.0)
        );

        assertEquals("Insufficient funds.", exception.getMessage());
    }
}
