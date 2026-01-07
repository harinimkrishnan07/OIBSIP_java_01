import java.util.Scanner;
import java.util.Random;

class OnlineReservationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // User Registration
        System.out.println("----- USER REGISTRATION -----");
        System.out.print("Create Login ID: ");
        String loginId = sc.next();
        System.out.print("Create Password: ");
        String password = sc.next();

        System.out.println("\nRegistration Successful!");

        // Login
        System.out.println("\n----- LOGIN -----");
        System.out.print("Enter Login ID: ");
        String login = sc.next();
        System.out.print("Enter Password: ");
        String pass = sc.next();

        if (login.equals(loginId) && pass.equals(password)) {

            int choice;

            do {
                System.out.println("\n----- ONLINE RESERVATION SYSTEM -----");
                System.out.println("1. Reserve Ticket");
                System.out.println("2. Cancel Ticket");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Passenger Name: ");
                        String name = sc.next();

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();

                        System.out.print("Enter From: ");
                        String from = sc.next();

                        System.out.print("Enter To: ");
                        String to = sc.next();

                        System.out.print("Enter Date of Journey: ");
                        String date = sc.next();

                        int pnr = rand.nextInt(900000) + 100000;

                        System.out.println("\n----- TICKET DETAILS -----");
                        System.out.println("Passenger Name : " + name);
                        System.out.println("Age            : " + age);
                        System.out.println("From           : " + from);
                        System.out.println("To             : " + to);
                        System.out.println("Journey Date   : " + date);
                        System.out.println("PNR Number     : " + pnr);
                        System.out.println("Ticket Reserved Successfully!");
                        break;

                    case 2:
                        System.out.print("Enter PNR Number to Cancel: ");
                        int cancelPnr = sc.nextInt();
                        System.out.println("Ticket with PNR " + cancelPnr + " Cancelled Successfully!");
                        break;

                    case 3:
                        System.out.println("Thank you for using Online Reservation System!");
                        break;

                    default:
                        System.out.println("Invalid Choice! Please try again.");
                }

            } while (choice != 3);

        } else {
            System.out.println("Invalid Login Credentials!");
        }

        sc.close();
    }
}