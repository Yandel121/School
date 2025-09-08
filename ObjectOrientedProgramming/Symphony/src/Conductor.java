import java.util.*;
public class Conductor {
    /*Create a program where a conductor calls for an instrument to play.
     */
    String Trumpet="Honk";
    String Flutes="FiU";
    String Violins= "Turururururu tututututututu";

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Conductor");
        System.out.println("Who will play first?");
        System.out.println("1. Trumpets?");
        System.out.println("2. Flutes?");
        System.out.println("3.Violins?");
        String options = sc.next();
        switch (options) {
            case "Trumpets":
                break;
                case "Flutes":
                    break;
                    case "Violins":
                        break;
                        default:
                            break;
        }
    }
    //Constructor
    public void conductor(String trumpet, String flutes, String violins) {
        Scanner sc = new Scanner(System.in);
         this.Trumpet= trumpet;
         this.Flutes = flutes;
          this.Violins= violins;

    }
    // Getters
    public String getTrumpet() {
        return Trumpet;
    }
    public String getFlutes() {
        return Flutes;
    }
    public String getViolins() {
        return Violins;
    }

    //Setters


    public void setTrumpet(String trumpet) {
        Trumpet = trumpet;
    }
    public void setFlutes(String flutes) {
        Flutes = flutes;
    }
    public void setViolins(String violins) {
        Violins = violins;
    }
}


