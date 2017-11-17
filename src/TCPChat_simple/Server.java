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

public class Server

{

public static void main(String a[]) throws Exception

{

System.out.println("TCP SERVER");

System.out.println("Server is ready to connect…");

ServerSocket serversoc=new ServerSocket(1100);

Socket clientsoc = serversoc.accept();

PrintWriter out = new PrintWriter(clientsoc.getOutputStream(), true);

BufferedReader in = new BufferedReader(new

InputStreamReader(clientsoc.getInputStream()));

String inputline;

BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

try

{

while (true)

{

inputline = stdin.readLine();

out.println(inputline);

System.out.println("Client Says : "+in.readLine());

}

}

catch(Exception e)

{

System.exit(0);

}

}

}

