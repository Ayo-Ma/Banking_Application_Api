package com.realtech.AptechBank.utils;
import java.time.Year;
public class AccountUtil {
    public  static final String ACCOUNT_CREATED_CODE="001";
    public  static final String ACCOUNT_CREATED_MESSAGE="Account has been successfully created";
    public  static final String EMAIL_EXIST_CODE="002";
    public  static final String EMAIL_EXIST_MESSAGE="Email already exits";
    public  static final String ACCOUNT_NOT_EXIST_CODE="003";
    public  static final String ACCOUNT_NOT_EXIST_MESSAGE="This account does not exits";
    public  static final String ACCOUNT_FOUND_CODE="004";
    public  static final String ACCOUNT_FOUND_MESSAGE="Account found successfully";
    public  static final String ACCOUNT_CREDIT_CODE="005";
    public  static final String ACCOUNT_CREDIT_MESSAGE="Account has been credited";
    public  static final String ACCOUNT_DEBIT_CODE="006";
    public  static final String ACCOUNT_DEBIT_MESSAGE="Account has been debited";
    public  static final String INSUFFICIENT_BALANCE_CODE="007";
    public  static final String INSUFFICIENT_BALANCE_MESSAGE="Insufficient balance";
    public static String generateAccountNumber(){
        Year year = Year.now();
        int min = 100000;
        int max = 999999;
        int num = (int) Math.floor(Math.random()*(max-min +1)+min);
        String val1 = String.valueOf(year);
        String val2 = String.valueOf(num);
        return val1+val2;
    }
}