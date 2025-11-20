
package Week02;
import java.util.Scanner;
/**
 * Write a description of class Wk_2_Wo_1 here.
 *
 * @author (Ayush)
 * @version (a version number or a date)
 */
public class Wk_2_Wo_1
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        /**
         * Question Number 1
        System.out.println("My name is:");
        System.out.println("Ayush Prasad Shrestha");
        
        
        //Question Number 2
        int a = 10;
        System.out.println(++a); //first increments and then prints i.e prefix
        System.out.println(a++); //first prints and then incremetns i.e postfix
        
        //Question Number 4
        ;
        System.out.println("Type your Name: ");
        String StudentName = input.nextLine();
        System.out.println("Type your Age: ");
        int Age = input.nextInt();
        System.out.println("Type your GPA: ");
        float GPA = input.nextFloat();
        System.out.println(StudentName);    
        System.out.println(Age);
        System.out.println(GPA);
        
        //Question Number 5
        System.out.println("Type Number 1");
        int Num1 = input.nextInt();
        System.out.println("Type Number 2");
        int Num2 = input.nextInt();
        System.out.println(Num1+" + "+Num2+" = "+(Num1+Num2));
        System.out.println(Num1+" - "+Num2+" = "+(Num1-Num2));
        System.out.println(Num1+" X "+Num2+" = "+(Num1*Num2));
        System.out.println(Num1+" / "+Num2+" = "+(Num1/Num2));
        System.out.println((Num1 > Num2) ? Num1+">"+Num2: Num2+">"+Num1);
        
        
        //Question Number 6
        System.out.println("ENTER WATER LEVEL:");
        var WaterLevel = input.nextInt();
        System.out.println("Current water level: "+ WaterLevel);
        System.out.println(WaterLevel >= 1000? "WARNING: Water levl has reached 1000L or more!!!" : "Status: Normal");
        
        */
        //Question Number 7
        //Program to note down the medicines in stock bought from the wholeseller.
        String[] MedicineNames = new String[100];//Creating arrays
        double[] MedicinePrices = new double[100];
        int[] MedicineAmount = new int[100];
        int Count = 0;
        
                while (true) {
            
            System.out.println("NAME OF THE MEDICINE: ");
            String Name = input.nextLine();
            
            System.out.println("PRICE OF THE MEDICINE");
            double Price = input.nextDouble();
            
            System.out.println("AMOUNT OF THE MEDICINE");
            int Amount = input.nextInt();
            
            
            MedicineNames[Count] = Name;
            MedicinePrices[Count] = Price;
            MedicineAmount[Count] = Amount;
            Count++;
            
            input.nextLine();
            System.out.println("ADD ANOTHER: [Y/N]");
            String choice = input.nextLine();
            
            if (choice.equalsIgnoreCase("N")) {
                break;          
            }
        }
        System.out.println("*******     Stock Report        *******");
        for (int i = 0; i < Count; i++) 
        {   
            System.out.println(i+1+". "+MedicineNames[i]+" --> Rs."+ MedicinePrices[i]+" Amount: "+MedicineAmount[i]);           
        }
        
        
        // For customer billing
        System.out.println("*******     Customer Billing        *******");
        int ItemCount = 0;
        String[] ItemName = new String[100];
        int[] ItemPrice = new int[100];
        int[] ItemAmount = new int[100];
        while(true){
            System.out.println("Item Name: ");
            ItemName[ItemCount] = input.nextLine();
            System.out.println("Item Price: ");
            ItemPrice[ItemCount] = input.nextInt();
            System.out.println("Item Amount:");
            ItemAmount[ItemCount] = input.nextInt();
            ++ItemCount;
            input.nextLine();
            System.out.println("ADD ANOTHER: [Y/N]");
            String choice = input.nextLine();
            
            if (choice.equalsIgnoreCase("N")) {
                break;          
            }
        }
        System.out.println("");
        System.out.println("======================================================");
        System.out.println("            Medicine Bill");
        System.out.println("======================================================");
        System.out.println("S.N  Item            Rate           Amount           Net Amount");
        int TotalAmount = 0;
        for (int a = 0; a < ItemCount; a++){
            int NetAmount = ItemPrice[a]*ItemAmount[a];
            TotalAmount = TotalAmount + NetAmount;
            System.out.println(a+1+"."+ItemName[a]+" --- "+ItemPrice[a]+" --- "+ItemAmount[a]+" --- "+NetAmount);
        }
        System.out.println("                                     Total Amount: "+ TotalAmount);
        System.out.println("======================================================");
        System.out.println("");
        
        //Stock update
        int ChangeValue=0;
        int ItemNumberTemp=0;
        System.out.println("********    Updated Inventory   ********");
        for (int a =0; a < Count; a++){
            if(ItemName[ItemNumberTemp].equalsIgnoreCase(MedicineNames[a])){
                --MedicineAmount[a];
                ++ChangeValue;
                ++ItemNumberTemp;
                System.out.println("Changed amount of: "+MedicineNames[a]+" Remaining: "+MedicineAmount[a]);
            }
        }
        System.out.println("");
        System.out.println("Do you want to review new inventory? [Y/N]");
        if(input.nextLine().equalsIgnoreCase("Y")){
            System.out.println("*******     Update Stock Report        *******");
            for (int i = 0; i < Count; i++) 
            {   
            System.out.println(i+1+". "+MedicineNames[i]+" --> Rs."+ MedicinePrices[i]+" Amount: "+MedicineAmount[i]);           
            }
        }
        }
    } 
