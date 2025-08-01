package If_Else;
    public class App {
        public static void main(String args[]){
            boolean isMale = false;
            String name = "Karan";
            if(isMale == true){
                System.out.println("Mr."+name);
            }
            else{
                System.out.println("Mrs. "+ name);
            }
            boolean isSenior = false;
            boolean isAdult = false;
            if(isSenior){
                System.out.println("Hello Senior");
            }
            else if(isAdult){
                System.out.println("Hello Adult");
            }
            else{
                System.out.println("Hello Child");
            }
        }
    }
