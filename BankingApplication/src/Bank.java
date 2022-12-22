import java.util.Scanner;

public class Bank
{
    private String accountNo;
    private String name;
    private float amount;

    Scanner sc=new Scanner(System.in);
    Bank()
    {
        openAccount();
    }

    public String getAccountNo() {
        return accountNo;
    }

    // To open Account
    public void openAccount()
    {
        System.out.println("Enter the Account no");
        accountNo=sc.next();
        System.out.println("Enter Name:");
        name=sc.next();
        System.out.println("Enter Amount:");
        amount=sc.nextFloat();
    }

    // To show Account
    public  void showAccount()
    {
        System.out.println("Account No: "+accountNo);
        System.out.println("Name: "+name);
        System.out.println("Amount: "+amount);
    }

    // To deposit
    public void deposit()
    {
        float amt;
        System.out.println("Enter the Amount:");
        amt= sc.nextFloat();
        amount+=amt;
        System.out.println(amt+" Added Successfully");
    }

    // To withdraw
    public void withdraw()
    {
        float amt;
        System.out.println("Enter the Amount:");
        amt= sc.nextFloat();
        if(amount>=amt) {
            amount -= amt;
            System.out.println(amt+" Successfully withdraw");
        }
        else
            System.out.println("Transcation Failed!... Less amount available");
    }

    // To search
    public boolean search(String n)
    {
        if(accountNo.equals(n))
        {
            System.out.println("Account Details are: ");
            showAccount();
            return true;
        }
        return false;
    }
}
