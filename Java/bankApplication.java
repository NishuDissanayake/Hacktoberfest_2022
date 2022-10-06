import java.io.*;
class Account{
    private long acc_num;
    private String name;
    private String password;
    private double balance;
    //Creating setters
    public void setAcc_num(long acc_num) {
        this.acc_num = acc_num;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    //Creating getters
    public long getAcc_num() {
        return acc_num;
    }
    public double getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    //Methods
    public void createAccount(long acc_num, String name, String pass, double balance){
        setAcc_num(acc_num);
        setName(name); 
        setBalance(balance);
        setPassword(pass);
    }
    public void balanceChecking(){
        System.out.printf("The current balance in the account is    :%.2f " + this.getBalance());
    }
    public void credit(double bal){
        this.setBalance(this.getBalance()+ bal);
        System.out.printf("%.2f has been credited to your account.", bal );
    }
    public void debit(double bal){
        double rem_bal = this.getBalance();
        if(rem_bal < bal)
            System.out.println("This amount could not be withdrawn as account does not have sufficient balance");
        else{
            rem_bal= rem_bal-bal;
            setBalance(rem_bal);
            System.out.println(bal +" has been debited from your account.");
        }
    }
    // public boolean accountLogin(String password){
    //     if(password.compareTo(this.getPassword())==0)
    //         return true;
    //     else
    //         return false;
    // }
    public boolean accountLogin(long acc_num, String password){
        if(password.compareTo(this.getPassword())==0 && acc_num==this.getAcc_num())
            return true;
        else
            return false;
    }
}
public class BankApplication_S20210010205 {
    public static void main(String args[])throws Exception{
        System.out.println("------------------------------Output for the 1st program------------------------------\n");
        BufferedReader scn= new BufferedReader(new InputStreamReader(System.in));
        Account acc_arr[]= new Account[10];//assuming maximum number of account opened will be 5
        acc_arr[0]=new Account();
        acc_arr[1]=new Account();
        acc_arr[2]=new Account();
        acc_arr[3]=new Account();
        acc_arr[4]=new Account();
        acc_arr[0].createAccount(56701010, "Harsh", "1234", 10000);
        acc_arr[1].createAccount(56701006, "Tapesh", "3456", 56000);
        acc_arr[2].createAccount(56701007, "Prasad", "9876", 785210);
        acc_arr[3].createAccount(56701008, "Rohan", "7869", 87450);
        acc_arr[4].createAccount(56701009, "Rahul", "7586", 49620);
        System.out.println("Welcome to IIITS bank, enter a valid number from the choices below to perform a task.");
        // String name, password;
        // double balance;
        // long acc_num;
        long accountnumber = 56701000;
        int car=0;
        boolean res2;
        int account_check=5;
        for(int i1=0; i1<10000; i1++){
            // System.out.println(car);
            if (car==1)
            {
                break; 
            }
            boolean res=false;
            int count=1;//assuming 56701 is code of our bank and rest 1 will be add up every time for new account number
            System.out.println("1 To Create a Bank Account");
            System.out.println("2 To Check the Account balance.");
            System.out.println("3 To Credit to Bank Account");
            System.out.println("4 To Debit from Bank Account");
            System.out.println("5 To just login and change password");
            System.out.println("6 To Quit");
            int choice= Integer.parseInt(scn.readLine());
            switch(choice){
                case 1:
                    while(count==1){
                        acc_arr[account_check]= new Account();
                        System.out.printf("Enter Name of nominee    " );
                        String name= scn.readLine();
                        long acc_num= ++accountnumber;
                        System.out.printf("Enter password           " );
                        String password= scn.readLine();
                        acc_arr[account_check++].createAccount(acc_num, name, password, 0);
                        System.out.println("Account has been created.\n");
                        System.out.println("Your account number is       :"+ acc_num);
                        System.out.println("\n");
                        System.out.println("Enter 1 if you want to create one more account or 0 to quit");
                        count= Integer.parseInt(scn.readLine());
                    }
                    break;
                case 2:
                    System.out.println("Enter account number and password to check the balance\n");
                    long acc_num_check= Long.parseLong(scn.readLine());
                    String password_check = scn.readLine();
                    for(int i= 0; i< account_check; i++){
                        res2=acc_arr[i].accountLogin(acc_num_check,password_check);
                        //System.out.println(res2);
                        if(res2==true){
                            System.out.println("Login Succesfull.");
                            System.out.println("Available Balance is : "+acc_arr[i].getBalance());
                            res=true;
                            }
                        }
                    if(res==false)
                        System.out.println("Enter valid combination of account number and password.");
                    break;
                case 3:
                    System.out.println("Enter account number and password to login");
                    acc_num_check= Long.parseLong(scn.readLine());
                    password_check = scn.readLine();
                    for(int i= 0; i< account_check; i++){
                        res2=acc_arr[i].accountLogin(acc_num_check,password_check);
                        // System.out.println(res2);
                        if(res2==true){
                            System.out.println("Login Succesfull.");
                            System.out.println("Enter amount you want to credit     :");
                            double amount= Double.parseDouble(scn.readLine());
                            amount= amount+acc_arr[i].getBalance();
                            acc_arr[i].setBalance(amount);
                            System.out.println("Amount has been credited, updated balance is "+ acc_arr[i].getBalance());
                            res=true;
                        }
                    }
                    if(res==false)
                        System.out.println("Enter valid combination of account number and password.");
                    break;
                case 4:
                    System.out.println("Enter account number and password to login");
                    acc_num_check= Long.parseLong(scn.readLine());
                    password_check = scn.readLine();
                    for(int i= 0; i< account_check; i++){
                        res2=acc_arr[i].accountLogin(acc_num_check,password_check);
                        if(res2==true){
                            System.out.println("Login Succesfull.");
                            System.out.println("Enter amount you want to debit     :");
                            double amount= Double.parseDouble(scn.readLine());
                            if (amount>acc_arr[i].getBalance())
                                System.out.println("Insufficient Balance");
                            else{
                                amount= acc_arr[i].getBalance() - amount;
                                acc_arr[i].setBalance(amount);
                                System.out.println("Amount has been debited, updated balance is "+ acc_arr[i].getBalance());
                                res=true;
                            }
                        }
                    }
                    if(res==false)
                        System.out.println("Enter valid combination of account number and password.");
                    break;
                case 5:
                    System.out.println("Enter account number and password to login");
                    acc_num_check=Long.parseLong(scn.readLine());
                    password_check= scn.readLine();
                    for(int i= 0; i< account_check; i++){
                        res2=acc_arr[i].accountLogin(acc_num_check,password_check);
                        if(res2==true){
                            System.out.println("Login Succesfull.");
                            System.out.println("Enter new passwoord     :");
                            String new_pass= scn.readLine();
                            acc_arr[i].setPassword(new_pass);
                            System.out.println("Password updated ");
                                res=true;
                            }
                        }
                    if(res==false)
                        System.out.println("Enter valid combination of account number and password.");
                    break;

                case 6:
                    car=1;
                    break;
                default:
                    System.out.println("Enter a valid choice");

         
            }
            
        }
    }
}
