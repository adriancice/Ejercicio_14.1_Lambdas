package com.cice.lambda;


import com.cice.lambda.clases.StringUtil;

public class Main {

    public static void main(String[] args) {

        String cadena = "Esto es una cadena";
        StringUtil str = new StringUtil();
        String output = "";

        System.out.println("ORIGINAL");
        System.out.println(cadena);
        System.out.println();

        //Invertir la cadena ***********************
        System.out.println("Invertida");
        output = str.changeStr(s1 -> {
                char[] cadenaChar = cadena.toCharArray();
                StringBuilder cadenaAlReves = new StringBuilder();
            for (int i = cadenaChar.length -1; i >= 0 ; i--) {
                cadenaAlReves.append(cadenaChar[i]);
            }
            return cadenaAlReves.toString();
        }, cadena);
        System.out.println(output);
        System.out.println();

        //Invertir mayusculas y minusculas **************
        System.out.println("Cambio MAY/MIN");
        output = str.changeStr(s1 -> {
            StringBuilder minMay = new StringBuilder();
            for (char c: cadena.toCharArray()) {
                if (Character.toString(c).equals(Character.toString(c).toUpperCase())){
                    minMay.append(Character.toString(c).toLowerCase());
                }else{
                    minMay.append(Character.toString(c).toUpperCase());
                }
            }
            return minMay.toString();
        }, cadena);
        System.out.println(output);
        System.out.println();

        //Sustituir espacios en blanco por "_" ***********************
        System.out.println("SUSTITUCION \" \" por \"_\" ");
        output = str.changeStr(s -> s.replace(" ", "_"), cadena);
        System.out.println(output);

    }
}
