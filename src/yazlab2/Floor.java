package yazlab2;

public class Floor {

    private int kattakiler = 0;
    private int katNo;
    public Floor() {
    }

    public Floor(int kattakiler,int katNo) {
        this.kattakiler = kattakiler;
        this.katNo =katNo;
        System.out.println(katNo+"'daki kişi sayisi : "+ kattakiler);
    }

}
