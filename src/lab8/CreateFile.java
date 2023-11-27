package com.company;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("text.txt");
            if (myObj.createNewFile()) {
                System.out.println("Fisier creat: " + myObj.getName());
            } else {
                System.out.println("Fisierul exista deja.");
            }
        } catch (IOException e) {
            System.out.println("Eroare.");
            e.printStackTrace();
        }
    }
}