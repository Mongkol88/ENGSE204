package Lab6.Lab6P5;

import java.util.Scanner;

interface ImessageService {
    public void send(String recipient, String message);
}

class Emailsender implements ImessageService {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending Email to " + recipient + ": " + message);
    }
}

class Notifier {
    private ImessageService serivce;
    public Notifier(ImessageService service) {
        this.serivce = service;
    }
    public void send(String recipient, String message) {
        this.serivce.send(recipient, message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String recip = sc.nextLine();
        String message = sc.nextLine();
        Emailsender emailsend = new Emailsender();
        Notifier notifier = new Notifier(emailsend);
        notifier.send(recip, message);
        sc.close();
    }
}
