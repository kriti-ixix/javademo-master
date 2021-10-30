package com.mycompany.app;
/**
 * Hello world!
 */
public class App
{

<<<<<<< HEAD
    private final String message = "Naya Version Aa Gya :D";
=======
    private final String message = "Welcome to This Test";
>>>>>>> 1e00a3c9d6b661c1d5ea7a7d05edbbf1c9635207

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
