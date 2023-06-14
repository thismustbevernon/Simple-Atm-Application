import java.util.Locale;
import java.util.Scanner;

public class emailObjects {
// we are going to make the variables private because we do not want people to access them: Encapsulation;
    private String firstName;
    private String lastName;
    private String password;
    private String department;

    private String email;

    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;

    private String companySuffix = "aeycompany.com";

    //constructor

    public emailObjects (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email created" + this.firstName +  this.lastName);

        // call a method asking for the department - return the department;
        this.department  = setDepartment();
        System.out.println("Department is:" + this.department);

        // call a method that returns a random password;
        this.password = randomPassword(this.defaultPasswordLength);

        System.out.println( "Your password is :" + this.password);

        // combine elements to generate email;
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department+ "." + this.companySuffix;
        System.out.println("Your email is:" + this.email);
    }



    // ask for department

    private String setDepartment (){
        System.out.print("DEPARTMENT CODES: \n 1 for sales \n 2 for Development \n 3 for Accounting \n 0 for none \n enter a department code:" );
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1) {return "sales";}
        else if (depChoice == 2) {return "dev";}
        else if (depChoice == 3){return "acct"; }
        else {return ""; }


    }

    // generate a random password

    private String randomPassword(int length){

        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";

        char[] password =  new char[length];

        for (int i = 0; i < length; i ++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);

    }

    //Set the mail box capacity.

    public void setMailBoxCapacity (int capacity) {
        this.mailBoxCapacity = capacity;
    }

    //set the alternate email

    public void setAlternateEmail (String altEmail){
        this.alternateEmail = altEmail;
    }

    //change the password.

    public void changePassword ( String password){
        this.password = password;
    }

    public int getMailBoxCapacity (){
        return this.mailBoxCapacity;
    }

    public String getAlternateEmail (){
        return this.alternateEmail;
    }

    public String getPassword ()
    {
        return this.password;
    }

}
