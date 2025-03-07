public class Logika {

    Vstupy vstup = new Vstupy();
    Vystupy vystup = new Vystupy();

    int domaci = 0;
    int hoste = 0;
    int input = 0;

    int vyhraHra=0;
    int domaciGem=0;
    int hosteGem=0;
    int vyhraSetDomaci=0;
    int vyhraSetHoste=0;
    boolean VyhraHra = true;

    void GemDomaci(){
        domaciGem++;
        domaci = 0;
        hoste = 0;
    }

    void GemHoste(){
        hosteGem++;
        hoste = 0;
        domaci = 0;
    }

    void Shoda(){
        hoste = 40;
        domaci = 40;
    }

    void SetDomaci(){
        vyhraSetDomaci++;
        domaciGem = 0;
        hosteGem = 0;
        domaci = 0;
        hoste = 0;
    }

    void SetHoste(){
        vyhraSetHoste++;
        domaciGem = 0;
        hosteGem = 0;
        domaci = 0;
        hoste = 0;
    }

    void NactiHru() {
        while(VyhraHra) {
            vstup.NactiVstup();
            if (vstup.input == 1) {
                if (domaci <30){
                    domaci += 15;
                }else{
                    domaci += 10;
                }
            }else if (vstup.input == 2) {
                if (hoste <30){
                    hoste += 15;
                }else{
                    hoste += 10;
                }
            }

            if(domaci == 60 && hoste==40){
                GemDomaci();
            }
            else if(hoste == 60 && domaci==40){
                GemHoste();
            }
            else if(hoste == 50 && domaci<40){
                GemHoste();
            }else if(domaci == 50 && hoste<40){
                GemDomaci();
            }

            else if(domaci==50 && hoste==40){
                vystup.VyhodaHoste(hoste);
            }
            else if(domaci==40 && hoste==50){
                vystup.VyhodaDomaci(domaci);
            }

            else if(domaci==50 && hoste==50){
                Shoda();
            }

            if( domaciGem >= 5 && hosteGem >=5){
                if(domaciGem > hosteGem + 1){
                    SetHoste();
                }
            }
            if( domaciGem >= 5 && hosteGem >=5){
                if(hosteGem > domaciGem + 1){
                    SetDomaci();
                }
            }
            if(domaciGem == 6 && hosteGem<=4){
                SetHoste();
            }
            if(hosteGem == 6 && domaciGem<=4){
                SetDomaci();
            }
            if(vyhraSetHoste ==2){
                vystup.VitezDomaci();
                VyhraHra = false;
            }else if(vyhraSetDomaci == 2){
                vystup.VitezHoste();
                VyhraHra = false;
            }
            vystup.ZobrazStav(domaci,hoste,domaciGem,hosteGem,vyhraSetHoste,vyhraSetDomaci);
        }
    }
}
