package com.OrangeDriver;

public class Password {
    private String EncryptedPassword = new String();
    private char[] baseCharacters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private char[] capBaseCharacters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private char[] specialCharacters = {'!','@','#','$','%','^','&','*','(',')','-','_','=','+','<',',','.','>',';',':','"','[',']','{','}','|'};
    private char[] numbers = {'1','2','3','4','5','6','7','8','9','0'};
    private int min = 1;


    private  String EncryptPassword(String Password){
        return Password+"Encrypted";
    }
    //constructor
    public Password(int PasswordLength){
        EncryptedPassword = EncryptPassword(suggestPassword(PasswordLength));
    }

    public String suggestPassword(int length){
        String nonEncryptedPassword = new String("");
        int rand = 0;
        for (int x = 0; x<length; x++){
            rand = (int)((Math.random() * (baseCharacters.length - min)) + min);
            nonEncryptedPassword=nonEncryptedPassword+baseCharacters[rand];
        }
        System.out.println(nonEncryptedPassword);
        return nonEncryptedPassword;
    }
    public void printEncryptedPassword(){
        System.out.println(EncryptedPassword);
    }
    public void printDecryptedPassword(){
        System.out.println(EncryptedPassword.replace("Encrypted",""));
    }



}
