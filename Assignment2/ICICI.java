public class ICICI  extends Bank{
    static String bankName = "ICICI";
   double roi = 9.1;

    double amount;
    public static String getBankName() {
        return bankName;
    }

    ICICI(String AccountNo, String Name, String IFSC, String branch,Main.typeOfAccount tp,double amnt){

        super(AccountNo,Name,IFSC,branch,tp,amnt);

        roi = 8.5;
    }

    public double getRoi() {
        return roi;
    }

}
