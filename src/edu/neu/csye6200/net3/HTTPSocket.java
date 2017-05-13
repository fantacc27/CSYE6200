/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.net3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author Xiao
 */
public class HTTPSocket {
    Socket socket = null;
    public HTTPSocket(String host, int port){
        try {
            socket = new Socket(host,port);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void sendRequest() throws IOException{
        String request = "GET / HTTP/1.1\r\n" + "Host: localhost\r\n" + "Content-type: text/xml; charset =IS0-8859-1\r\n\r\n";
        
        OutputStream os = socket.getOutputStream();
        os.write(request.getBytes());
        os.flush();
    }
    
    public void receiveResponse() throws IOException{
        InputStream ios = socket.getInputStream();
        int ch;
        while((ch = ios.read()) != -1){
            System.out.print((char) ch);
        }
    }
    public static void main(String[] args){
        HTTPSocket httpSocekt = new HTTPSocket("www.abcnews.com",80);
        try {
            httpSocekt.sendRequest();
            httpSocekt.receiveResponse();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
