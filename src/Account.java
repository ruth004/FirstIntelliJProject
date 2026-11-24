public class Account {
    private String accountName;
    private int  accountNumber = 1001;
    private int  accountPin;
    private int  accountBalance = 0;

    public void setAccountName(String accountName){

        this.accountName = accountName;
    }

    public String getAccountName(){

        return this.accountName;
    }

    public int getBalance() {

        return this.accountBalance;
    }

    public int getAccountNumber() {
        return this.accountNumber;

    }

    public void setAccountPin(int pin){
        this.accountPin = pin;
    }

    public int getAccountPin(){
        return this.accountPin;
    }

    public int accountDeposit(int amount){
        if(amount > 0){
            this.accountBalance = accountBalance + amount;
        }
        return this.accountBalance;
    }

    public void withdraw(int amount) {
        if(amount <= accountBalance){
            this.accountBalance = accountBalance - amount;

        }


        }

    }

