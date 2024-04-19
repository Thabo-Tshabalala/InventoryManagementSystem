package za.ac.cput.util;

import java.util.UUID;

public class Helper  {


public static boolean isNullorEmpty(String s){
    return s == null || s.isEmpty();
}

public static String generatedID(){
   return  UUID.randomUUID().toString();
}
public static boolean isNegative(double num){
    return num < 0;
}
}
