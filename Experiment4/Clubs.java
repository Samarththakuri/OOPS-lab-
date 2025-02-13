/*3. Create a Club class with a static variable clubName and a non-static variable memberName.
Provide a static method displayClubName() to print the club’s name.Create multiple Club objects and assign different member names to each.
Objective: Show how the static variable clubName is shared across all instances, while memberName remains unique to each object. Prove this by displaying each member’s name alongside the shared club name.
 */



class Club{
    static  String clubName="TLEeliminators";
    String memberName;
     static void displayClubName(){
        System.out.println(Club.clubName);
     }
    Club(String name){
        this.memberName=name;

     }


}

public class Clubs {
    public static void main(String a[]){
        Club member=new Club("Samarth");
       
    System.out.println(member.memberName);
    System.out.println(Club.clubName);

    }
}
