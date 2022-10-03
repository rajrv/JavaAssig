//Demonstrate the use of repeat, strip, isBlank, indent, transform, stripIndent, translateEscapes, formatted String methods.

public class Question10 {
    public static void main(String args[])
    {
        String string1="Demonstrating repeat";
        System.out.println(string1.repeat(3));

        String str2 = "        Demonstrating strip method    !   ";
        System.out.println(str2.strip());


        String str3 = "    ";
        System.out.println("Is string blank:"+str3.isBlank());

        String str4 = "   ";
        System.out.println("Is string empty:"+str4.isEmpty());

        String string = "Demonstrating Indent ";
        System.out.println(string);
        string=string.indent(-2);
        System.out.println(string);

    }
}
