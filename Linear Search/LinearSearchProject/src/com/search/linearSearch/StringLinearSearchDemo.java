package com.search.linearSearch;

public class StringLinearSearchDemo {

    public static void main(String[] args) {
        String name = "Zafrul Islam";
        char target = 'a';

        System.out.println("elements ==>"+searchElement(name, target));
    }

    static boolean searchElement(String name, char target){

        if(name.length() == 0){
            return false;
        }
        for (int i = 0; i <name.length() ; i++) {

            char element = name.charAt(i);
            if(element == target){
                return true;
            }
        }
        return false;
    }
}
