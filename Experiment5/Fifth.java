class Chef {
    void makeSpecialDish() {
        System.out.println("Chef is making a special dish.");
    }
}
class ItalianChef extends Chef {
    void makeSpecialDish() {
        System.out.println("Making pasta.");
    }
}

class ChineseChef extends Chef {
    void makeSpecialDish() {
        System.out.println("Making dumplings.");
    }
}
class MexicanChef extends Chef {
    void makeSpecialDish() {
        System.out.println("Making tacos.");
    }
}
public class Fifth{
    public static void main(String[] args) {
        Chef[] chefs = {
            new ItalianChef(),
            new ChineseChef(),
            new MexicanChef()
        };
        for (int i = 0;i<chefs.length;i++) {
            chefs[i].makeSpecialDish(); 
 }
}
}