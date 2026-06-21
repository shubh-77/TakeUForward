package com.oops.abstraction.interfaces;




interface PaymentGateway{
    public abstract void processPayment(double amount);
}

class CreditCardPayment implements PaymentGateway{

    public void processPayment(double amount){
        System.out.printf("Processing credit card payment of %.2f\n",amount);
    }

}


class UPIPayment implements PaymentGateway{

    public void processPayment(double amount){
        System.out.printf("Processing UPI payment of %.2f\n",amount);
    }

}

public class InterfaceExample {
public static void main(String[] args) {
    PaymentGateway creditCardPayment = new CreditCardPayment();
    creditCardPayment.processPayment(100.0);

    PaymentGateway upiPayment = new UPIPayment();
    upiPayment.processPayment(200.0);
}
}
