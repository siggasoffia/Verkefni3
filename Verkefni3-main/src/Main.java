import src.is.hi.ssj44.hbv202.ass3.frontend.UserInterface;
import src.is.hi.ssj44.hbv202.ass3.backend.*;

public class Main {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        UserInterface ui = new UserInterface();
        String greeting;

        greeter.setEnglish();
        greeting=greeter.greet();
        ui.show(greeting);

        greeter.setGerman();
        greeting=greeter.greet();
        ui.show(greeting);
    }

}
