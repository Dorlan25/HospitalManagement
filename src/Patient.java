/**
 * Robert Flores 2016313
 * Johan Quiroz 2016337
 */
import java.util.Scanner;

public class Patient {


    private final int pId;
    private static int auxId = 1;
    private int ppsNumber;
    private String fName;
    private String lName;
    private String mobileNumber;
    private String email;
    private String city;
    private Patient next;


    /**
     * Constructor for the patient
     * @param ppsNumber
     * @param fName
     * @param lName
     * @param mobileNumber
     * @param email
     * @param city
     */
    public Patient(int ppsNumber, String fName, String lName,String mobileNumber, String email, String city){
        this.pId = auxId;
        this.ppsNumber = ppsNumber;
        this.fName = fName;
        this.lName = lName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.city = city;

        this.next = null;

        auxId++;
    }


    public Patient(int ppsNumber, String fName, String lName, String mobileNumber, String email, String city,
                   Patient next) {
        this.pId = auxId;
        this.ppsNumber = ppsNumber;
        this.fName = fName;
        this.lName = lName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.city = city;

        this.next = next;

        auxId++;
    }


    /**
     * Default constructor for the patient class
     */
    public Patient(){
        this.pId = auxId;
    }


    // All these methods are getters for the patient class

    /**
     *
     * @return the patient unique ID
     */
    public int getpId() {
        return pId;
    }


    /**
     *
     * @return the pps number of the patient
     */
    public int getPpsNumber() {
        return ppsNumber;
    }

    /**
     *
     * @return the first name of the patient
     */
    public String getfName() {
        return fName;
    }

    /**
     *
     * @return the last name of the patient
     */
    public String getlName() {
        return lName;
    }

    /**
     *
     * @return the mobile number of the patient
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     *
     * @return the email of the patient
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return the city of the patient
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @return the next patient
     */
    public Patient getNext() {
        return next;
    }




    // All these methods are setters for the patient class


    /**
     *
     * @param set the pps number on the patient
     */
    public void setPpsNumber(int ppsNumber) {
        this.ppsNumber = ppsNumber;
    }

    /**
     *
     * @param set the first name on the patient
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     *
     * @param set the last name on the patient
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     *
     * @param set the mobile number on the patient
     */
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    /**
     *
     * @param set the email on the patient
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param set the city on the patient
     */
    public void setCity(String city) {
        this.city = city;
    }


    // This method will show all the attributes of every patient that the user want to retrieve
    @Override
    public String toString() {
        return "Patien ID: " + pId  + "\n"
                + " PPS Number: " + ppsNumber + "\n"
                + " First Name: " + fName + "\n"
                + " Last Name: " + lName+ "\n"
                + " Mobile Number: " + mobileNumber + "\n"
                + " Email: " + email + "\n"
                + " City: " + city + "\n";
    }




    /**
     * This method will create a new patient every time needed on the application
     * @return will return the Patient it self
     */
    public Patient createPatien(){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter PPS number");
        int pps = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the first name");
        String name = scanner.nextLine();
        System.out.println("Enter the last name");
        String lName = scanner.nextLine();
        System.out.println("Enter mobile number");
        String mobileNumber = scanner.nextLine();
        System.out.println("Enter email");
        String email = scanner.nextLine();
        System.out.println("Enter city ");
        String city = scanner.nextLine();
        Patient patient = new Patient(pps, name, lName, mobileNumber, email, city);
        System.out.println("Your patien has been added to the list");
        return patient;
    }
}
