package test;

import main.AnagramCount;
import org.junit.jupiter.api.*;

class AnagramPairCountTest {
    @Test
    @DisplayName("Testa se o método anagramPairCount retorna a quantidade de pares de anagramas possíveis em uma string")
    public void AnagramPairsTest1() {
        AnagramCount anagCount = new AnagramCount();
        Assertions.assertEquals(2, anagCount.anagramPairCount("ovo"));
    }

    @Test
    @DisplayName("Testa se o método anagramPairCount retorna a quantidade de pares de anagramas possíveis em uma string")
    public void AnagramPairsTest2() {
        AnagramCount anagCount = new AnagramCount();
        Assertions.assertEquals(3, anagCount.anagramPairCount("ifailuhkqq"));
    }
}