import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Bank {
    protected String AccountNo;
    protected String Name;
    protected String IFSC;
    protected String branch;
    protected  Main.typeOfAccount tp;

    double balance;


    Bank(String AccountNo,String Name,String IFSC,String branch,Main.typeOfAccount tp,double amount){
        this.AccountNo=AccountNo;
        this.Name = Name;
        this.IFSC = IFSC;
        this.branch =branch;
        this.tp = tp;
        this.balance=amount;

    }
    public void fileWrt(double balance,double amt) throws IOException {
        FileWriter fWriter = new FileWriter("/home/raj/JavaOffice/demo1/log.txt/");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        fWriter.write("Balance=" + balance+ "Amount educted:"+ amt+"DATE and TIME"+now+"\n");
        fWriter.close();
    }

    public void withdraw(double withdrawAmt) {
        try {
            if (withdrawAmt > balance) {
                throw new InsufficientAmountException();
            }
            balance = balance - withdrawAmt;
            fileWrt(balance,withdrawAmt);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public void deposit(double depositamt){

        this.balance+=depositamt;
        try {
            fileWrt(balance,depositamt);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public String getName() {
        return Name;
    }

    public String getIFSC() {
        return IFSC;
    }

    public String getBranch() {
        return branch;
    }

    public Main.typeOfAccount getTp() {
        return tp;
    }

    public double getBalance() {
        return balance;
    }
}

class InsufficientAmountException extends  Exception{
    InsufficientAmountException(){

    }
    public String toString(){

        return("InsufficientAmountException:Invalid Transaction");
    }
}
