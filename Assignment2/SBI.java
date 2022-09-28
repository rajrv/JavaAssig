import java.io.File;

public class SBI  extends Bank {
    static String bankName = "State Bank of India";
    double roi;


    SBI(String AccountNo, String Name, String IFSC, String branch, double balance,Main.typeOfAccount tp,double amnt) {
        super(AccountNo, Name, IFSC, branch,tp,amnt);

    }

    public double getRoi() {
        return roi;
    }

    public static String getBankName() {
        return bankName;
    }
}
