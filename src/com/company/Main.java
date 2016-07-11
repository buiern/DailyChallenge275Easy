package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Determine the process you wish to perform.");
        System.out.println("1. Determine if an Elemental Symbol is correct for an Elemental Name.");
        System.out.println("2. Generate an Elemental Symbol off of an Elemental Name.");
        System.out.println("3. Determine how many possible combinations their are for the Element Symbol based off of the Name.");
        System.out.println("4. Determine how man possible combination to an Element Name based off of Blurth rules.");
        System.out.println("Please enter the number of your selection and press return.");
        String selection = sc.nextLine().toLowerCase();
        String decision = String.valueOf(selection.charAt(0));

        if (decision.equals("1")) {
            System.out.println("Enter the Element name and press return");
            String element = sc.nextLine().toLowerCase();

            System.out.println("Enter the Element symbol and press return");
            String symbol = sc.nextLine().toLowerCase();

            int count = 0;
            int correct = 3;

            for (int i = 0; i < element.length(); i++) {
                String letter = String.valueOf(element.charAt(i));
                if (letter.equals(String.valueOf(symbol.charAt(0)))) {
                    count = 1;
                }
                if (count == 1) {
                    if (letter.equals(String.valueOf(symbol.charAt(1)))) {
                        correct = 1;
                    }
                }
            }
            if (correct == 1) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

        if (decision.equals("2")) {
            System.out.println("Please enter an Elemental Name and press return.");
            String name = sc.nextLine().toLowerCase();
            Random rand = new Random();
            int firstValue = rand.nextInt(name.length() - 1);
            String nameSub = name.substring(firstValue + 1);
            int secondValue = rand.nextInt(nameSub.length());
            String firstString = String.valueOf(name.charAt(firstValue)).toUpperCase();
            String secondString = String.valueOf(nameSub.charAt(secondValue));
            System.out.println(firstString + secondString);
        }

        if (decision.equals("3")) {
            List<String> totalSymbols = new ArrayList<>();
            System.out.println("Please enter an Elemental Name and press return.");
            String name = sc.nextLine().toLowerCase();

            for (int i = 0; i < name.length(); i++) {

                String firstInput = String.valueOf(name.charAt(i));
                for (int j = 0; j < name.length(); j++) {
                    if (j > i) {
                        String secondInput = String.valueOf(name.charAt(j));
                        if (!totalSymbols.contains(firstInput + secondInput)) {
                            totalSymbols.add(firstInput + secondInput);
                        }
                    }
                }

            }
            System.out.println(totalSymbols.size());

        }
    }
}

//        if (decision.equals("4")) {
//            Map<String, Integer> totalSymbols = new HashMap<>();
//            System.out.println("Please enter an Elemental Name and press return.");
//            String name = sc.nextLine().toLowerCase();
//            StringBuilder sb = new StringBuilder();
//
//            for (int i = 0; i < name.length(); i++) {
//                String charAt = String.valueOf(name.charAt(i));
//                String beginSub = name.substring(0,i);
//                String endSub = name.substring(name.length()-i);
//                totalSymbols.putIfAbsent(charAt,0);
//                totalSymbols.putIfAbsent(beginSub,0);
//                totalSymbols.putIfAbsent(endSub,0);
//
//                }
//
//            }
//        }
//
//    }
//}
