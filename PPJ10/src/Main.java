public class Main {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(10);
        kwadrat.show();

        Walec walec = new Walec(5, 10);
        walec.show();

        Prostokat prostokat = new Prostokat(10, 5);
        prostokat.show();

        Prostopadloscian prostopadloscian = new Prostopadloscian(7, prostokat);
        prostopadloscian.show();

        Prostopadloscian prostopadloscian1 = new Prostopadloscian(15, 10, 5);
        prostopadloscian1.show();

        Trojkat trojkat = new Trojkat(10, 5);
        trojkat.show();

        Ostroslup ostroslup = new Ostroslup(7, trojkat);
        ostroslup.show();

        Ostroslup ostroslup1 = new Ostroslup(11, 5, 7);
        ostroslup1.show();

        Graniastoslup graniastoslup = new Graniastoslup(5, trojkat);
        graniastoslup.show();

        Graniastoslup graniastoslup1 = new Graniastoslup(11, 5, 7);
        graniastoslup1.show();

        Drzewo drzewo = new Drzewo(true, 10, "duży");
        System.out.println(drzewo + "\n");

        DrzewoIglaste drzewoIglaste = new DrzewoIglaste(true, 10, "słaby", 10000, 3.0);
        System.out.println(drzewoIglaste + "\n");

        DrzewoLisciaste drzewoLisciaste = new DrzewoLisciaste(false, 5, "duży", 2000);
        System.out.println(drzewoLisciaste + "\n");

        DrzewoOwocowe drzewoOwocowe = new DrzewoOwocowe(false, 7, "sriedni", "Banan");
        System.out.println(drzewoOwocowe + "\n");
    }
}

class Kwadrat {
    private final int bok;

    Kwadrat(int bok) {
        this.bok = bok;
    }

    void show() {
        int polePowerchni = bok * bok;
        int objetosc = polePowerchni * bok;
        System.out.println("Pole powierzchni kwadratu: " + polePowerchni);
        System.out.println("Objętość sześcianu zbudowanego na podstawie tego kwadratu: " + objetosc + "\n");
    }
}

class Walec {
    private final int promien;
    private final int wysokosc;

    Walec(int promien, int wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    void show() {
        double polePowierzchniPodstawy = Math.PI * promien * promien;
        double objętość = polePowierzchniPodstawy * wysokosc;
        System.out.println("Pole powierzchni podstawy walca: " + polePowierzchniPodstawy);
        System.out.println("Objętność walca: " + objętość + "\n");
    }

}

class Prostokat {
    private final int bokA;
    private final int bokB;

    Prostokat(int bokA, int bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public int getBokA() {
        return bokA;
    }

    public int getBokB() {
        return bokB;
    }

    void show() {
        int polePowierzchni = bokA * bokB;
        System.out.println("Pole powierzchni prostokąt: " + polePowierzchni + "\n");
    }
}

class Prostopadloscian extends Prostokat {
    private final int bokC;

    Prostopadloscian(int bokC, Prostokat p) {
        super(p.getBokA(), p.getBokB());
        this.bokC = bokC;
    }

    Prostopadloscian(int bokA, int bokB, int bokC) {
        super(bokA, bokB);
        this.bokC = bokC;
    }

    void show() {
        int polePowierzchni = (getBokA() * getBokB() * 2) + (getBokA() * bokC * 2) + (getBokB() * bokC * 2);
        int objetosc = getBokA() * getBokB() * bokC;
        System.out.println("Pole powierzchni prostopadloscianu: " + polePowierzchni);
        System.out.println("Objętość prostopadloscianu: " + objetosc + "\n");
    }


}

class Trojkat {
    private final int bok;
    private final int wysokosc;

    Trojkat(int bok, int wysokosc) {
        this.bok = bok;
        this.wysokosc = wysokosc;
    }

    public int getBok() {
        return bok;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    void show() {
        int polePowierzchni = bok * wysokosc / 2;
        System.out.println("Pole powierzchni trojkata" + polePowierzchni + "\n");
    }


}

class Ostroslup extends Trojkat {
    private final int wysokoscOstroslupa;

    Ostroslup(int wysokoscOstroslupa, Trojkat trojkat) {
        super(trojkat.getBok(), trojkat.getWysokosc());
        this.wysokoscOstroslupa = wysokoscOstroslupa;
    }

    Ostroslup(int bok, int wysokoscTrojkata, int wysokoscOstroslupa) {
        super(bok, wysokoscTrojkata);
        this.wysokoscOstroslupa = wysokoscOstroslupa;
    }

    void show() {
        int polePowierzchni = (getBok() * getBok()) + (getBok() * getWysokosc() * 4);
        int objetosc = (getBok() * getBok() / 3) * wysokoscOstroslupa;
        System.out.println("Pole powierzchni ostrosłupa: " + polePowierzchni);
        System.out.println("Objętość ostrosłupa: " + objetosc + "\n");
    }
}

class Graniastoslup extends Trojkat {
    private final int wysokoscBoczna;

    Graniastoslup(int wysokoscBoczna, Trojkat t) {
        super(t.getBok(), t.getWysokosc());
        this.wysokoscBoczna = wysokoscBoczna;
    }

    Graniastoslup(int bok, int wysokoscTrojkata, int wysokoscBoczna) {
        super(bok, wysokoscTrojkata);
        this.wysokoscBoczna = wysokoscBoczna;
    }

    void show() {
        int polePowierzchni = (2 * getBok() * getWysokosc()) + (3 * getBok() * wysokoscBoczna);
        int objetosc = (2 * getBok() * getWysokosc() * wysokoscBoczna);
        System.out.println("Pole powierzchni Graniastoślupu: " + polePowierzchni);
        System.out.println("Objętość Graniastoślupu: " + objetosc + "\n");
    }
}

class Drzewo {
    boolean wiecznieZielone;
    int wysokosc;
    String przekrojDrzewa;

    Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    @Override
    public String toString() {
        return "Drzewo{" +
                "wiecznieZielone=" + wiecznieZielone +
                ", wysokosc=" + wysokosc +
                ", przekrojDrzewa='" + przekrojDrzewa + '\'' +
                '}';
    }
}

class DrzewoIglaste extends Drzewo {
    int iloscIgiel;
    double dlugoscSzyszki;

    DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel, double dlugoscSzyszki) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    @Override
    public String toString() {
        return "DrzewoIglaste{" +
                "wiecznieZielone=" + wiecznieZielone +
                ", wysokosc=" + wysokosc +
                ", przekrojDrzewa='" + przekrojDrzewa + '\'' +
                ", iloscIgiel=" + iloscIgiel +
                ", dlugoscSzyszki=" + dlugoscSzyszki +
                '}';
    }
}

class DrzewoLisciaste extends Drzewo {
    int ksztaltLiscia;

    DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    @Override
    public String toString() {
        return "DrzewoLisciaste{" +
                "wiecznieZielone=" + wiecznieZielone +
                ", wysokosc=" + wysokosc +
                ", przekrojDrzewa='" + przekrojDrzewa + '\'' +
                ", ksztaltLiscia=" + ksztaltLiscia +
                '}';
    }
}

class DrzewoOwocowe extends Drzewo {
    String nazwaOwoca;

    DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.nazwaOwoca = nazwaOwoca;
    }

    @Override
    public String toString() {
        return "DrzewoOwocowe{" +
                "wiecznieZielone=" + wiecznieZielone +
                ", wysokosc=" + wysokosc +
                ", przekrojDrzewa='" + przekrojDrzewa + '\'' +
                ", nazwaOwoca='" + nazwaOwoca + '\'' +
                '}';
    }
}