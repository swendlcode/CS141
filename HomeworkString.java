public class HomeworkString {
    public static void main(String[] args) {
        String[] anArray = new String[3]; // List with FullNames
        anArray[0] = "Kane, Erica";
        anArray[1] = "Chandler, Adam";
        anArray[2] = "Martin, Tadd";

        for (int i = 0; i < 3; i++) { //For loop for print all of this
            String FullName = anArray[i];
            String result = Convert(FullName);
            System.out.println(result);

        }

    }

    public static String Convert(String FullName) { //Convert method
        String LastName = FullName.substring(0, FullName.indexOf(","));
        String FirstName = FullName.substring(FullName.indexOf(" ") + 1);
        return FirstName + " " + LastName.toUpperCase();


    }
}
