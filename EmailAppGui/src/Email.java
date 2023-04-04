import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength=10;
    private String alternateEmail;
    private String company;
    private String companySuffix="joenterprise.com";

    // Constructor to receive the first and last  name

    public Email(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
       //1 System.out.println("Email created :"+this.firstName+" "+this.lastName);

        // Call a method asking for the department
      //  this.department= setDepartment();
        this.department= department;
      //2  System.out.println("Department is: "+this.department);

        // Call a method that returns a random password
        this.password=randomPassword(defaultPasswordLength);
      // 3 System.out.println("Your password is "+this.password);

        // combine element to generate email
        email= firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
       //4 System.out.println("Your email is "+email);
    }


    // Ask for the department

    /* private String setDepartment (){

        System.out.println( "DEPARTMENT CODES \n1 for sales \n2 for Development \n3 for Accounting \n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice= in.nextInt();
        if(depChoice==1)
            return "sales";
        else if(depChoice==2)
            return "dev";
        if(depChoice==3)
            return "acct";
        else return "";

    }*/
    
    



    // Generate a random password

    private String randomPassword (int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
        char [] password = new char[length];
        for(int i=0; i<length;i++){
            int rand = (int)(Math.random()*passwordSet.length());
            password[i]= passwordSet.charAt(rand);
        }
        return new String(password);
    }
    
    // ShowInfo
    
    public String showInfo() {
    	
    	
    	return "Email created :"+this.firstName+" "+this.lastName+
    			"\nDepartment is: "+this.department+
    			"\nYour password is: "+this.password+
    			"\nYour email is "+email;
    }

    // Set the mailbox capacity

    public void setMailboxCapacity(int capacity){

        this.mailboxCapacity=capacity;

    }

    // Set alternate email

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }


    // Change the password
    public void changePassword (String password){
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }
}
