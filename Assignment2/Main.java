import java .util.*;
public class Main {
    enum typeOfAccount{
        SAVINGS,
        CURRENT;
    }
    public static void main(String[] args)
    {
     Bank ob = new ICICI("123","ICICI","ICIC000213","Sarojini",typeOfAccount.CURRENT,10000);
        System.out.println(ob.getAccountNo());
        System.out.println(ob.getBalance());
        System.out.println(ob.getIFSC());
        System.out.println(ob.getTp());
        System.out.println(ob.getName());


        System.out.println(ICICI.getBankName());

        ob.deposit(100);
        ob.withdraw(20);
        System.out.println("balance after Transation:"+ob.getBalance());
    }




}
