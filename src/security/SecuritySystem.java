package security;

public class SecuritySystem implements ISecuritySystem {


    @Override
    public boolean validatePin(String inputPin, String cardPin) {
        if(inputPin.length() != 4) throw new IllegalArgumentException("Invalid Pin Format");
        return inputPin.equals(cardPin);
    }
}
