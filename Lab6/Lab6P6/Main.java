package Lab6.Lab6P6;

import java.util.Scanner;

interface ImessageService {
    public void send(String recipient, String message);
}

class SMSsender implements ImessageService {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
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
        String emailrecip = sc.nextLine();
        String emailmessage = sc.nextLine();
        String smsrecip = sc.nextLine();
        String smsmessage = sc.nextLine();
        Emailsender emailsender = new Emailsender();
        SMSsender smssender = new SMSsender();
        Notifier notifier1 = new Notifier(emailsender);
        notifier1.send(emailrecip , emailmessage);
        Notifier notifier2 = new Notifier(smssender);
        notifier2.send(smsrecip, smsmessage);
        sc.close();
    }
}
