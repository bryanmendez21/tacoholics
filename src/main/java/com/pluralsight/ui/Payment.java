package com.pluralsight.ui;

import com.pluralsight.Main;
import com.pluralsight.model.Cart;
import com.pluralsight.util.ReceiptWriter;

public class Payment implements Screen{
    private Cart cart;

    public Payment(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void display() {
        boolean validPayment = false;

        while(!validPayment) {
            System.out.println("Enter Card Number (16 digits): ");
            String cardNumber = Main.scanner.nextLine();

            System.out.println("Enter Expiration date (MM/YY): ");
            String cardExpiration = Main.scanner.nextLine();

            System.out.println("Enter cvv (3 digits): ");
            String cardCvv = Main.scanner.nextLine();

            if(isValid(cardNumber,cardExpiration,cardCvv)){
                System.out.println("Payment Successful!");

                ReceiptWriter.Write(cart);

                cart.clearCart();

                validPayment = true;

            } else {
                System.out.println("Invalid card info, please try again.");
            }
        }
    }

    public boolean isValid(String cardNumber,String expiry,String cvv) {
        return cardNumber.length() == 16
                && expiry.matches("\\d{2}/\\d{2}")
                && cvv.length() == 3;
    }


}
