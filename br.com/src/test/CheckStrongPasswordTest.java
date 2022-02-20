package test;

import main.CheckStrongPassword;
import org.junit.jupiter.api.*;

class CheckStrongPasswordTest {
    @Test
    @DisplayName("Testa a funcionalidade do método CheckStrongPassword passando uma senha forte")
    public void StrongPasswordTest() {
        CheckStrongPassword check = new CheckStrongPassword();
        Assertions.assertEquals("Senha forte", check.checkPassword("Bruno02@"));
    }

    @Test
    @DisplayName("Testa a funcionalidade do método CheckStrongPassword passando uma senha fraca")
    public void WeakPasswordTest() {
        CheckStrongPassword check = new CheckStrongPassword();
        String response = "Senha fraca. Sua senha deve possuir ao menos 6 caracteres, sendo 1 dígito, 1 letra minúscula, 1 maiúscula e 1 caractere especial!";
        Assertions.assertEquals(response, check.checkPassword("Bruno123"));
    }
}