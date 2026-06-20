package deck_of_cards;
public class Deck_of_cards {
    public static void main(String[] args) {
        /*
   int [] deck = new int[52];
   String [] suits = {"Spades" , "Hearts" , "Daimonds" , "Clubs"};
   String [] ranks = {"Ace" , "2" , "3", "4", "5", "6", "7", "8", "9" , "Jack" , "Queen" , "King"};
   
   for (int i = 0; i<deck.length ; i++)
       deck[i] = i;
    for (int i = 0 ; i< deck.length ; i++){
   int index = (int) (Math.random() * deck.length);
     int temp =  deck[index];
     deck[index] = deck[i];
     deck[i] = temp;
    }
    
    for (int i = 0 ; i < 4 ; i++){
       String suit = suits[deck[i] / 13];
       String rank = ranks[deck[i] % 13];
       
        System.out.println("Card number " + deck[i] + " : "+ rank + " of " + suit);
        }
        
        */
        
        
        int [] deck = new int [52];
        String [] suits = {"Spades" , "Hearts" , "Daimonds" , "Clubs"};
        String [] ranks = {"Ace" , "10" , "2", "3", "4", "5", "6", "7", "8", "9", "Jack" , "Queen" , "King"};
        for (int i = 0; i<deck.length; i++)
            deck[i] = i;
        for (int i = 0; i<deck.length ; i++){
            int index =(int) (Math.random() * deck.length);
            int temp = deck[index];
            deck[index] = deck[i];
            deck[i] = deck[index];
        }
         for (int i = 0; i < 4 ; i++){
        String suit = suits[deck[i] / 13];
        String rank = ranks[deck[i] % 13];
        
             System.out.println("Card number "+ i + " : " + rank +" of "  + suit );
         }
        
        
        
        
    
     
     
    
    }
    
}
