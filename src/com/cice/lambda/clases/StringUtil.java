package com.cice.lambda.clases;

import com.cice.lambda.Interfaces.StringFunc;

public class StringUtil {

    public String changeStr(StringFunc f, String s) {
        return f.func(s);
    }
}
