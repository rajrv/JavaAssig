public class BOI extends Bank {
    static String bankName = "Bank of India";
    double roi=8.6;


    BOI(String AccountNo, String Name, String IFSC, String branch,Main.typeOfAccount tp,double amnt) {
        super(AccountNo, Name, IFSC, branch,tp,amnt);

    }

    public static String getBankName() {
        return bankName;
    }

    public double getRoi() {
        return roi;
    }
}
