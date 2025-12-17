package Lab5.Lab5P13;

import java.util.Scanner;

class User {
    protected String name;
    public User(String name) {
        this.name = name;
    }
    public int getClearanceLevel() {
        return 1;
    }
}

class Developer extends User {
    protected int projects;
    public Developer(String name, int project) {
        super(name);
        this.projects = project;
    }
    @Override
    public int getClearanceLevel() {
        return 2;
    }
}

class Admin extends Developer {
    protected String adminkey;
    public Admin(String name, int project, String adminkey) {
        super(name, project);
        this.adminkey = adminkey;
    }
    public int getClearanceLevel() {
        return 3;
    }
    public String getAdminKey() {
        return this.adminkey;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String developerName = sc.nextLine();
        int developerProjects =sc.nextInt();
        sc.nextLine();
        String adminName = sc.nextLine();
        int adminProjects = sc.nextInt();
        sc.nextLine();
        String adminkey = sc.nextLine();
        User u1 = new User("Guest");
        User d1 = new Developer(developerName, developerProjects);
        User a1 = new Admin(adminName, adminProjects, adminkey);
        User[] users = {u1,d1,a1};
        int totalClearance = 0;

        for (User user : users) {
            totalClearance += user.getClearanceLevel();

        }
        for (User user : users) {
            if (user instanceof Admin) {
                Admin admin = (Admin) user;
                System.out.println(admin.getAdminKey());
            }
        }
        System.out.println(totalClearance);
        sc.close();
    }
}
