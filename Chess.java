public class Chess extends Game{ //defines a class named Chess that extends the Game class. 
    //This demonstrates inheritance, where Chess inherits the properties and methods of Game
    
    void scoreBoard () { // declares a method named scoreBoard().
        System.out.println("Welcome Jay,s Chess"); // prints the message

    }
    void playGame (){ //  declares another method named playGame(). The method body is empty, indicated by the curly braces 
        //{}. You can add code inside the method body to perform specific actions.

    }
    public static void main(String[] args) {
        Chess cs = new Chess ();
        cs.scoreBoard();
    }
}