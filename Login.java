/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author dwijonarko
 */
public class Login {
    public static Scanner input = new Scanner(System.in);
    public static String getUsername()
    {
        String pengguna;
        System.out.print("Masukkan Username : ");
        pengguna=input.next();
        return pengguna;
    }
    public static String getPassword()
    {
        String id;
        System.out.print("Masukkan Id       : ");
        id=input.next();
        return id;
    }
    private static void konfigurasi(String user, String pasword)
    {
        boolean error= true;
        while (error==true)
        {
            try
            {
                while(!user.equalsIgnoreCase("admin") || !pasword.equals("admin"))
                {
                    System.out.println();
                    System.out.println(" **Login Failed **");
                    System.out.println();
                    user = getUsername();
                    pasword = getPassword();
                }
                error = false;
            }
            catch(Exception e)
            {
                System.out.println();
                System.out.println("# User & Pasword Salah");
                System.out.println();
            }
        }
    }
    
    public static void main(String[] args)
    {
        String user,pasword;
        user = getUsername();
        pasword = getPassword();
        konfigurasi(user,pasword);
        System.out.println();
        System.out.println(" **SELAMAT Login Sukses** ");
        System.out.println();

        System.out.print("Press any key to continue . . . ");
        System.out.println(true);
    }
}
