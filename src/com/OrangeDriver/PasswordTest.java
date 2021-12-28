package com.OrangeDriver;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @org.junit.jupiter.api.Test
    void suggestPassword() {
    }
    @org.junit.jupiter.api.Test
    void passwordOfGivenLength(){
        Password pWord = new Password(8);
        String spWord = new String();
        spWord = pWord.suggestPassword(8);

        int expected = 8;
        int actual = spWord.length();
        assertEquals(expected,actual);
    }


}