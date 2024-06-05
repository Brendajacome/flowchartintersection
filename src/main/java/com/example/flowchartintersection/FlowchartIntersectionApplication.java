package com.example.flowchartintersection;

import java.util.Scanner;

public class FlowchartIntersectionApplication {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter the number of sets: ");
        int totalSets = inputScanner.nextInt();

        System.out.println("Enter the number of elements in each set: ");
        int elementsPerSet = inputScanner.nextInt();
        inputScanner.nextLine();  // Consume the newline character

        String[][] setsMatrix = new String[totalSets][elementsPerSet];

        for (int setIndex = 0; setIndex < totalSets; setIndex++) {
            System.out.println("Input elements for set " + (setIndex + 1));
            for (int elementIndex = 0; elementIndex < elementsPerSet; elementIndex++) {
                System.out.println("Enter element " + (elementIndex + 1) + ":");
                setsMatrix[setIndex][elementIndex] = inputScanner.nextLine();
            }
        }

        String[] commonElements = new String[elementsPerSet];
        int commonElementCount = 0;

        for (int firstSetElementIndex = 0; firstSetElementIndex < elementsPerSet; firstSetElementIndex++) {
            String currentElement = setsMatrix[0][firstSetElementIndex];
            boolean isCommonElement = true;
            for (int setIndex = 1; setIndex < totalSets; setIndex++) {
                boolean isElementFound = false;
                for (int elementIndex = 0; elementIndex < elementsPerSet; elementIndex++) {
                    if (currentElement.equals(setsMatrix[setIndex][elementIndex])) {
                        isElementFound = true;
                    }
                }
                if (!isElementFound) {
                    isCommonElement = false;
                }
            }
            if (isCommonElement) {
                commonElements[commonElementCount++] = currentElement;
            }
        }

        System.out.println("Common elements in all sets:");
        if (commonElementCount == 0) {
            System.out.println("There are no elements common to all sets.");
        } else {
            for (int i = 0; i < commonElementCount; i++) {
                System.out.println(commonElements[i]);
            }
        }
    }
}