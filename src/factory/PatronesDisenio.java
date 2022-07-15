

package factory;


public class PatronesDisenio {
    
    public interface Card{
        void payment();
    }
    
    public class Basic implements Card{

        @Override
        public void payment() {
            System.out.println("Payment Basic!");
        } 
    
    }  
    
    public class Premium implements Card{

        @Override
        public void payment() {
            System.out.println("Payment Premium!");
        } 
    
    }
    
    public class VIP implements Card{

        @Override
        public void payment() {
            System.out.println("Payment VIP!");
        } 
    
    }  
    
    public abstract class CreditCard{
        
        protected double charge=0;
        protected double limit=0;
        
        public void payment(){
            
            Card credCard=new createCard();
            credCard.payment();
        }
        
        public abstract Card createCard();
    }
    
    public class CreditCardBasic extends CreditCard{

        @Override
        public Card createCard() {
            return new BasicCard();
        }
        
    }
    
    public class CreditCardPremium extends CreditCard{

        @Override
        public Card createCard() {
            return new PremiumCard();
        }
        
    }
    
    public class CreditCardVIP extends CreditCard{

        @Override
        public Card createCard() {
            return new VIPCard();
        }
        
    }
    
}
