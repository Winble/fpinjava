package introduction;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Create on 2021/3/28
 *
 * @author bowenzhang
 */
public class Test {

    @FunctionalInterface
    public interface Payment {
//        public final CreditCard creditCard;
//        public final int amount;

//        default Payment(CreditCard creditCard, int amount) {
//            this.creditCard = creditCard;
//            this.amount = amount;
//        }

        Payment combine(Payment payment);
    }

//    public static class ConcretePayment {
//        public final CreditCard creditCard;
//        public final int amount;
//
//        public ConcretePayment(CreditCard creditCard, int amount) {
//            this.creditCard = creditCard;
//            this.amount = amount;
//        }
//
//        public ConcretePayment combine(ConcretePayment payment) {
//            if (creditCard.equals(payment.creditCard)) {
//                return new ConcretePayment(creditCard, amount + payment.amount);
//            } else {
//                throw new IllegalStateException("Cards dont't match.");
//            }
//        }
//    }
//
//    public static class PaymentReducer implements BinaryOperator<ConcretePayment> {
//
//        @Override
//        public ConcretePayment apply(ConcretePayment concretePayment1, ConcretePayment concretePayment2) {
//            return concretePayment1.combine(concretePayment2);
//        }
//    }
//
//    public static class CreditCard {
//
//    }
//
//    public static List<ConcretePayment> groupByCard(List<ConcretePayment> payments) {
//        return payments.stream()
//            .collect(Collectors.groupingBy(x -> x.creditCard))
//            .values()
//            .stream()
//            .map(x -> x.stream().reduce(ConcretePayment::combine))
//            .map(Optional::get)
//            .collect(Collectors.toList());
//    }
//
//    public static void main(String[] args) {
//        CreditCard creditCard1 = new CreditCard();
//        CreditCard creditCard2 = new CreditCard();
//        ConcretePayment payment1 = new ConcretePayment(creditCard1, 1);
//        ConcretePayment payment2 = new ConcretePayment(creditCard1, 2);
//        ConcretePayment payment3 = new ConcretePayment(creditCard2, 3);
//        List<ConcretePayment> totalPayment = Arrays.asList(payment1, payment2, payment3);
//        totalPayment = groupByCard(totalPayment);
//        totalPayment.forEach(x -> System.out.println(x.amount));
//    }
}