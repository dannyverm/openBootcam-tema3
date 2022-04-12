package com.company.app;

public class ConcatNombres {

    public static void main(String[] args) {
	// write your code here
        String[] nombres = {"Daniel", "Cynthia", "Gaby", "May"};
        String concatNom="";
        for (String n :
                nombres) {
            concatNom+=n+" - ";
        }
        System.out.println(concatNom);
    }
}
