package introduction;

import java.util.function.BinaryOperator;

/**
 * Create on 2021/3/29
 *
 * @author bowenzhang
 */
public class Payment {

    public final CreditCard creditCard;
    public final int amount;

    public Payment(CreditCard creditCard, int amount) {
        this.creditCard = creditCard;
        this.amount = amount;
    }

    public Payment combine(Payment payment) {
        if (creditCard.equals(payment.creditCard)) {
            return new Payment(creditCard, amount + payment.amount);
        } else {
            throw new IllegalStateException("Cards don't match.");
        }
    }

    public static class PaymentCombineBinaryOperator implements BinaryOperator<Payment> {

        @Override
        public Payment apply(Payment payment1, Payment payment2) {
            return this.combine(payment1, payment2);
        }

        Payment combine(Payment payment1, Payment payment2) {
            if (payment1.creditCard.equals(payment2.creditCard)) {
                return new Payment(payment1.creditCard, payment1.amount + payment2.amount);
            } else {
                throw new IllegalStateException("Cards don't match.");
            }
        }
    }
}
