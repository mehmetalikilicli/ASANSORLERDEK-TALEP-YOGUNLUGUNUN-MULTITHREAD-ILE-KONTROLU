package yazlab2;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Yazlab2 {

    static int wantToLoginFirstFloor = 0;
    static int wantToLoginSecondFloor = 0;
    static int wantToLoginThirdFloor = 0;
    static int wantToLoginFourthFloor = 0;

    static int onTheFirstFloor = 0;
    static int onTheSecondFloor = 0;
    static int onTheThirdFloor = 0;
    static int onTheFourthFloor = 0;

    static int wantToExitFirstFloor = 0;
    static int wantToExitSeconFloor = 0;
    static int wantToExitThirdFloor = 0;
    static int wantToExitFourthFloor = 0;

    static int i = 0;

    //baştaki asansor ikinci kat id'si
    static int[][] matris = new int[6][5];
    static int elevatorCapacity = 10;

    static int[][] GroundFloorMatris = new int[1000][2];

    public static void main(String[] args) {

        ArrayList<Object> Elevators = new ArrayList<Object>();

        ArrayList<Integer> GroundFloor1 = new ArrayList<Integer>();
        ArrayList<Integer> Groundfloor2 = new ArrayList<Integer>();

        ArrayList<Integer> Asansor1 = new ArrayList<Integer>();
        ArrayList<Integer> Asansor2 = new ArrayList<Integer>();

        //ArrayList<Integer> GroundFloorMatris = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            Elevators.add(makeElevator());
        }

////        Thread elevator1 = new Thread(new Elevator());
////        Thread elevator2 = new Thread(new Elevator());
////        Thread elevator3 = new Thread(new Elevator());
////        Thread elevator4 = new Thread(new Elevator());
////        Thread elevator5 = new Thread(new Elevator());
        Random random = new Random();

        Thread Login = new Thread(new Runnable() {

            public void run() {

                while (true) {

                    int wantToLogin = random.nextInt(10) + 1;
                    int wantToLoginFloor = random.nextInt(4) + 1;

                    GroundFloor1.add(wantToLogin);
                    Groundfloor2.add(wantToLoginFloor);

                    System.out.println("");

                    if (wantToLoginFloor == 1) {
                        wantToLoginFirstFloor += wantToLogin;
                    } else if (wantToLoginFloor == 2) {
                        wantToLoginSecondFloor += wantToLogin;

                    } else if (wantToLoginFloor == 3) {
                        wantToLoginThirdFloor += wantToLogin;

                    } else if (wantToLoginFloor == 4) {
                        wantToLoginFourthFloor += wantToLogin;

                    }
                    System.out.println("Birinci kata çıkmak isteyenlerin toplam sayisi : " + wantToLoginFirstFloor);
                    System.out.println("İkinci kata çıkmak isteyenlerin toplam sayisi : " + wantToLoginSecondFloor);
                    System.out.println("Üçüncü kata çıkmak isteyenlerin toplam sayisi : " + wantToLoginThirdFloor);
                    System.out.println("Dördüncü kata çıkmak isteyenlerin toplam sayisi : " + wantToLoginFourthFloor);

                    System.out.println(wantToLogin + "  kişi " + wantToLoginFloor + " . kata girmek istiyor");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Yazlab2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        });

        Thread Exit = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {

                    int wantToExit = random.nextInt(10) + 1;
                    int wantToExitFloor = random.nextInt(4) + 1;

                    if (wantToExitFloor == 1) {
                        System.out.println(wantToExit + "  kişi " + wantToExitFloor + ". kattan çıkmak istiyor");

                    }
                    if (wantToExitFloor == 2) {
                        System.out.println(wantToExit + "  kişi " + wantToExitFloor + ". kattan çıkmak istiyor");

                    }
                    if (wantToExitFloor == 3) {
                        System.out.println(wantToExit + "  kişi " + wantToExitFloor + ". kattan çıkmak istiyor");

                    }
                    if (wantToExitFloor == 4) {
                        System.out.println(wantToExit + "  kişi " + wantToExitFloor + ". kattan çıkmak istiyor");

                    }

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Yazlab2.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }
        });

        //Thread Elevator1 = new Thread(new Elevator());
        Thread Elevator2 = new Thread(new Runnable() {

            @Override
            public void run() {
                int toplam = 0;

                while (true) {

                    System.out.println("Sunlar asansore alındı  ... ");

                    for (int i = 0; GroundFloor1.get(i) != null; i++) {
                        toplam += GroundFloor1.get(i);
                        if (toplam < 20) {

                            Asansor1.set(i, GroundFloor1.get(i));
                            Asansor2.set(i, Groundfloor2.get(i));
                            GroundFloor1.remove(i);
                            Groundfloor2.remove(i);
                        }
                    }

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Elevator.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }
        });
//        Thread Elevator11 = new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                while (true) {
//
//                    int a = Elevators.get(2).Destination;
//
//                    if +wantToLoginFirstFloor <= 10) {
//                        onTheFirstElevator += wantToLoginFirstFloor;
//                        matris[1][1] = wantToLoginFirstFloor;
//                        wantToLoginFirstFloor = 0;
//                    } else {
//                        matris[1][1] = 10 - (onTheFirstElevator);
//                        wantToLoginFirstFloor = (onTheFirstElevator + wantToLoginFirstFloor) - 10;
//                        onTheFirstElevator = 10;
//                    }
//
//                    if (onTheFirstElevator + wantToLoginSecondFloor <= 10) {
//                        onTheFirstElevator += wantToLoginSecondFloor;
//                        matris[1][2] = wantToLoginSecondFloor;
//                        wantToLoginSecondFloor = 0;
//
//                    } else {
//                        matris[1][2] = 10 - (onTheFirstElevator);
//                        wantToLoginSecondFloor = (onTheFirstElevator + wantToLoginSecondFloor) - 10;
//                        onTheFirstElevator = 10;
//
//                    }
//
//                    if (onTheFirstElevator + wantToLoginThirdFloor <= 10) {
//                        onTheFirstElevator += wantToLoginThirdFloor;
//                        matris[1][3] = wantToLoginThirdFloor;
//                        wantToLoginThirdFloor = 0;
//                    } else {
//                        matris[1][3] = 10 - (onTheFirstElevator);
//                        wantToLoginThirdFloor = (onTheFirstElevator + wantToLoginThirdFloor) - 10;
//                        onTheFirstElevator = 10;
//
//                    }
//
//                    if (onTheFirstElevator + wantToLoginFourthFloor <= 10) {
//                        onTheFirstElevator += wantToLoginFourthFloor;
//                        matris[1][4] = wantToLoginFourthFloor;
//                        wantToLoginFourthFloor = 0;
//                    } else {
//                        matris[1][4] = 10 - (onTheFirstElevator);
//                        wantToLoginFourthFloor = (onTheFirstElevator + wantToLoginFourthFloor) - 10;
//                        onTheFirstElevator = 10;
//
//                    }
//
//                }
//            }
//        });
        Login.start();
        Exit.start();
        Elevator2.start();

        try {

            Login.join();
            Exit.join();
            Elevator2.join();

        } catch (InterruptedException ex) {
            Logger.getLogger(Yazlab2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void elevatorMove() {
        System.out.println("sadf");
    }

    public static Thread makeElevator() {
        Thread A = new Thread(new Elevator());
        return A;
    }

    public static Elevator TakeCustomer(Elevator elevator, int wantToLogin, int wantToLoginFloor) {

        return elevator;

    }

}
