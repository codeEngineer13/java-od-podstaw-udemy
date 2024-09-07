package section8_OOP.explicitAndImplicitParamteres;

class Radio{

    int yearProduction;
    int volume;
    private String station;

    Radio(){
        this.yearProduction = 2000;
        this.volume = 100;
    }

    Radio(int yearProduction){
        this();
        this.yearProduction = yearProduction;
        this.changeStation("Rock");
    }

    public void changeStation(String station){
        this.station = station;
    }

    public Radio getRadio(){
        return this;
    }

    public void printRadioInfo(Radio radio){
        System.out.println("Station: "+radio.station );
    }
}

public class ThisUsage {

    public static void main(String[]args){
        Radio oldRadio = new Radio(1996);
        Radio newRadio = new Radio(2010);
        newRadio.printRadioInfo(oldRadio);

    }


}
