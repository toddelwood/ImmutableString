public class ImmutableString {

    private static String name1  = "Jerry";
    private static String name2 = "Jerry";

    public static void main(String[] args) {

        System.out.println("Immutable String\n");


        System.out.println("name1: " + name1);
        System.out.println("name2: " + name2);
        System.out.println("\n");
        System.out.println("Eval: (name1 == name2)\n");

        if (name1 == name2) {
            System.out.println(">Since both string variables name='" + name1 + "' and name2='" + name2 + "' are assigned the " +
                    "same data content, both are assigned the same Object Reference ID, so the relational operation '==' evaluates to TRUE\n\n");

        }

        System.out.println("Eval: name1.equals(name2)\n");
        if (name1.equals(name2)) {
            System.out.println(">Applying the String equal() method variables name1='" + name1 + "' and name2='" + name2 + "' evaluate to TRUE" +
                    "The String equal() method evaluates the data contents and not the Object Reference ID \n\n");
        }


        String name4 = new String("Jerry");
        System.out.println("name4: " + name4);
        System.out.println(">Create another string variable name4='" + name4 + "' which contains the same data values for name1 and name2, however we will create name4 using" +
                "(new) String. Using String str = new String notation creates the content in a new location on the Heap Memory, therefore, the Object " +
                "Reference ID will be different.\n\n");

        System.out.println(">Even though we assigned the same name. If we apply the relational operator == it evaluates to FALSE" +
                ". Variables name1 and name4 have the same data, however, since we applied the new String notation, we have a different Object Reference ID\n\n");

        System.out.println("Eval: (name1 == name4)\n");
        if (name1 == name4) {
        } else {
            System.out.println("String variables name1 '" + name1 + "' and '" + name4 + "' Do not equal because the Object Reference ID is different\n\n");
        }

        System.out.println("Eval: name1.equals(name4)\n");
        if (name1.equals(name4)) {
            System.out.println("'Using String equal notation will evaluate the contents, therefore the evaluation equals TRUE\n\n");
        } else {
            System.out.println("'name1.equals(name4)' - Not Equal\n\n");
        }


        String name7 = "Jer";
        name7 = name7.concat("ry");
        System.out.println("Create concatenated String name7: Jer  ry");


        if (name1 == name7) {
            System.out.println("Eval: (name1 == name7) - Equal");
        } else {
            System.out.println("Eval: (name1 == name7) - Even though the String was not created with (new) String syntax the concatenate string " +
                    "does not equal that same contents. Concatented string are allocated memory on the Heap Memory so the new is automatically initialed");
        }


        System.out.println("\n\n");
        System.out.println("Comparing 'new' String(\"\") and assigned string");
        String name8 = new String("Jerry");
        System.out.println("name1 " + name1);
        System.out.println("name8 " + name8);

        if (name1 == name8) {
            System.out.println("Eval: (name1 == name8) - Equal");
        } else {
            System.out.println("Eval: (name1 == name8) - Not Equal");
        }

    }

}
