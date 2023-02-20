import java.io.*;
import java.util.Scanner;

class ResidentialSociety
{
    String societyName;
    String location;
    String SecretorName;
}

class Building extends ResidentialSociety
{
    String buildingName;
    int totalNumberOfApartments;
}

class Apartment extends Building
{
    String apartmentNumber;
    String ownerName;
    String electricMeterNumber;

    Apartment(String Houseid, String Bulding, String OwnerName, String Electricity)
    {
        this.apartmentNumber = Houseid;
        this.ownerName = OwnerName;
        this.electricMeterNumber = Electricity;
        super.buildingName = Bulding;
    }
}

public class assignTwoTaskFour
{
    static String[] data = { "1.View Apartment Details","2.view Building Details","3.View Society Details" };

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ResidentialSociety Res = new ResidentialSociety();
        Res.societyName = "Galaxy-Apartment Residential Society";
        Res.location = "Banjara Hills, Hyderabad";
        Res.SecretorName = "ABC";
        Building b[] = new Building[3];
        Apartment A1[] = new Apartment[10];
        Apartment A2[] = new Apartment[10];
        Apartment A3[] = new Apartment[10];

        try
        {
            String line =null;
            int count = 0;
            int id = 0;
            BufferedReader br = new BufferedReader(new FileReader("apartment.csv"));
            while ((line = br.readLine()) != null)
            {
                String[] apart = line.split(",");
                if (count % 10 == 0)
                    id = 0;
                if (count < 10) {
                    A1[id] = new Apartment(apart[0], apart[1], apart[2], apart[3]);
                } else if (count < 20) {
                    A2[id] = new Apartment(apart[0], apart[1], apart[2], apart[3]);
                } else if (count < 30) {
                    A3[id] = new Apartment(apart[0], apart[1], apart[2], apart[3]);
                }
                count++;
                id++;
            }
            while (true)
            {
                for (int i = 0; i < 3; i++)
                {
                    System.out.println(data[i]);
                }
                System.out.println("Enter your choice");
                int option = sc.nextInt();
                if (option == 1)
                {
                    System.out.println();
                    for (int i = 0; i < 10; i++)
                    {
                        System.out.println("Apartment Id : " + A1[i].apartmentNumber + " , Building Name :"+ A1[i].buildingName + " , Owner Name : " + A1[i].ownerName+ " , Electric Meter Number : " + A1[i].electricMeterNumber);
                    }
                    for (int i = 0; i < 10; i++)
                    {
                        System.out.println("Apartment Id : " + A2[i].apartmentNumber + " , Building Name :"+ A2[i].buildingName + " , Owner Name : " + A2[i].ownerName+ " , Electric Meter Number : " + A2[i].electricMeterNumber);
                    }
                    for (int i = 0; i < 10; i++)
                    {
                        System.out.println("Apartment Id : " + A3[i].apartmentNumber + " , Building Name :"+ A3[i].buildingName + " , Owner Name : " + A3[i].ownerName+ " , Electric Meter Number : " + A3[i].electricMeterNumber);
                    }
                
                }
                else if (option == 2)
                {
                    System.out.println();
                    System.out.println("Building name : A, Apartments available: 10");
                    System.out.println("Building name : B, Apartments available: 10");
                    System.out.println("Building name : C, Apartments available: 10");
                }
                else if (option == 3)
                {
                    System.out.println();
                    System.out.println("Society Name : " + Res.societyName + ",  Location : " + Res.location);
                }
                else
                {
                    System.out.println("You have Entered a Wrong Choice");
                }
                System.out.println("Press Any key to Continue or Press x to stop");
                char ch = sc.next().charAt(0);
                if (ch == 'x'|| ch=='X')
                    break;
            }

        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
    }
}
