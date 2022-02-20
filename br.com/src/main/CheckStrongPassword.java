package main;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CheckStrongPassword {
    private final String PASSWORD_REGEX =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,20}$";
    private final Pattern pattern = Pattern.compile(PASSWORD_REGEX);

    public String checkPassword(String password) {
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()) {
            return "Senha fraca. Sua senha deve possuir ao menos 6 caracteres, sendo 1 dígito, 1 letra minúscula, 1 maiúscula e 1 caractere especial!";
        }
        return "Senha forte";
    }
}
