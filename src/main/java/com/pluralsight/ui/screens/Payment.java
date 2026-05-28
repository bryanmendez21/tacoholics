package com.pluralsight.ui.screens;

import com.pluralsight.Main;
import com.pluralsight.model.Cart;
import com.pluralsight.ui.Screen;
import com.pluralsight.util.AnsiCode;
import com.pluralsight.util.ReceiptWriter;

public class Payment implements Screen {
    private Cart cart;

    public Payment(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void display() {
        boolean validPayment = false;

        while(!validPayment) {
            AnsiCode.printPaymentMenu();

            AnsiCode.printPaymentPrompt(" Card Number (16 digits): ");
            String cardNumber = Main.scanner.nextLine();

            AnsiCode.printPaymentPrompt(" Expiration date (MM/YY): ");
            String cardExpiration = Main.scanner.nextLine();

            AnsiCode.printPaymentPrompt(" cvv (3 digits): ");
            String cardCvv = Main.scanner.nextLine();

            if(isValid(cardNumber,cardExpiration,cardCvv)){
                AnsiCode.printPaymentSuccess();

                ReceiptWriter.Write(cart);

                cart.clearCart();

                validPayment = true;

            } else {
                AnsiCode.printInvalidCard();
            }
        }
    }

    public boolean isValid(String cardNumber,String expiry,String cvv) {
        return cardNumber.length() == 16
                && expiry.matches("\\d{2}/\\d{2}")
                && cvv.length() == 3;
    }


}
