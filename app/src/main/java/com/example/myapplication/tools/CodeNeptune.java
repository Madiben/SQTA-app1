package com.example.myapplication.tools;

import android.widget.Switch;

public class CodeNeptune {
    //My Neptune is ELKBLN
    public String codesentance(String s){
        String a="";
        for (char letter: s.toCharArray()) {
            switch (letter){
                case 'e' :
                    a=a+'l';
                    break;
                case 'E' :
                    a=a+'L';
                    break;
                case 'l' :
                    a=a+'k';
                    break;
                case 'L' :
                    a=a+'K';
                    break;
                case 'k' :
                    a=a+'b';
                    break;
                case 'K' :
                    a=a+'B';
                    break;
                case 'b' :
                    a=a+'n';
                    break;
                case 'B' :
                    a=a+'N';
                    break;
                default:
                    a=a+letter;
            }
        }
        return a;
    }


}
