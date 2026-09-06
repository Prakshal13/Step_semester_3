package oop.assigment_problems;

class Payment {
    void pay(double amount) {
        System.out.println("Paid (cash): Rs " + amount);
    }
}

class CardPayment extends Payment {
    void payWithProcessingFee(double amount) {
        double total = amount * 1.02;
        System.out.println("Charged (card, incl. fee): Rs " + total);
    }
}

public class A5_CanteenPayment {

    static double totalCollected = 0;

    static void processTransaction(Payment payment, double amount) {
        if (payment instanceof CardPayment) {
            CardPayment card = (CardPayment) payment;
            card.payWithProcessingFee(amount);
            totalCollected += amount * 1.02;
        } else {
            payment.pay(amount);
            totalCollected += amount;
        }
    }

    public static void main(String[] args) {
        Payment[] payments = {
            new CardPayment(),
            new Payment(),
            new CardPayment(),
            new Payment(),
            new CardPayment()
        };

        double[] amounts = {
            100,
            50,
            200,
            75,
            120
        };

        for (int i = 0; i < payments.length; i++) {
            processTransaction(payments[i], amounts[i]);
        }

        System.out.printf("Total Collected: Rs %.1f%n", totalCollected);
    }
}
