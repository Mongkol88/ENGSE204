package Lab4.Lab4P15;

import java.util.Scanner;

class AuditRecord {
    private final String user;
    private final String[] logMessages;
    private static int MaxMessages = 3;

    public AuditRecord(String user) {
        this(user, new String[0]);
    }
    public AuditRecord(String user, String[] logs) {
        this.user = user;
        int n;
        if (logs.length > MaxMessages) {
            n = logs.length - MaxMessages;
            this.logMessages = new String[MaxMessages];
            for (int i = 0; i < MaxMessages; i++) {
                this.logMessages[i] = logs[n + i];
            }
        } else {
            n = 0;
            this.logMessages = logs; 
        }
    }
    
    public static void setPolicy(int max) {
        if (max > 0) {
            MaxMessages = max;
            System.out.println("Policy set to " + max);
        } else { System.out.println("Invalid policy");}
    }
    public AuditRecord addMessage(String message) {
        if (message.length() < MaxMessages) {
            String[] newarray = new String[this.logMessages.length + 1];
            for (int i = 0; i < this.logMessages.length; i++) {
                newarray[i] = this.logMessages[i];
            }
            newarray[newarray.length] = message;
            System.out.println(message + " Added.");
            return new AuditRecord(this.user, newarray);
        } else {
            System.out.println("Log is full.");
            return this;
        }
    }

    public void dislaylog() {
        System.out.println("User: " + this.user + ", Logs: " + this.logMessages.length + "[");
        for (int i = 0; i < logMessages.length; i++) {
            System.out.print(logMessages[i]);
        }
        System.out.print("]");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        sc.nextLine();
        String user = sc.next();
        sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();

        AuditRecord.setPolicy(max);
        AuditRecord ar1 = new AuditRecord(user);

        for (int i = 0; i < n; i++) {
            String message = sc.nextLine();
            sc.nextLine();
            System.out.println(message);
            if (message.equals("SET_POLICY")) {
                int newpolicy = sc.nextInt();
                AuditRecord.setPolicy(newpolicy);
                sc.nextLine();
            } else {
                ar1.addMessage(message);
            }
        }
        ar1.dislaylog();

        sc.close();
    }
}
