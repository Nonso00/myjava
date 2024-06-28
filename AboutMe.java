import java.util.Scanner;                                                                         // importing scanner
   // we import scanner when we want to get input from the user.
public class AboutMe {                                                                                                            // class name
     int personChoice;                                   // data type(int) assingned to the varriable (personChoice)

     public void myDetails() {                        // method                                                                                             // method                                                                // data type (int) which is assigned to the varriable(num)
          String Name;                                 // data type and variable
          int BirthYear;
          String BirthMonth;
          long PhoneNumber;
          Scanner sr = new Scanner(System.in);              // making use of the imported scanner by making it an object
          System.out.println("Welcome to my world");
          System.out.println("Please Enter Name");
          Name = sr.next();                                                         
          System.out.println("Please Enter Birth Year");
          BirthYear = sr.nextInt();
          System.out.println("Please Enter Birth Month");
          BirthMonth = sr.next();
          System.out.println("Please Enter Phone Number");
          PhoneNumber = sr.nextLong();
          System.out.println("Are you married ?");
          System.out.println("I know you are excited to know more about me.");
          System.out.println("Askme");
     }
     
     public void myStateOfOrigin() {
          String State = "Imo state\n from Isiala mbano local goverment\n it,s headquater is in the town of Umuelemai\n it has an area of 166 square km \n and a populatuion of 198,736 as at 2006 census. ";
          String AboutImoState = "Imo state is a state in the South-East geopolitical zone of Nigeria, bordered to the north by Anambra State,\n Rivers State to the west and south\n and Abia State to the east.\n it takes it,s name from the imo River which flows along the state,s eastern border.";
          String MajorThingsToKnow = "It has a Zoological Garden \n it has it,s very own Signature Hill (peculiar to the state alone) \n The state was named after the Imo River. \n it has one of the biggest and most viable oil palm plantation in west african \n imo is a state with many roundabout courtesy of the former governor (Rochas Okorocha)";
          String Askme;

          
           System.out.println("Welcome to my world");
           System.out.println("please enter state of origin");
           Scanner sr = new Scanner(System.in);
                  State = sr.next();
           System.out.println("kindly say few things about your state");
                 AboutImoState = sr.next();
           System.out.println("is ther any other thing you want to ask me ?");
          
          if (personChoice == 1) {
              myDetails();
              System.out.println();

          } else if (personChoice == 2) {
               myStateOfOrigin();

          } else if (personChoice == 3) {
               myFavouriteFood();

          } else if (personChoice == 4) {
               myFavouriteColour();

          } else if (personChoice == 5) {
               myHobbies();

          } else if (personChoice == 6) {
               myZodiacSign();

          } else {
               System.out.println("invalid option");
          }
     }

     public void myFavouriteFood() {
          String Food = "Beans & plantain porridge (Delicious!)\n Spaghetti & turkey\n (oga patapata of them all is still the king of protein Beans&plantain.)\n FAVOURITE SOUP\n Ofe onugbu (bitter leaf soup) \n Oha soup \n Ofe Nsala \n Banga Soup (its different from Ofe Akwu) \n ";
          String Fruit = "Mango \n Pinapple \n Banana \n avocadoPearl";
          String FavouriteJuice = "Chi exotic (coconut & pinapple) flavour \n Berry blast \n Greek yougurt";
          String Askme;

          Askme = "Do you want to continue or end";

          System.out.println("Welcome to faith world");
          System.out.println("Please enter your favourite food");
          Scanner sr = new Scanner(System.in);
          Food = sr.next();
          System.out.println("Please enter your favourite fruit");
          Fruit = sr. next();
          System.out.println("Please enter your favourite juice");
          String Juice = sr.next();
          System.out.println("is there anything you want to ask ? ");

          if (personChoice == 1) {
               myDetails();

          } else if (personChoice == 2) {
               myStateOfOrigin();

          } else if (personChoice == 3) {
               myFavouriteFood();

          } else if (personChoice == 4) {
               myFavouriteColour();

          } else if (personChoice == 5) {
               myHobbies();

          } else if (personChoice == 6) {
               myZodiacSign();

          } else {
               System.out.println("invalid option");
          }

     }

     public void myFavouriteColour() {
          String Colour = "Orange \n Purple";
          String Askme;

          Askme = "Do you want to continue";
          System.out.println("Welcome To Faith World");
          System.out.println("Enter your favourite colour");
          Scanner sr = new Scanner(System.in);
          Colour = sr.next();
          System.out.println("Do you want to continue");
          

          if (personChoice == 1) {
               myDetails();

          } else if (personChoice == 2) {
               myStateOfOrigin();

          } else if (personChoice == 3) {
               myFavouriteFood();

          } else if (personChoice == 4) {
               myFavouriteColour();

          } else if (personChoice == 5) {
               myHobbies();

          } else if (personChoice == 6) {
               myZodiacSign();

          } else {
               System.out.println("invalid option");
          }

     }

     public void myHobbies() {
          String hobbies = "Cooking \n Swimming \n Sewing \n Traveling \n etc";
          String Askme;

          Askme = "Do you want to continue";
          System.out.println("Welcome To Faith World");
          System.out.println("Please enter your hobbies");
          Scanner sr = new Scanner(System.in);
          hobbies = sr.next();
          System.out.println("Do you want to continue");
          

          if (personChoice == 1) {
               myDetails();

          } else if (personChoice == 2) {
               myStateOfOrigin();

          } else if (personChoice == 3) {
               myFavouriteFood();

          } else if (personChoice == 4) {
               myFavouriteColour();

          } else if (personChoice == 5) {
               myHobbies();

          } else if (personChoice == 6) {
               myZodiacSign();

          } else {
               System.out.println("invalid option");
          }

     }

      public void myZodiacSign(){
      String myZodiacSign = "Virgo \n virgo is the sixth astrological sign in the zodiac \n Under the tropical zodiac, the sun transist this area btw Aug 23rd - Sep 22. \n Symbol: Maiden \n Element: Earth \n Rulling Planet: mecury \n Start Date: Aug 23 \n End Date: Sep22 \n Constellation: Virgo \n Fall: Venus";
      String Askme;

     Askme ="Do you want to continue";

      System.out.println("Welcome To Faith World");
      System.out.println("Please input your zodiac sign");
      Scanner sr = new Scanner(System.in);
         myZodiacSign = sr. next ();
         System.out.println("Do you want to continue");
     

         if (personChoice ==1){
           myDetails();

      }else if(personChoice ==2){
         myStateOfOrigin();

      }else if(personChoice ==3){
         myFavouriteFood();

      }else if(personChoice ==4){
           myFavouriteColour();

      }else if(personChoice ==5){
           myHobbies();

      }else if(personChoice==6){
           myZodiacSign();


         }else{
       
          System.out.println("invalid option");
         }
     }
     public static void main (String[] args) {
          AboutMe am = new AboutMe();
          am.myDetails();
        //am.myZodiacSign();
        //am.myFavouriteFood();
        //am.myStateOfOrigin();
     }
}
