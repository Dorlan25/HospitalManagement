/**
 * Robert Flores 2016313
 * Johan Quiroz 2016337
 */
import java.util.Scanner;

public class Menu {
    PatientList<Patient> list = new PatientList<Patient>();
    Patient patient = new Patient();


    // This method --> will show all the options available for the user
    // from option 0 to 7 users will be able to choose what would they like to do
    public void MainMenu()
    {
        System.out.println("");
        System.out.println("-------------  WHAT WOULD YOU LIKE TO DO?  -------------");
        System.out.println("Enter 0 - To exit the program ");
        System.out.println("Enter 1 - To add a patien to the list ");
        System.out.println("Enter 2 - To add a patien in a specific position in the list");
        System.out.println("Enter 3 - To delete a patient from the list");
        System.out.println("Enter 4 - To update the information of a patien" );
        System.out.println("Enter 5 - To see the list of the patien " );
        System.out.println("Enter 6 - To find a patien by the ID");
        System.out.println("Enter 7 - To delete the last N number of patients ");
        System.out.println("Enter 8 - To see in what position your patient is");




        try {
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 0:
                    // if the user enter option "0" the program will stop
                    System.exit(0);
                    break;
                case 1:
                    // if the user enter option "1" the program will ask the user for PPS number, Firts name
                    // Last name, Mobile number, Email and city and will add the patient to the end of the list
                    list.add(patient.createPatien());
                    break;
                case 2:
                    // if the user enter option "2" the program will ask the user the position where
                    // the user want to accommodate the patient and then add the patient to the
                    // specific position.
                    System.out.println("Please enter what position you want this patien on the list");
                    int indexP = scanner.nextInt();
                    if(indexP < 0 || indexP > list.size())
                    {
                        System.out.println("Enter a valid index number");
                    }else{
                        list.addItem(indexP -1 , patient.createPatien());
                    }
                    break;
                case 3:
                    // if the user enter option "3" the program will ask for the ID and find the patient
                    // after that the patient will be deleted from the list
                    System.out.println("Please enter the Id of the patien that you would like to delete");
                    int id = scanner.nextInt();
                    list.delete(id-1);
                    System.out.println("Patien with the Id " + id + " has been deleted ");
                    break;
                case 4:
                    // if the user enter option "4" the program will ask for the ID and then display the
                    // patient, after that the user has to type all the attributes of the patient
                    // and the patient will be updated with the new attributes
                    System.out.println("Please enter the ID of the patien that you would like to update");
                    int id2 = scanner.nextInt();
                    if(list.get(id2-1).equals(null))
                    {
                        System.out.println("The id that you entered is incorrect");
                    }else{
                        System.out.println("This is the patient that you want to update " + list.get(id2-1));
                        list.delete(id2-1);
                        list.addItem(id2-1, patient.createPatien());
                        System.out.println("Your update had been successful");
                    }
                    break;
                case 5:
                    // if the user enter option "5" the program will show the list of patients
                    // with their attributes
                    System.out.println(list.toString());
                    break;
                case 6:
                    // if the user enter option "6" the program will ask for the ID of the patient
                    // and will find the patient and show all the attributes and the position
                    System.out.println("Please enter the ID of the patien you want to find");
                    int id3 = scanner.nextInt();
                    if(list.get(id3-1).equals(null))
                    {
                        System.out.println("This patient is not in the list");
                    }else{
                        System.out.println("Patient found at position: " + "\n" + (list.get(id3-1))  );
                    }
                    break;
                case 7:
                    // if the user enter option "7" the program will ask for a number
                    // and will delete all the patients from that specific patient
                    System.out.println("Please enter a number to delete N number of patients");
                    int n = scanner.nextInt();
                    list.deleteLastNodes(n+1);
                    System.out.println("Your last " + n + " patients has been deleted");
                    break;
                case 8:
                    // if the user enter option "8" the program will ask for a number
                    // and will delete from that number to the end of the list
                    System.out.println("Please enter the ID to see in what position the patient is");
                    int position = scanner.nextInt();
                    System.out.println("Patient is in the position in the list  " + position + " \n" + list.get(position-1)  );

            }

        } catch (Exception e)
        {
            System.out.println("Please try a valid number");
            MainMenu();
        }

    }



    public void execute(){
        Menu menu = new Menu();


        int counter = 0;
        do{
            menu.MainMenu();
            counter++;
        }while(counter< 100);
    }
}
