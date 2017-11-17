/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCPChat_simple;

/**
 *
 * @author mohitgupta
 */
import java.io.*;

import java.net.*;

public class Client

    {

    public static void main(String[] args) throws IOException

        {
        //System.out.println(“TCP CLIENT”);
        System.out.println("TCP Client");

        System.out.println("Enter the host name to connect");

        DataInputStream inp=new DataInputStream(System.in);

        String str=inp.readLine();

        Socket clientsoc = new Socket(str, 1100);

        PrintWriter out = new PrintWriter(clientsoc.getOutputStream(), true);

        BufferedReader in = new BufferedReader(new

        InputStreamReader(clientsoc.getInputStream()));

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        String userinput;

        try{

            while (true)

            {

                System.out.println("Server Says : " + in.readLine());

                userinput = stdin.readLine();

                out.println(userinput);

            }

        }

        catch(Exception e)

        {

            System.exit(0);

        }

    }

}