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
        int s;
        int index; 
        if (logs.length > MaxMessages) {
            s = MaxMessages;
            index = logs.length - MaxMessages;
        } else {
            s = logs.length;
            index = 0;
        }
        this.logMessages = new String[s];

        for (int i = 0; i < s; i++) {
            if ((index + i) < logs.length) {
                this.logMessages[i] = logs[index + i];
            }
        }
    }
    
    public static void setPolicy(int max) {
        if (max > 0) {
            MaxMessages = max;
            System.out.println("Policy set to " + max);
        } else { System.out.println("Invalid policy");}
    }
    public AuditRecord addMessage(String message) {
        if (this.logMessages.length < MaxMessages) {
            String[] newLogs = new String[this.logMessages.length + 1];

            for (int i = 0; i < this.logMessages.length; i++) {
                newLogs[i] = this.logMessages[i];
            }

            newLogs[newLogs.length - 1] = message;

            return new AuditRecord(this.user, newLogs);
        } else {
            System.out.println("Log is full.");
            return this;
        }
    }
    public void dislaylog() {
        System.out.print("User: " + this.user + ", Logs: " + this.logMessages.length + " [");
        for (int i = 0; i < this.logMessages.length; i++) {
            System.out.print(this.logMessages[i] + " ");
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
            if (message.equals("SET_POLICY")) {
                int newpolicy = sc.nextInt();
                AuditRecord.setPolicy(newpolicy);
                sc.nextLine();
            } else {
                ar1 = ar1.addMessage(message);
            }
        }
        ar1.dislaylog();

        sc.close();
    }
}
