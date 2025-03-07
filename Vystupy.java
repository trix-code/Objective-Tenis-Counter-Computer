public class Vystupy {

    void ZobrazStav(int domaci, int hoste, int domaciGem, int hosteGem, int vyhraSetDomaci, int vyhraSetHoste) {

        String bodyDomaci = (domaci == 50) ? "AD" : String.valueOf(domaci);
        String bodyHoste = (hoste == 50) ? "AD" : String.valueOf(hoste);

        System.out.println("    DOMACI:     -       HOSTE ");
        System.out.println("BODY:        "  +bodyDomaci+" -    "+bodyHoste);
        System.out.println("GEMY:        "  +domaciGem+ " - "  +hosteGem);
        System.out.println("SETY:        "  +vyhraSetDomaci+ " - "  +vyhraSetHoste);
    }

    void VyhodaDomaci(int hoste){
        System.out.println("BODY:        AD -    "+hoste);
    }
    void VyhodaHoste(int domaci){
        System.out.println("BODY:        "+domaci+ "-   AD");
    }

    void VitezDomaci(){
        System.out.println("VITEZI DOMACI");
    }
    void VitezHoste(){
        System.out.println("VITEZI HOSTE");
    }

    void Zacatektext(){
        System.out.println("Zadej cislo 1 = domaci / 2 = hoste");
    }

    void SpatnyText(){
        System.out.println("Spatny input, zadej pouze cislo 1 / 2");
    }
}
