package com.OrangeDriver;

public class Password {
    private String EncryptedPassword = new String();

    private  String EncryptPassword(String Password){
        return Password+"Encrypted";
    }
    //constructor
    public Password(String Password){
        EncryptedPassword = EncryptPassword(Password);
    }

    public String suggestPassword(int length){
        return "Password";
    }
    public void printEncryptedPassword(){
        System.out.println(EncryptedPassword);
    }
    public void printDecryptedPassword(){
        System.out.println(EncryptedPassword.replace("Encrypted",""));
    }



}
