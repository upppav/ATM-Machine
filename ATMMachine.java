import java.util.Scanner;

public class ATMMachine {
    public float balence;

    public ATMMachine() {
    }

    public ATMMachine(float balence) {
        this.balence = balence;

    }

    public int AtmPin = 2345;

    public void checkPin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin");
        int pin = sc.nextInt();
        if (pin == AtmPin) {
            menu();
        } else {
            System.out.println("Invalid pin");
            menu();
        }
    }

    private void menu() {
        System.out.println("Select from the below  menu");
        System.out.println("1-Check Balence \n" + "2-Deposit Money \n" + "3-Withdraw Amount \n" + "4-Exit");
        Scanner sc = new Scanner(System.in);
        int action = sc.nextInt();
        switch (action) {
            case 1:
                checkBlence();
                break;
            case 2:
                depositeMoney();
                break;
            case 3:
                withdrawMonwy();
                break;
            case 4:
                System.out.println("Exit successfully");
                System.exit(0);
                break;
        }
    }

    private void withdrawMonwy() {
        System.out.println("Enter the amount to deposit");
        Scanner sc = new Scanner(System.in);
        float bal=sc.nextFloat();
        System.out.println("Money withdrawn  successfully");
        balence-=bal;
        menu();

    }

    private void depositeMoney() {
        System.out.println("Enter the amount to deposit");
        Scanner sc = new Scanner(System.in);
        float bal=sc.nextFloat();
        System.out.println("Money deposited successfully");
        balence+=bal;
        menu();

    }

    private void checkBlence() {
        // Scanner sc= new Scanner(System.in);
        System.out.println("The current Balence is : " + this.balence);
menu();
    }


}
