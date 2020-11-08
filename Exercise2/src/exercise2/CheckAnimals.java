package exercise2;

public class CheckAnimals {
    
    String check;
    
    public String Check(String type){
        
        if (type.equals("dog") || type.equals("cat") || type.equals("fish") ||
                type.equals("turtle") || type.equals("giraffe") || 
                type.equals("elephant") || type.equals("lion") ||
                type.equals("iguana") || type.equals("hamster")){
                
            check = "0";
            
        }else{
            
            check = "1";
        }
        return check;
    
    }



}
