package introduction;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * Create on 2021/3/29
 *
 * @author bowenzhang
 */
public class CombinePayment {

    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard();
        CreditCard creditCard2 = new CreditCard();
        Payment payment1 = new Payment(creditCard1, 1);
        Payment payment2 = new Payment(creditCard1, 2);
        Payment payment3 = new Payment(creditCard2, 3);
        List<Payment> totalPayment = Arrays.asList(payment1, payment2, payment3);
        totalPayment = groupByCard(totalPayment);
        totalPayment.forEach(x -> System.out.println(x.amount));
    }

    static List<Payment> groupByCard(List<Payment> paymentList) {
        return paymentList.stream()
            .collect(Collectors.groupingBy(x -> x.creditCard))
            .values()
            .stream()
//            .map(x -> x.stream().reduce(new Payment.PaymentCombineBinaryOperator()))
            // anonymous class
//            .map(x -> x.stream().reduce(new BinaryOperator<Payment>() {
//                @Override
//                public Payment apply(Payment payment1, Payment payment2) {
//                    return payment1.combine(payment2);
//                }
//            }))
            // lambda
//            .map(x -> x.stream().reduce((payment1, payment2) -> payment1.combine(payment2)))
            // method reference
            .map(x -> x.stream().reduce(Payment::combine))
            .map(Optional::get)
            .collect(Collectors.toList());
    }
}
