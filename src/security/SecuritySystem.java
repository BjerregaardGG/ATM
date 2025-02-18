package security;

public class SecuritySystem implements ISecuritySystem {



    @Override
    public boolean validatePin(String inputPin, String cardPin) {
        if (!isValidFormat(inputPin) || !isValidFormat(cardPin)) throw new IllegalArgumentException("Invalid Pin Format");
        return inputPin.equals(cardPin);
    }

    private boolean isValidFormat(String pin) {
        if (pin.length() != 4) return false;
        for (char c : pin.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}
