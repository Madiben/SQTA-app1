package com.example.myapplication.tools;

public class CountAscii {
    public int SumAscii(String s)
    {
        int sum = 0;
        for (char letter : s.toCharArray())
        {
            if(letter == ' ')
            {
                sum += 0;
            }else
            {
                sum += letter;
            }
        }
        return sum;
    }
}
