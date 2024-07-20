package codingtechniques.model;

import org.hibernate.validator.constraints.CreditCardNumber;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Pattern;

public class CreditCard {

    @CreditCardNumber(message = "Not A Valid Credit Card")
    private String creditCardNumber;

    @Pattern(regexp="^(0[1-9]|1[0-2])/([0-9]{2})$", message="Invalid expiration date")//matches months 01 through 09, matches months 10 through 12.
    private String creditCardExpiration;//matches any two-digit year

    @Digits(integer = 3, fraction = 0, message = "Invalid CVV")
    private String creditCardCVV;

    public CreditCard() {}// default constructor for the CreditCard class.

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardExpiration() {
        return creditCardExpiration;
    }

    public void setCreditCardExpiration(String creditCardExpiration) {
        this.creditCardExpiration = creditCardExpiration;
    }

    public String getCreditCardCVV() {
        return creditCardCVV;
    }

    public void setCreditCardCVV(String creditCardCVV) {
        this.creditCardCVV = creditCardCVV;
    }
}
