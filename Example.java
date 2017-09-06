package com.something;

class Example {
    public static void Method(String a, String b) {
        if (!true) {
            throw new Exception
                ("This happened: " + a
                + " (instead of " + b + ")");
        }
    }
    
    public static void Method2() {
        int x = 0;
        String s = "hello";
    }
}
