package com.company;

import java.io.*;

public class FileHandling {
    public static void main(String[] args){

        //Writing in the file
/*
        try
        {
            FileWriter f = new FileWriter("C:\\Users\\DELL\\Desktop\\File Handling\\Demo.txt");
            try
            {
                f.write("Sumit is the employee of Mphasis limited..!!");
            }
            finally
            {
                f.close();
            }
            System.out.println("Successfully Written..!! ");
        }
        catch(IOException i)
        {
            System.out.println(i);
        }

        //Reading an Existing file
        try
        {
            FileReader r = new FileReader("C:\\Users\\DELL\\Desktop\\File Handling\\Demo.txt");
            try
            {
                int i;
                while((i=r.read())!=-1)
                {
                    System.out.print((char)i);
                }
            }
            finally
            {
               r.close();
                System.out.print("\n");
                System.out.print("File Closed successfully.");
            }
        }
        catch(IOException e)
        {
            System.out.println("Exception handled..");
        }   */

        // Append text to Existing File.

         String path = "C:\\Users\\DELL\\Desktop\\File Handling\\Demo.txt";
         String text = "  Currently doing training at Simplilearn";
         try
         {
             FileWriter f = new FileWriter(path,true);
             f.write(text);
             f.close();
             System.out.println("Append done Successfully..");
         }

         catch(IOException e){
             System.out.println(e);
         }

    }

}
