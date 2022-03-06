package com.company;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class ApplicationBug {

        public static void main(String[] args) {
            System.out.println("Hello Sumit Mishra!");
            System.out.println("\n----------------------------------------------\n");
            System.out.println("\t This project Welcomes You : \n");
            System.out.println("--------------------------------------------------");
            optionsSelection();

        }
        private static void optionsSelection() {
            String[] arr = {"1. I want to review my expenses",
                    "2. I want to add my expenses",
                    "3. I want to delete my expenses",
                    "4. I want to sort the expenses",
                    "5. I want to search for a particular expense",
                    "6. Close the application"
            };
            int[] arr1 = {1,2,3,4,5,6};
            int  slen = arr1.length;
            for(int i=0; i<slen; i++){
                System.out.println(arr[i]);
                // display the all the Strings mentioned in the String array
            }
            ArrayList<Integer> arrlist = new ArrayList<Integer>();
            ArrayList<Integer> expenses = new ArrayList<Integer>();
            expenses.add(1000);
            expenses.add(2000);
            expenses.add(1500);
            expenses.add(800);
            expenses.add(2500);
            expenses.addAll(arrlist);
            System.out.println("\nENTER YOUR CHOICE :\t");
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            int  options =  sc.nextInt();
            for(int j=1; j<=slen; j++){
                if(options == j){
                    switch (options){
                        case 1:
                            System.out.println("Your Saved EXPENSES Are Listed Below: \n");
                            System.out.println(expenses+ "\n");
                            optionsSelection();
                            break;

                        case 2:
                            System.out.println("Enter The Values You want to Add in Your EXPENSES: \n");
                            int value = sc.nextInt();
                            expenses.add(value);
                            System.out.println("Your values are UPDATED\n");
                            expenses.addAll(arrlist);
                            System.out.println(expenses+ "\n");
                            optionsSelection();
                            break;

                        case 3:
                            System.out.println("You are about to delete all your EXPENSES!! \n Confirm again by selecting the same option...\n");
                            int con_choice = sc.nextInt();
                            if(con_choice == options){
                                expenses.clear();
                                System.out.println(expenses+"\n");
                                System.out.println("All your EXPENSES are Deleted!\n");
                            } else {
                                System.out.println("Something went Wrong..... try again!");
                            }
                            optionsSelection();
                            break;

                        case 4:
                            sortExpenses(expenses);
                            optionsSelection();
                            break;

                        case 5:
                            searchExpenses(expenses);
                            optionsSelection();
                            break;

                        case 6:
                            closeApp();
                            break;

                        default:
                            System.out.println("You have Selected an invalid choice!");
                            break;
                    }
                }
            }

        }
        private static void closeApp() {
            System.out.println("Closing Your Application... \nTHANK YOU!");
        }
        private static void searchExpenses(ArrayList<Integer> arrayList) {
            int leng = arrayList.size();
            System.out.println("Enter the EXPENSE You Need to Search:\t");
            //
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            //Linear Search
            for(int i=0;i<leng;i++) {
                if(arrayList.get(i)==input) {
                    System.out.println("Found the EXPENSE " + input + " at " + i + " Position");
                }
            }
        }
        private static void sortExpenses(ArrayList<Integer> arrayList) {
            @SuppressWarnings("unused")
            int arrlength =  arrayList.size();
            //Complete the method. The expenses should be sorted in ascending order.

            Collections.sort(arrayList);
            System.out.println("Sorted EXPENSES: ");
            for(Integer i: arrayList) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
        }
}
