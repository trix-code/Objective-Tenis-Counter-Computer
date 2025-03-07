import java.util.Scanner;

public class Vstupy {

    Scanner scanner = new Scanner(System.in);

    Vystupy vystup = new Vystupy();

    int input;

    void NactiVstup(){

        vystup.Zacatektext();

        while(true){
            String inputScanner = scanner.nextLine();

            if(inputScanner.equals("1")){
                input = 1;
                break;
            }
            else if(inputScanner.equals("2")){
                input = 2;
                break;
            } else {
                vystup.SpatnyText();
            }
        }
    }
}
