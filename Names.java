package names;


public class Names {

    public static void main(String[] args) {
        String myName = "Mihaela";
        String mySurname = "Lazarova";
        int age = 33;
        String myHusbantName = "Miroslav";
        String myHusbantSurname = "Lazarov";
        int age2 = 41;

        System.out.println(myName);
        System.out.println(myName.equals(myHusbantName));
        System.out.println(myName.equalsIgnoreCase(myHusbantName));
        System.out.println(myName.compareTo(myHusbantName));
        System.out.println(myName+mySurname);
        System.out.println(age);
        System.out.println(myName+"\t " + mySurname+ "\t" + age);
        System.out.println(myHusbantName+ " " + myHusbantSurname + " " + age2);





    }
}
