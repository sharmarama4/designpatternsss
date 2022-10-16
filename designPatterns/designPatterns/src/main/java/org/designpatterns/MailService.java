package org.designpatterns;

public class MailService {
    public void sendEmail(){
  connect();
  authenticate();
  disconnect();//this is abstraction
    }
    private void connect(){
        System.out.println("Connect");
    }
    private void disconnect(){
        System.out.println("DisConnect");

    }
    private void authenticate(){
        System.out.println("Authenticate");

    }
}
