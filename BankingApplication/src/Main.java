import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner KB = new Scanner(System.in);
        int ch;
        try{
        //create initial accounts
        System.out.print("How Many Customer U Want to Input : ");
        int n = KB.nextInt();
        ArrayList<Bank> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(new Bank());

        //run loop until menu 6 is not pressed
        while(true) {
            System.out.println("****** BANKING MANAGEMENT SYSTEM *****");
            System.out.println("Main Menu\n1. Display All Accounts\n2. Open an Account\n3. Search By Account\n4. Deposit\n5. Withdrawal\n6. Exit ");
            System.out.println("Enter your Choice :");
                ch = KB.nextInt();
                switch (ch) {
                    case 1:
                        for (Bank bank : list)
                            bank.showAccount();
                        break;
                    case 2:
                        Bank b = new Bank();
                        boolean found = false;
                        // To check if same AccountNo already present
                        for (Bank bank : list) {
                            found = bank.search(b.getAccountNo());
                            if (found)
                            {
                                System.out.println("Account already exit!.....  Try New Account No");
                                break;
                            }
                        }
                        if (!found)
                          list.add(b);          // if not then add to list
                        break;
                    case 3:
                        System.out.print("Enter AccountNo U Want to Search...: ");
                        String acn = KB.next();
                         found = false;
                        for (Bank bank : list) {
                            found = bank.search(acn);
                            if (found)
                                break;
                        }
                        if (!found)
                            System.out.println("Search Failed..Account Not Exist..");
                        break;
                    case 4:
                        System.out.print("Enter AccountNo : ");
                        acn = KB.next();
                        found = false;
                        for (Bank bank : list) {
                            found = bank.search(acn);
                            if (found) {
                                bank.deposit();
                                break;
                            }
                        }
                        if (!found)
                            System.out.println("Search Failed..Account Not Exist..");
                        break;

                    case 5:
                        System.out.print("Enter AccountNo : ");
                        acn = KB.next();
                        found = false;
                        for (Bank bank : list) {
                            found = bank.search(acn);
                            if (found) {
                                bank.withdraw();
                                break;
                            }
                        }
                        if (!found)
                            System.out.println("Search Failed..Account Not Exist..");
                        break;

                    case 6:
                        System.out.println("Good Bye..");
                        return;
                    default:
                        System.out.println("Wrong Choice");
                        return;
                }
            }
        }catch (Exception e)
          {
           System.out.println("Invalid choice ");
          }
    }
}